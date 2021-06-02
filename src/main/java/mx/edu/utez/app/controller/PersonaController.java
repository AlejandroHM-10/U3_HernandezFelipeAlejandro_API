package mx.edu.utez.app.controller;

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

import mx.edu.utez.app.entity.Persona;
import mx.edu.utez.app.service.PersonaService;

@RestController
@RequestMapping("/apiRest/persona")
public class PersonaController {

	@Autowired PersonaService personaService;
	
	@GetMapping("/getAll")
	public List<Persona> getAll(){
		return personaService.findAll();
	}
	
	@GetMapping("/get/{id}")
	public Persona get(@PathVariable long id){
		return personaService.findOne(id);
	}
	
	@PostMapping("/registrar")
	public Persona save(@RequestBody Persona persona) {
		try {
			return personaService.save(persona);
		}catch(Exception e){
			return persona;
		}
	}
	@PutMapping("/update")
	public Persona actualizar(@RequestBody Persona persona) {
		try {
			return personaService.save(persona);
		}catch(Exception e){
			return persona;
		}
	}
	@DeleteMapping("/delete/{id}")
	public boolean eliminar(@PathVariable int id) {
		try {			
			personaService.delete(id);
				return true;
			
		}catch(Exception e) {
			return false;
		}
	}
}
