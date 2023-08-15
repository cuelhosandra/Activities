import java.util.Scanner;

//FOR
public class Programa09 {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		Scanner scan = new Scanner(System.in);		
	
		//variavel de controle; condição de parada; forma de incremento
		for(int i = 0; i < 5; i++) {				
			System.out.println("Informe seu nome: ");
			nome = scan.nextLine();
			
			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(scan.nextLine());
						
			if(idade > 0);
			System.out.println(nome + " tem " + idade + " anos.");
			
			
			scan.close();
		}
		
	}
	
}
