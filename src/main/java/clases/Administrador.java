package clases;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class Administrador extends Usuario {

	public Administrador(String n, String c) {
		super(n, c);
		// TODO Auto-generated constructor stub
	}

	public Administrador() {
		// TODO Auto-generated constructor stub
	}

}
