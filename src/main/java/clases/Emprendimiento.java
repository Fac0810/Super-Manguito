package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Emprendimiento {

	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	private String url;
	private String descripcion;
	private BufferedImage banner;
	private boolean mostTopDonors;
	private boolean mostCantManguitos;
	private float PrecioManguito;
	private float PrecioBeneficio;
	private String descripcionBeneficio;
	private ArrayList<String> redes;
	
	@ManyToMany
	private List<Categoria> categorias;
	
	@OneToMany
	private List<Post> posteos;
	
	@OneToMany
	private List<DonacionPlan> donacionesPlan;
	
	@OneToMany
	private List<DonacionManguito>donacionesManguito;
	
	@OneToOne
	private Emprendedor emprendedor; 
	
	public Emprendimiento() {
		// TODO Auto-generated constructor stub
	}

}
