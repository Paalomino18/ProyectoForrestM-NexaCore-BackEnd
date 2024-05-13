package co.edu.unbosque.NEXACOREFORRESTMBACKEND.api;


import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.NEXACOREFORRESTMBACKEND.dao.PistaMusicalDAO;
import co.edu.unbosque.NEXACOREFORRESTMBACKEND.model.PistaMusical;

@RestController
@RequestMapping("pistas")
public class PistaMusicalAPI {
	
	@Autowired
	private PistaMusicalDAO pistaDAO;
	
	@PostMapping("/guardar")//Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody PistaMusical pista) {
		pistaDAO.save(pista);
	}
	
	@GetMapping("/listar")
	public List<PistaMusical> listar(){
		return pistaDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{nombre}")
	public void eliminar(@PathVariable("nombre") String nombre) {
		pistaDAO.deleteById(nombre);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody PistaMusical pista) {
		pistaDAO.save(pista);
	}
	
	

}
