package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
public class Donacion {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDonacion;
	private String nombre;
	private String mail;
	private String mensaje;
	
	public Donacion() {
		// TODO Auto-generated constructor stub
	}

}
