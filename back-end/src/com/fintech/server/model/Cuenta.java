package com.fintech.server.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// CLASE CUENTA: CONTENEDOR;
public class Cuenta { // INICIO CLASE CUENTA;

	private long codigoUnico;
	private double saldoInicial;
	private Cliente cliente; // TIPO DE RELACIÓN: ASOCIACIÓN. Cuenta 1 --> 1 Cliente;

	public Cuenta(Cliente cliente) {
		if (cliente == null) {
			throw new IllegalArgumentException("La cuenta debe tener un cliente asociado");
		}
		this.cliente = cliente;
		this.saldoInicial = 0.00;
		this.codigoUnico = generarCodigoUnico();
	}

	// GENERAR CODIGO UNICO;
	private long generarCodigoUnico() {
		// Genera un número aleatorio entre 1000000000 y 9999999999 (10 dígitos)
		long numero = (long) (Math.random() * 9_000_000_000L) + 1_000_000_000L;
		return numero;
	}

	// DEPOSITAR;
	public void depositar(double monto) {
		if (monto <= 0) {
			System.out.println("El monto a depositar debe ser mayor que cero.");
			return;
		}

		double saldoAnterior = saldoInicial;
		saldoInicial += monto;

		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		System.out.println("===== DEPÓSITO REALIZADO =====");
		System.out.println("Fecha de la transacción: " + ahora.format(formato));
		System.out.println("Saldo anterior: $" + saldoAnterior);
		System.out.println("Monto depositado: $" + monto);
		System.out.println("Saldo actualizado: $" + saldoInicial);
		System.out.println("Fecha del depósito: " + ahora.format(formato));
		System.out.println("==============================");
	}

	// RETIRAR;
	public void retirar(double monto) {
		if (monto <= 0) {
			throw new IllegalArgumentException("El monto a retirar debe ser mayor que cero.");
		}

		if (monto > saldoInicial) {
			throw new IllegalArgumentException("Fondos insuficientes. No se puede realizar el retiro.");
		}

		double saldoAnterior = saldoInicial;
		saldoInicial -= monto;

		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		System.out.println("===== RETIRO REALIZADO =====");
		System.out.println("Fecha de la transacción: " + ahora.format(formato));
		System.out.println("Saldo anterior: $" + saldoAnterior);
		System.out.println("Monto retirado: $" + monto);
		System.out.println("Saldo actualizado: $" + saldoInicial);
		System.out.println("Fecha del retiro: " + ahora.format(formato));
		System.out.println("=============================");
	}

// CONSULTAR;
	public void consultarSaldo() {
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		System.out.println("===== CONSULTA DE SALDO =====");
		System.out.println("Fecha de la consulta: " + ahora.format(formato));
		System.out.println("Cliente: " + cliente.getNombre());
		System.out.println("Código de cuenta: " + codigoUnico);
		System.out.println("Saldo actual: $" + saldoInicial);
		System.out.println("==============================");
	}

} // FIN CLASE CUENTA;
