package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
				Scanner scan = new Scanner(System.in);
				
				double x;
				
				System.out.println("Informe um numero aleatorio: ");
				x = scan.nextDouble();		
					
				if (x > 0) {
				System.out.println("A raiz quadrada de " + x + ", eh: " + Math.sqrt(x));	
				System.out.println("O " + x + " ao quadrado eh: " + Math.pow(x, x));		
				}else {
					System.out.println("Numero invalido :(");
				}
			}
	}

