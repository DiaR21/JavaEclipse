package com.generation.animales;

public class Perro extends Animal implements Mascotas, Jugar {

	public void jugar(){
		System.out.println("Estoy jugando con la pelota");	}

	public void correr(){
		System.out.println("Estoy corriendo tras un auto");	}
	public void baniar(){
		System.out.println("Me gusta el agua");	}
	

}
