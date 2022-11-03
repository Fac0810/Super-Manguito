package clases;

import java.awt.image.BufferedImage;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private Long id;
	private String mensaje;
	private BufferedImage imagen;
	private Date fecha;
	
	public Post() {
		// TODO Auto-generated constructor stub
	}

}
