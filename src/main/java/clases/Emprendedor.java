package clases;
import javax.persistence.*;

@Entity
public class Emprendedor extends Usuario {
	
	@OneToOne
	private Emprendimiento emprendimiento;
	
	
	public Emprendedor(String n, String c) {
		super(n,c);
		// TODO Auto-generated constructor stub
	}

	public Emprendedor() {
		// TODO Auto-generated constructor stub
	}
	
	public void setEmprendimiento(Emprendimiento e) {
		this.emprendimiento=e;
	}
	
	public Emprendimiento getEmprendimiento() {
		return this.emprendimiento;
	}

}
