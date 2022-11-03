package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DonacionManguito extends Donacion {
	

	private int cantidadManguito;
	private float precioManguito;
	
	public DonacionManguito() {
		
	}
	
	private void setCantidadManguito(int cantidadManguito) {
		this.cantidadManguito=cantidadManguito;
	}
	private void setPrecioManguito(float precioManguito) {
		this.precioManguito=precioManguito;
	}
	private int getCantidadManguito() {
		return cantidadManguito;
	}
	private float getPrecioManguito() {
		return cantidadManguito;
	}
}
