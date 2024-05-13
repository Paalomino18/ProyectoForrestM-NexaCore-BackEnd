package co.edu.unbosque.NEXACOREFORRESTMBACKEND.model;


import jakarta.persistence.Entity; 
import jakarta.persistence.Id;

@Entity
public class Emisora {
	
	@Id
	private String nombre;
	private String modo_transmision;
	private String tipo_musica;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModo_transmision() {
		return modo_transmision;
	}
	public void setModo_transmision(String modo_transmision) {
		this.modo_transmision = modo_transmision;
	}
	public String getTipo_musica() {
		return tipo_musica;
	}
	public void setTipo_musica(String tipo_musica) {
		this.tipo_musica = tipo_musica;
	}
	
	

}
