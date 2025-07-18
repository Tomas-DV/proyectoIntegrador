package com.fintech.server.model;

//SUPER CLASE;

public abstract class Persona { // INICIO CLASE PERSONA;

	// ESTADO: ATRIBUTOS;
	private String nombre;
	private String apellido;
	private String dni;

	// COMPORTAMIENTO: CONSTRUCTORES - GETTERS Y SETTERS - MÉTODOS;
	// CONSTRUCTOR POR DEFECTO;
	public Persona() {

	}

	// CONSTRUCTOR PARAMETRIZADO;
	public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	// GETTERS Y SETTERS;
	// NOMBRE;
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre){
       this.nombre = nombre;
	}

	// APELLIDO;
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	// DNI;
	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni){
		this.dni = dni;
	}

} // FIN CLASE PERSONA;