package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "iddonacionplan")
public class DonacionPlan extends Donacion {
	
	private float precioDonacion;

	private void setPrecioDonacion(float precioDonacion) {
		this.precioDonacion=precioDonacion;
	}
	
	private float getPrecioDonacion() {
		return precioDonacion;
	}
}
