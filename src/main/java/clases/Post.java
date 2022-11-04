
package clases;
import java.awt.image.BufferedImage;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
<<<<<<< HEAD
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class Post {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPost;
	private String mensaje;
	private byte[] imagen;
=======
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
	
	public void setMensaje(String mensaje) {
		this.mensaje=mensaje;
	}
	public String getMensaje() {
		return mensaje;
	}
	
	public void setImagen(byte[]imagen) {
		this.imagen=imagen;
	}
	
	public byte[] imagen() {
		return imagen;
	}

	public Date getFecha() {
		return fecha;
	}
=======

>>>>>>> cc853730ba5503e8e8fa652c037021cf4b97c830
}
