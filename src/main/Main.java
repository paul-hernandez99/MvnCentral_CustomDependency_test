package main;

import main.java.io.github.paulHernandez99.dataStructures.Persona;

public class Main {

public static void main(String [] args) {

	Persona persona = new Persona("paul", 21, 72595701);
	System.out.println("Nombre: "+persona.getNombre()+"\nEdad: "+persona.getEdad()+"\nDNI: "+persona.getDni());
	System.out.println("Programa exitoso!");
}

}