package co.edu.unbosque.NEXACOREFORRESTMBACKEND.model;

import java.util.List; 

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity; 
import jakarta.persistence.Id;


@Entity
public class ProgramacionDiaria {
@Id
private String fechaProg;
@ElementCollection
private List<String> listaCanciones;

public ProgramacionDiaria() {
	// TODO Auto-generated constructor stub
}



public String getFechaProg() {
	return fechaProg;
}

public void setFechaProg(String fechaProg) {
	this.fechaProg = fechaProg;
}

public List<String> getListaCanciones() {
	return listaCanciones;
}

public void setListaCanciones(List<String> listaCanciones) {
	this.listaCanciones = listaCanciones;
}


}
