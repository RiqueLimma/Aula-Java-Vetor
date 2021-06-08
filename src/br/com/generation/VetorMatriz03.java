package br.com.generation;

import java.util.Scanner;

public class VetorMatriz03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double [][] valor = new double [3][3];
		int maiorQ10= 0;
		
			for( int l = 0; l < valor.length; l ++) {
			for(int c = 0; c <= valor[(int) l].length; c++) {
					System.out.printf("Valores:  [%d] [%d]\n\n", l, c);
					valor[l][c]= entrada.nextDouble();
					
					if(valor[l][c] > 10) {
						maiorQ10++;
						}
					System.out.println("Vezes que foi Digitado ==>   " + maiorQ10 + "   Maior que 10" );
				}
		}
			
		
				}
}
