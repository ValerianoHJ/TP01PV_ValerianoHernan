package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[8];
		
		Scanner Scanner = new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Ingrese un numero: ");
			int num = Scanner.nextInt();
			numeros[i] = num;
			System.out.println("El valor en la posicion ("+i+")= "+numeros[i]);
		}
	
	}

}