package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	String nome;
	int idade;
	float altura;
	
	public void imprimirDados() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		this.nome = sc.next();
		System.out.println("Qual é a sua idade?");
		this.idade = sc.nextInt();
		System.out.println("E a sua altura?");
		this.altura = sc.nextFloat();
		System.out.println("***IMPRESSÃO DOS SEUS DADOS****");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		
		sc.close();
	}
	

}
