package Clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy= InheritanceType.JOINED)

public  class Usuario {
	@Id
	@GeneratedValue
	private Long id;
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
