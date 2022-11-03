package clasesDAO;

public class DAOFactory {
	public static EmprendedorDAOHibernateJPA getEmprendedor() {
		return new EmprendedorDAOHibernateJPA();
	}
}
