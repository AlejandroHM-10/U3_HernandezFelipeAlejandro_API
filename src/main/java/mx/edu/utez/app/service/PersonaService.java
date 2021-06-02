package mx.edu.utez.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.app.entity.Persona;
import mx.edu.utez.app.repository.PersonaRepository;

@Service
@Transactional
public class PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	public List<Persona> findAll(){
		return personaRepository.findAll();
	}
	
	public Persona findOne(long id) {
		return personaRepository.findById(id).get();
	}

	public boolean delete(long id) {
		personaRepository.deleteById(id);
		return !personaRepository.existsById(id);
	}
	
	public Persona update(Persona persona) {
		return personaRepository.save(persona);
	}
	
	public Persona save(Persona persona) {
		return personaRepository.save(persona);
	}

}
