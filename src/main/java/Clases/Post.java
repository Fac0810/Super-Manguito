package Clases;

import java.awt.image.BufferedImage;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Post {
	private String mensaje;
	private BufferedImage imagen;
	private Date fecha;
	
	public Post() {
		// TODO Auto-generated constructor stub
	}

}
