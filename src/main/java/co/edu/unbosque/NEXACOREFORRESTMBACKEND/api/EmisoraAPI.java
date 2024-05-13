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

import co.edu.unbosque.NEXACOREFORRESTMBACKEND.dao.EmisoraDAO;
import co.edu.unbosque.NEXACOREFORRESTMBACKEND.model.Emisora;


@RestController
@RequestMapping("emisoras")
public class EmisoraAPI {
	
	@Autowired
	private EmisoraDAO emisoraDAO;
	
	@PostMapping("/guardar")//Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody Emisora emisora) {
		emisoraDAO.save(emisora);
	}
	
	@GetMapping("/listar")
	public List<Emisora> listar(){
		return emisoraDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{nombre}")
	public void eliminar(@PathVariable("nombre") String nombre) {
		emisoraDAO.deleteById(nombre);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Emisora emisora) {
		emisoraDAO.save(emisora);
	}
	
	

}
