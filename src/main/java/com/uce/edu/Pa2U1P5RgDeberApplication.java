package com.uce.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5RgDeberApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5RgDeberApplication.class, args);
		dibujarCruz();
		System.out.println("\n");
		dibujarCuadrado(6);
		System.out.println("\n");
		dibujarTriangulo(7);
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
	
	public static void dibujarCuadrado(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("R");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
	
	public static void dibujarTriangulo(int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k < (altura - i) * 2 - 1; k++) {
                System.out.print("R");
            }

            System.out.println();
        }
    }
}
