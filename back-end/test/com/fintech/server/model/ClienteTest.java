package com.fintech.server.model;


public class ClienteTest {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Pérez", "12345678", 1, "juan@example.com", "password123");

        assert cliente.getNombre().equals("Juan") : "Nombre incorrecto";
        assert cliente.getApellido().equals("Pérez") : "Apellido incorrecto";
        assert cliente.getDni().equals("12345678") : "DNI incorrecto";
        assert cliente.getId() == 1 : "ID incorrecto";
        assert cliente.getEmail().equals("juan@example.com") : "Email incorrecto";
        assert cliente.getPassword().equals("password123") : "Password incorrecto";

        System.out.println("✅ Todos los tests pasaron.");
    }
}
