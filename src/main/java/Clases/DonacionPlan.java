package Clases;

import javax.persistence.Entity;

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
