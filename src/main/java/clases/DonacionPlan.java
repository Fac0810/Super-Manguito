package clases;
import clases.Donacion;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@DiscriminatorValue(value="p")
public class DonacionPlan extends Donacion {
	
	private float precioDonacion;
	
	public DonacionPlan(){
		
	}

}