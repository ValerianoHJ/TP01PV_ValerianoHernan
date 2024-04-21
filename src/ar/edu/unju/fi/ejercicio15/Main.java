package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner Scanner = new Scanner(System.in);
		boolean band = false;
		int val=0;
		do {
			System.out.println("Ingrese el tamaño del arreglo: ");
			val= Scanner.nextInt();
				if(val >=5 && val <=10) {
					band=true;
				}
				else {
					System.out.println("Ingrese un valor entre (5-10)");
					band=false;
				}	
		}while(!band);
		
		String[] nom = new String[val];
		int i = 0;
		while(band) {
			System.out.println("Ingrese un nombre: ");
			String name = Scanner.next();
			Scanner.nextLine();
			nom[i] = name;
			i++;
			if(i==val) {
				band=false;
			}
		}
		Scanner.close();
		for(i=val-1;i>=0;i--) {
			System.out.println("Posicion ["+i+"] : "+nom[i]);
		}
	}

}
