package ClasesDAO;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class EMF {
	private static final EntityManagerFactory em=Persistence.createEntityManagerFactory("grupo1");
	
	public static EntityManagerFactory getEMF() {
		return em;
	}
	
}
