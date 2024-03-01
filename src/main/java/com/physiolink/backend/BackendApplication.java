package com.physiolink.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.net.URI;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		abrirNavegador("http://localhost:8080");
		SpringApplication.run(BackendApplication.class, args);
	}

	private static void abrirNavegador(String url) {
		try {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
				Desktop.getDesktop().browse(new URI(url));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
