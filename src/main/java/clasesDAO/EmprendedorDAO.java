package clasesDAO;
import clases.Emprendedor;
public interface EmprendedorDAO extends GenericDAO<Emprendedor> {
	public Emprendedor recuperarEmprendedor(String username);
}
