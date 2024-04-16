package ar.edu.unju.fi.ejercicio06.main;
import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio06.model.persona;

public class Main {

	public static void main(String[] args) {
		
		
		persona persona1 = generarPersonaPorDefecto();
		persona1.mostrarDatos();
		
		persona persona2 = generarPersonaParametrizado1();
		persona2.mostrarDatos();
		
		persona persona3 = generarPersonaParametrizado2();		
		persona3.mostrarDatos();
		
	}
	
	public static persona generarPersonaPorDefecto() {
		persona persona = new persona();
		String dni = obtenerDni();
		persona.setDni(dni);
		String nombre = obtenerNombre();
		persona.setNombre(nombre);
		LocalDate fechaDeNacimiento = LocalDate.parse(obtenerFechaDeNacimiento());
		persona.setFechaDeNacimiento(fechaDeNacimiento);
		String provincia = obtenerProvincia();
		persona.setProvincia(provincia);
		return persona;
	}
	
	public static persona generarPersonaParametrizado1() {
		String dni = obtenerDni();
		String nombre = obtenerNombre();
		LocalDate fechaDeNacimiento = LocalDate.parse(obtenerFechaDeNacimiento());
		String provincia = obtenerProvincia();
		persona persona = new persona(dni, nombre, fechaDeNacimiento, provincia);
		return persona;
	}
	
	public static persona generarPersonaParametrizado2() {
		String dni = obtenerDni();
		String nombre = obtenerNombre();
		LocalDate fechaDeNacimiento = LocalDate.parse(obtenerFechaDeNacimiento());
		persona persona = new persona(dni, nombre, fechaDeNacimiento);
		return persona;
	}
	
	static Scanner scanner = new Scanner(System.in);
	
	public static String obtenerDni() {
		System.out.println("Ingrese DNI");
		String dni = scanner.nextLine();
		return dni;
	}
	
	public static String obtenerFechaDeNacimiento() {
		System.out.println("Ingrese fecha de nacimiento");
		System.out.println("Día (Formato DD)");
		String diaNacimiento = scanner.nextLine();
		System.out.println("Mes (Formato MM)");
		String mesNacimiento = scanner.nextLine();
		System.out.println("Año (Formato AAAA)");
		String anioNacimiento = scanner.nextLine();
		String fechaDeNacimiento = anioNacimiento + "-" + mesNacimiento + "-" + diaNacimiento;
		return fechaDeNacimiento;
	}
	
	public static String obtenerNombre() {
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();
		return nombre;
	}
	
	public static String obtenerProvincia() {
		System.out.println("Ingrese provincia");
		String provincia = scanner.nextLine();
		return provincia;
	}
	
}