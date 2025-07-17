package com.fintech.server;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {

		try {
			ServerConfig serverConfig = new ServerConfig();
			serverConfig.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
