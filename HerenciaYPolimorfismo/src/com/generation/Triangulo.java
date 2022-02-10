package com.generation;

public class Triangulo extends FiguraGeometrica {
	public Triangulo() {
		super("Triangulo");
	}
	@Override
	public float calcularArea() {	/*Metodo heredado pero cambia de comportamiento cuando es de clase triangulo*/
		return (this.getAlto()*this.getAncho())/2;	/*Tambien se puede usar alto y ancho porque son protected*/
	}
	@Override
	protected float calcularPerimetro() {
		return (2*alto + ancho);
	}
}
