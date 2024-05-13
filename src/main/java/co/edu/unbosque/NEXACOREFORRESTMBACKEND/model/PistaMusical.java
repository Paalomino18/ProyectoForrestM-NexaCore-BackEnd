package co.edu.unbosque.NEXACOREFORRESTMBACKEND.model;

import jakarta.persistence.Entity; 
import jakarta.persistence.Id;

@Entity
public class PistaMusical {
	
	
	private String genero;
	@Id
	private String nombre;
	private String nombre_artista;
	private String nombre_archivo;
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre_artista() {
		return nombre_artista;
	}
	public void setNombre_artista(String nombre_artista) {
		this.nombre_artista = nombre_artista;
	}
	public String getNombre_archivo() {
		return nombre_archivo;
	}
	public void setNombre_archivo(String nombre_archivo) {
		this.nombre_archivo = nombre_archivo;
	}

	
	
}

