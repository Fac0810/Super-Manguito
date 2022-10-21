package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Clases.Emprendedor;
import ClasesDAO.DAOFactory;
import ClasesDAO.EmprendedorDAOHibernateJPA;

public class PruebaEmprendedor {
	public static void main(String[]args) {
		Emprendedor e1 = new Emprendedor("maria", "m1");
		Emprendedor e2 = new Emprendedor("Juan","j1");
		
		//persistencia
		EmprendedorDAOHibernateJPA emprendedoresDaoHibernateJPA = DAOFactory.getEmprendedor();
		emprendedoresDaoHibernateJPA.persist(e1);
		emprendedoresDaoHibernateJPA.persist(e2);
		
	}
}
