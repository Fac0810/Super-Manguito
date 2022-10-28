package prueba;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Inicializador
 *
 */
@WebListener
public class Inicializador implements ServletContextListener {

	
	 public void contextDestroyed(ServletContextEvent sce) { }

	 public void contextInitialized(ServletContextEvent sce) {
	// Se leen parametros de inicializacion de la aplicación
	//String peli1 = sce.getServletContext().getInitParameter("sala1");

	// Se guardan en el contexto, las peliculas en Cartelera
	ServletContext contexto = sce.getServletContext();
	//contexto.setAttribute("sala1", peli1);
	 }
    /**
     * 
     * Default constructor. 
     */
    public Inicializador() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */

	
}
