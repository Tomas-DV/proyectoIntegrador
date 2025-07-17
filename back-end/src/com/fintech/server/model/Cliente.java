package com.fintech.server.model;

//SUBCLASE;

public class Cliente extends Persona { // INICIO CLASE CLIENTE;

	// ESTADO: ATRIBUTOS;
	private int id;
	private String email;
	private String password;

	// COMPORTAMIENTO: CONSTRUCTORES - GETTERS Y SETTERS - MÉTODOS;
	public Cliente() {

	}

	public Cliente(String nombre, String apellido, String dni, int id, String email, String password) {
		super(nombre, apellido, dni);
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return this.id;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

} // FIN CLASE CLIENTE;
