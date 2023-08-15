package Exercicios;

import java.util.Scanner;
//Leia um numero fornecido pelo usuario. Se eesse n for positivio, calcule a raiz quadrada do numero. Se não, mostre uma msg de numero invalido
public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		int x;
		
		System.out.println("Informe um numero aleatorio: ");
		x = scan.nextInt();		
			
		if (x > 0) {
		System.out.println("A raiz quadrada de " + x + ", eh: " + Math.sqrt(x));		
		}else {
			System.out.println("O numero eh invalido :(");
		}
	}

}
