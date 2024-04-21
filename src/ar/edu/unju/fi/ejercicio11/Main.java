package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2, j;
		int des = 1;
		int val = 0;
		boolean band = true;
		
		
		for(j=40 ; j>=0 ; j--) {
			
			if(band) {
				val= j*i;
				band=false;
				des = des + i;
			}
			else {
				System.out.print(val+" ");
				
				val = val + (40-des);
				
				des = des + i;
			}
		}
	}

}