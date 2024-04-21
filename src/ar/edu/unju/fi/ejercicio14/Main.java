package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		boolean band = false;
		int val=0;
		do {
			System.out.println("Ingrese el tamaño del arreglo: ");
			val = scanner.nextInt();
				if(val >=3 && val <=10) {
					band=true;
				}
				else {
					band=false;
				}	
		}while(!band);
		
		int[] numeros = new int[val];
		int i = 0;
		int s = 0 ;
		while(band) {
			System.out.println("Ingrese un numero: ");
			int n = scanner.nextInt();
			scanner.nextLine();
			numeros[i] = n;
			s +=n;
			System.out.println("Posicion ["+i+"] : "+n);
			System.out.println("Total : "+s);
			i++;
			if(i==val) {
				band=false;
			}
		}
		scanner.close();
	
	}

}

