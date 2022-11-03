package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity

public  class Usuario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
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
