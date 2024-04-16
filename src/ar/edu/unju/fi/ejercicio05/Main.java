package ar.edu.unju.fi.ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entre [1 y 9] para mostrar su tabla de multiplicar");
		Integer numero = scanner.nextInt();
		scanner.close();
		if (numero>0 & numero<10)
			
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + "x" + i + "= " + numero*i);
		}
			else
		System.out.println("Debe ingresar un valor entre 1 y 9");
		
		
	}

}
