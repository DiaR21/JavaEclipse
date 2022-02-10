package com.generation;

public class Cuadrado extends FiguraGeometrica {
	public Cuadrado() {
		super("Cuadrado");
	}

	@Override
	protected float calcularArea() {
		return this.alto*this.ancho;
	}

	@Override
	protected float calcularPerimetro() {
		return (2*this.alto + 2*this.ancho);
	}
}
