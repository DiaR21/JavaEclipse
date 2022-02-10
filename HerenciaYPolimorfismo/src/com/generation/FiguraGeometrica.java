package com.generation;

public abstract class FiguraGeometrica {	/*La clase abstracta sirve para ser una superclase y heredar atributos y metodos, pero no puede crearse objetos de ella*/
	protected String nombre;
	protected float alto;
	protected float ancho;
	
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	protected abstract float calcularArea();	/*Método abstracto, existe pero no tiene funcionalidad hasta que se defina por las subclases*/
	protected abstract float calcularPerimetro();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return this.alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getAncho() {
		return this.ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
}
