package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner Scanner = new Scanner(System.in);
			
			String[] nom = new String[5];
			for(int i=0;i<nom.length;i++) {
				System.out.println("Ingrese un nombre: ");
					String name = Scanner.next();
					nom[i] = name;
			}
			System.out.println("El tamaño del arreglo: "+nom.length);
			
			int val;
			do {
				int n = nom.length;
				mostrarDatos(nom,n);
				System.out.println("Desea eliminar un nombre? 1-Si // 2-No");
				val = Scanner.nextInt();
				Scanner.nextLine();
					if(val==1) {
						System.out.println("Ingrese la posicion del nombre a eliminar: ");
						byte pos = Scanner.nextByte();
						quitarNombre(nom,pos);
						if(nom[0]=="") {
							System.out.println("Se elimino el ultimo Nombre");
						}
					}
					else {
						System.out.println("El programa termino");
					}
					if(nom[0]=="") {
						System.out.println("Sin nombres");
						val=2;
					}
			}while(val==1);
	
	}
	
	
	static void mostrarDatos(String[] nombres, int k){
		int i = 0;
		while(i<k) {
			System.out.println("Posicion ["+i+"] : "+nombres[i]);
			i++;
		}
	}
	static void quitarNombre(String[] nombres, byte pos) {
		if(pos==0) {
			for(int i = 0; i < nombres.length-1 ; i++) {
				nombres[i] = nombres[i+1];
			}
			nombres[nombres.length-1] = "";
		}
		else {
			if(pos == nombres.length-1) {
				nombres[pos]="";
			}
			else {	
					for(int i=pos ; i<nombres.length-1;i++) {
						nombres[i] = nombres[i+1];
						nombres[i+1] = "";
					}
					
				}
			}
		}
	
}