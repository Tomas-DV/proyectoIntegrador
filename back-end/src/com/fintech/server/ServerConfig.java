package com.fintech.server;

import com.fintech.server.handler.ConsultarHandler;
import com.fintech.server.handler.IngresarHandler;
import com.fintech.server.handler.TransferirHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class ServerConfig {
	private HttpServer server;

	public ServerConfig() throws IOException {
		server = HttpServer.create(new InetSocketAddress(8000), 0);
		configureRoutes();
	}

	private void configureRoutes() {
		server.createContext("/transferir", new TransferirHandler());
		server.createContext("/ingresar", new IngresarHandler());
		server.createContext("/consultar", new ConsultarHandler());
	}

	public void start() {
		server.setExecutor(null); // Use default executor
		server.start();
		System.out.println("Servidor iniciado en http://localhost:8000");
	}
}
