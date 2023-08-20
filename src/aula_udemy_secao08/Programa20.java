package aula_udemy_secao08;
//FUNÇÕES

//PROGRAMA QUE USUÁRIO CADASTRA VÁRIAS FRUTAS E NO FINAL, PRECISA MOSTRAR AS FRUTAS CADASTRADAS PELA ORDEM CONTRÁRIA

import java.util.Scanner;
public class Programa20 {
	
	//O QUE UMA FUNÇÃO PRECISA TER?
	
	// A) Tipo de retorno (void: sem retorno);
	// B) Nome. Ex.: fazerAlgo();
	// C) Parâmetros/Argumentos de entrada (fica dentro dos parenteses. Ex.:
	// fazerAlgo(String fazendoAlgo) {} 
	// D) Retorno
	public static void main(String[] args) {
				
		cadastrarDados();
	
	}
	
	static void cadastrarDados() {
		
		Scanner sc = new Scanner(System.in);
	    String frutas[];
		
		System.out.println("Informe a quantidade de frutas para cadastrar:");
		int qtd = Integer.parseInt(sc.nextLine());
		
		frutas = new String[qtd];
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Informe o nome da fruta: ");
			frutas[i] =  sc.nextLine();
			
		
			}
		
		//O ÍNDICE DO ÚLTIMO ELEMENTO É QTD - 1
		for (int i = qtd - 1; i >= 0; i--) {
			System.out.println(frutas[i]);
			
		}
	}

}
