package com.uce.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5RgDeberApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5RgDeberApplication.class, args);
		dibujarCruz();
	}
	public static void dibujarCruz() {
		int tamaño = 5;

		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				if (i == tamaño / 2 || j == tamaño / 2) {
					System.out.print("R");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
