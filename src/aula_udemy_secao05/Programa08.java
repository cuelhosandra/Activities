package aula_udemy_secao05;
//FOR
import java.util.Scanner;

public class Programa08 {
	// DO WHILE:
		public static void main(String[] args) {
		
			int idade;
			String nome;
			
			Scanner scan = new Scanner(System.in);
			
			do {
				
				System.out.println("Informe seu nome: ");
				nome = scan.nextLine();
				
				System.out.println("Informe sua idade: ");
				idade = Integer.parseInt(scan.nextLine());
				
				System.out.println(nome + " tem " + idade + " anos");
				
				
			}while (idade > 0);
					
			scan.close();
		}

	}
