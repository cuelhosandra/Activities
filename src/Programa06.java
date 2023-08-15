//While, Do While

import java.util.Scanner;

public class Programa06 {
//WHILE:
	public static void main(String[] args) {
	
		int idade = 1;
		String nome;
		
		Scanner scan = new Scanner(System.in);
		
		while(idade > 0) {
			
			System.out.println("Informe seu nome: ");
			//sempre usar nextLINE pois se não, vai pegar somente 1 valor
			nome = scan.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = scan.nextInt();// Dá bug dessa forma
			idade = Integer.parseInt(scan.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos");
			
			
		break;
		}
		
	
		
	}

}
