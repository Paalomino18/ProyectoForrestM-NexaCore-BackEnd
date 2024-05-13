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

import co.edu.unbosque.NEXACOREFORRESTMBACKEND.dao.ProgramacionDiariaDAO;
import co.edu.unbosque.NEXACOREFORRESTMBACKEND.model.ProgramacionDiaria;


@RestController
@RequestMapping("programacion")
public class ProgramacionDiariaAPI {
	
	@Autowired
	private ProgramacionDiariaDAO programacionDAO;
	
	@PostMapping("/guardar")//Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody ProgramacionDiaria programacion) {
		programacionDAO.save(programacion);
	}
	
	@GetMapping("/listar")
	public List<ProgramacionDiaria> listar(){
		return programacionDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{fechaProg}")
	public void eliminar(@PathVariable("fechaProg") String fechaProg) {
		programacionDAO.deleteById(fechaProg);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody ProgramacionDiaria programacion) {
		programacionDAO.save(programacion);
	}
	
	

}
