package aula_udemy_secao09;
/* Construtor:
 *  
 * É o método especial que constrói a instância do objeto
 * Ele SEMPRE tem o mesmo nome da classe
 * Podemos criar mais de um Construtores na mesma classe
 * 
 * 
 * 
 *  * Se criar um construtor com parametro ou sem, você automaticamente precisa criar o construtor padrão, que é:
 * 	public Pessoa() {}
 * 
 * A JVM cria esse construtor vazio, exceto quando criamos um outro construtor com parametros ou vazio. Daí, ele desconsidera o construtor criado por padrão
 * 
 * 
 */

public class Pessoa {

	String nome;
	String email;
	String cpf;
	
	//Construtor vazio:
	public Pessoa() {
		
	}
	
	//Construtor com parâmetros:
	public Pessoa(String nome, String email, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		
	}
}
