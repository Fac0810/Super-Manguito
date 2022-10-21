package Clases;

import javax.persistence.Entity;

@Entity
public class Categoria {
	
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
