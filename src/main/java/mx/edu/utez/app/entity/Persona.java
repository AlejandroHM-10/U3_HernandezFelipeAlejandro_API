package mx.edu.utez.app.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String rfc;
	private String curp;
	private String claveElector;
	private String enditdadFederativa;
	private String municipio;
	private String colonia;
	private String calle;
	private int numeroExterior;
	private int numeroInterior;
	private String correo;
	private Date fechaRegistro;

}
