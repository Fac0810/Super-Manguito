package Clases;
//cambios pal commit

import javax.persistence.Entity;

@Entity
public  class Usuario {
	private String nombre;
	private String clave;
	
	public Usuario(String n, String c) {
		this.nombre=n;
		this.clave=c;
	}
	
	public Usuario() {
		
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setClave(String clave) {
		this.clave=clave;
	}
	
	public String getClave() {
		return clave;
	}
	
	
	public boolean validar(String n, String c) {
		return (nombre==n || clave==c);
	}
	}
