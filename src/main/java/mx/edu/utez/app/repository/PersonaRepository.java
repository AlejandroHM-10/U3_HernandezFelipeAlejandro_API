package mx.edu.utez.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utez.app.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
