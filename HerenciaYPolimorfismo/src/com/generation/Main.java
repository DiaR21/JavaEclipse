package com.generation;

public class Main {

	public static void main(String[] args) {
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.setAlto(15f);
		cuadrado1.setAncho(10f);
		System.out.println("El cuadrado con nombre " + cuadrado1.getNombre()+ ", con área de "+ cuadrado1.calcularArea());
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAlto(5f);
		triangulo1.setAncho(2f);
		System.out.println("El triangulo con nombre " + triangulo1.getNombre()+ ", con área de "+ triangulo1.calcularArea());
	}

}
