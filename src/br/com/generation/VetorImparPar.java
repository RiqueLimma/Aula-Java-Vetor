package br.com.generation;

import java.util.Scanner;

public class VetorImparPar {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		int [] valor = new int [6];
		int soma =0;
		int par, impar; 
		int i;
		int qtd = 0, x = 0;
		 
		 
		
		for (i = 0; i < valor.length; i++) {
			System.out.printf("Informe o numero : ", i + 1);
			valor[i] = ler.nextInt();
			
			if(valor[i] %2 == 1) {
				soma += valor[i];
				qtd++;
				par = valor[i];
					}
				}
		System.out.println("Resultado da Soma de Números Pares ==> " + soma);
		System.out.println("Quantidade de Ímpar Digitado ==> " + qtd);
	}

}
