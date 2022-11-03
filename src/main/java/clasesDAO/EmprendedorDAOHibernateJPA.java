package ClasesDAO;

import Clases.Emprendedor;
import Clases.Usuario;

public class EmprendedorDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO {

	@Override
	public Usuario recuperarUsuario(String username) {
		javax.persistence.Query consulta = EMF.getEMF().createEntityManager().
		createQuery("select p from Persona p where p.nombre =?");
		consulta.setParameter(1, username);
		Emprendedor resultado = (Emprendedor)consulta.getSingleResult();
		return resultado;
	}

}
