package Clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue
	private Long id;
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
