package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
<<<<<<< HEAD
import javax.persistence.GenerationType;
=======
>>>>>>> cc853730ba5503e8e8fa652c037021cf4b97c830
import javax.persistence.Id;

@Entity
public class Categoria {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCategoria;
	private String nombre;
	private String descripcion;
	
	public Categoria(String n,String d) {
		this.nombre=n;
		this.nombre=d;
	}
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

}
