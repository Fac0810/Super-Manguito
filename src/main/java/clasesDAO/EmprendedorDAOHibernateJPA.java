package clasesDAO;

import clases.Emprendedor;
import clases.Usuario;

public class EmprendedorDAOHibernateJPA extends GenericDAOHibernateJPA<Emprendedor> implements EmprendedorDAO {

	@Override
	public Emprendedor recuperarEmprendedor(String username) {
		javax.persistence.Query consulta = EMF.getEMF().createEntityManager().
		createQuery("select p from Persona p where p.nombre =?");
		consulta.setParameter(1, username);
		Emprendedor resultado = (Emprendedor)consulta.getSingleResult();
		return resultado;
	}

}
