package aula_udemy_secao13;

import aula_udemy_secao09.Pessoa;

//Classes abstratas
/*
 * É um recurso que proporciona um bloqueio na criação de objetos.
 * 
 * Não é possível criar objetos a partir dela.
 * 
 * Geralmente classes abstratar são classes Super.
 * 
 * Uma classe abstrata pode ter:
 * 	- atributos;
 * 	- Métodos;
 * 	- étodos abstratos;
 * 
 * Métodos abstratos:
 * 	- São metodos que não possuem implementação, possuem apenas declaração
 	- Obrigatoriamente as classes que herdarem desta classe ou método abstrato, precisa implementar esses métodos
 */
public class Programa31 {

	public static void main(String[] args) {
	
		Pessoa maria = new Pessoa("Maria da Silva", "424", "email@e");
		System.out.println(maria);
	}

}
