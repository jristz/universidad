package cl.esucomex.sistema.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HolaMundo{
	public static void main(String[] args) throws IOException {
		String nombre;
		BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("¿Cómo te llamas?");
		nombre = bf.readLine();
		System.out.println("¡Hola "+ nombre + "!");
		
		
		//System.out.println("Hola Mundo");
		
		System.out.format("¡Hola %s!%n", nombre);
		
		
	}
}
