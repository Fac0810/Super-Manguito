package ClasesDAO;
import Clases.Usuario;
public interface UsuarioDAO extends GenericDAO<Usuario> {
	public Usuario recuperarUsuario(String username);
}
