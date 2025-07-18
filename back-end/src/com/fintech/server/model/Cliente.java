package com.fintech.server.model;

//SUBCLASE;
public class Cliente extends Persona { // INICIO CLASE CLIENTE;

	// ESTADO: ATRIBUTOS;
	private int id;
	private String email;
	private String password;

	// COMPORTAMIENTO: CONSTRUCTORES - GETTERS Y SETTERS - MÉTODOS;
	// CONSTRUCTOR POR DEFECTO;
	public Cliente() {

	}

	// CONSTRUCTOR PARAMETRIZADO;
	public Cliente(String nombre, String apellido, String dni, int id, String email, String password) {
		super(nombre, apellido, dni);
		this.id = id;
		this.email = email;
		this.password = password;
	}

	// ID;
	public int getId() {
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	// EMAIL;
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	// PASSWORD 
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password){
		this.password = password;
	}

} // FIN CLASE CLIENTE;
