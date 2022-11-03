package ClasesDAO;

import java.io.Serializable;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class GenericDAOHibernateJPA<T> implements GenericDAO<T>{
	
	protected Class<T> persistentClass;
	
	public Class<T> getPersistentClass() {
		return persistentClass;
	}
	
	public T actualizar(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		try {			
			etx.begin();
			T entityMerged = em.merge(entity);
			etx.commit();
			return entityMerged;
		} catch (Exception e) {
			System.out.println("Fallo la transaccion. Ejecuto Rollback");
			etx.rollback();
			throw e;
		}finally {
			em.close();
		}
	}
	
	@Override
	public void borrar(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.remove(em.merge(entity));
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive()) tx.rollback();
			throw e;
		}
		em.close();
	}
	
	@Override
	public T borrar(Serializable id) {
		EntityManager em = EMF.getEMF().createEntityManager();
		T auxEntity = em.find(this.getPersistentClass(), id);
		if (auxEntity !=null) {
			em.remove(auxEntity);
		}
		em.close();
		return auxEntity;
	}
	
	@Override
	public boolean existe(Serializable id) {
		return false;
	}
	
	@Override
	public T persist(T entity) {
		EntityManager em=EMF.getEMF().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(entity);
			tx.commit();
		}
		catch(RuntimeException e){
			if(tx != null && tx.isActive()) tx.rollback();
			throw e;
		}
		return entity;
	}
	
	@Override
	public T recuperar(Serializable id) {
		javax.persistence.Query consulta = EMF.getEMF().createEntityManager().
		createQuery("select p from Persona p where p.nombre =?");
		consulta.setParameter(1, id);
		T resultado = (T)consulta.getSingleResult();
		return resultado;
	}
	
	@Override
	public List<T>recuperarTodos(String column){
		javax.persistence.Query consulta =  EMF.getEMF().createEntityManager().createQuery("select e from"+this.getPersistentClass().getSimpleName()+"e order by e."+column);
		List<T> resultado = (List<T>)consulta.getResultList();
		return resultado;
	}
}
