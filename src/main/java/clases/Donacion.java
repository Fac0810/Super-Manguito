package Clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public abstract class Donacion {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	private String mail;
	private String mensaje;
	
	public Donacion() {
		// TODO Auto-generated constructor stub
	}

}
