package br.com.generation;

import java.util.Scanner;

/*Vetores e matrizes - Java: 4

4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
	(1) somar as duas matrizes 
	(2) subtrair a primeira matriz da segunda 
	(3) adicionar uma constante as duas matrizes
	(4) imprimir as matrizes 
	Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor 
	da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/

public class EX04 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double [][] n1 = new double[2][2];
		double [][] n2 = new double[2][2];
		double [][] nR = new double[2][2];
		
		int numero = 0;
		int constante = 0;
		int usuario = 0;
		
		System.out.println("Percorendo a Matriz 2 x 2: ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				n1[l][c] = ler.nextDouble();
			}
		}
				
		System.out.println("\nPercorendo a segunda matriz 2x2: ");
		
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				n2[l][c] = ler.nextDouble();
			}
		}
				//Menu
				System.out.println("==================================================================");
				System.out.println("Escolha uma das opções abaixo: ");
				System.out.println("DIGITE 1 para somar ====>\nDIGITE 2 para subtrair primeira matriz da segunda"
						+ "\nDIGITE 3 para adicionar uma constante as duas matrizes\nDIGITE 4 para imprimir as matrizes");
				usuario = ler.nextInt();
				
				switch (usuario){
				case 1:
					for(int l=0; l < 2; l++) {
						for (int c = 0; c < 2; c++) {
							nR[l][c] = n1[l][c] + n2[l][c];
						}
					}
					
					System.out.println("\n\n========Matriz resultado da primeira opcao da soma\n\n "  + "\n\nsomas da duas matrizes ==========\n ");
					for(int l=0; l < 2; l++) {
						for (int c = 0; c < 2; c++) {
							System.out.printf("\t %.2f \t", nR[l][c]);
							break;
								}
							}
					case 2:
						for(int l=0; l < 2; l++) {
						for (int c = 0; c < 2; c++) {
							nR[l][c] = n2[l][c] - n1[l][c];
							
							System.out.printf("\t %.2f \t", nR[l][c]);
						
							break;
						}
					}
						
						System.out.println("\n\n=========Matriz resultante da subtração (n2 - n1)=========\n ");
					for(int l=0; l < 2; l++) {
						for (int c = 0; c < 2; c++) {
						
						}
						System.out.println("--------------------------------------------------------");
					}
					break;
					
				case 3:
					
					System.out.println("Digite a constante: ");
					constante = ler.nextInt();
					for(int l=0; l < 2; l++) {
						for (int c = 0; c < 2; c++) {
							n1[l][c] = n1[l][c] + constante;
								System.out.println("\nMatrizes resultantes da adição da constante: ");
								System.out.println("n1:");
							
							}
						}
					for(int l=0; l < 2; l++) {
						for (int c = 0; c < 2; c++) {
							System.out.printf("\t %.2f \t", n1[l][c]);
							}
					}
						for(int l = 0; l < 2; l++) {
						for (int c = 0; c < 2; c++) {
							System.out.printf("\t %.2f \t", n2[l][c]);
					break;
						}
					}
				case 4:
						for(int l=0; l < 2; l++) {
							for (int c = 0; c < 2; c++) {
								System.out.printf("\t %.2f \t", n1[l][c]);
							}
						}
						System.out.println("\nN2:");
						for(int l=0; l < 2; l++) {
						for (int c = 0; c < 2; c++) {
								System.out.printf("\t %.2f \t", n2[l][c]);
							}
						}
					break;
				default:
					System.out.println("Opção Ínvalida!");
				break;	
				}
					
			}
			
	}

	


					
				
			
		
	

				
				

			
			
			
		
			
			
			


