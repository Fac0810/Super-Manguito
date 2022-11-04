package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sound.midi.SysexMessage;

import clases.Emprendedor;
import clases.Emprendimiento;
import clases.Post;
import clasesDAO.DAOFactory;
import clasesDAO.EmprendedorDAOHibernateJPA;
import clasesDAO.EmprendimientoDAOHibernateJPA;
import clasesDAO.PostDAOHibernateJPA;
//que onda
public class PruebaEmprendedor {
	public static void main(String[]args) {
		Emprendedor e1 = new Emprendedor("maria", "m1");
		EmprendedorDAOHibernateJPA emprendedoresDaoHibernateJPA = DAOFactory.getEmprendedor();
		e1=emprendedoresDaoHibernateJPA.persist(e1);
		
		Emprendimiento e= new Emprendimiento("oasis");
		e.setEmprendedor(e1);
		EmprendimientoDAOHibernateJPA emprendimientoDAOHibernateJPA = DAOFactory.getEmprendimiento();		
		e=emprendimientoDAOHibernateJPA.persist(e);
		e1.setEmprendimiento(e);
		emprendedoresDaoHibernateJPA.actualizar(e1);
		/*PostDAOHibernateJPA postDAOHibernateJPA = DAOFactory.getPost();
		Post p = new Post();
		p.setMensaje("Hola");
		postDAOHibernateJPA.persist(p);*/
		
		
		
		
	}
}
