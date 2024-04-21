package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scanner = new Scanner (System.in);
		
		System.out.println("Ingrese el nombre: ");
		String nombre = Scanner.next();
		System.out.println("Ingrese el año de nacimiento: ");
		int anio = Scanner.nextInt();
		System.out.println("Ingrese el mes de nacimiento: ");
		int mes = Scanner.nextInt();
		System.out.println("Ingrese el dia de nacimiento: ");
		int dia = Scanner.nextInt();
		Scanner.nextLine();
		persona persona = new persona();
		persona.setNombre(nombre);
		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(anio, mes, dia);
		persona.setFechaNacimiento(fechaNacimiento);
		
		persona.motrarDatos();
		
		
	}

}