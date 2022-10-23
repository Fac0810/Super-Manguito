package Clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DonacionPlan extends Donacion {
	

	private float precioDonacion;

	private void setPrecioDonacion(float precioDonacion) {
		this.precioDonacion=precioDonacion;
	}
	
	private float getPrecioDonacion() {
		return precioDonacion;
	}
}
