package aula_udemy_secao12;
/*
 * A classe que herdou à outra se chama também como:
 * - Classe base;
 * - Classe mãe;
 * - Classe pai;
 * - Super classe;
 * - Classe genérica.
 */

//Agora essa classe é abstrata
public abstract class Pessoa {
	private String nome;
	private int anoNascimento;
	private String email;
	
	//Isso é um overloading:
	public Pessoa() {
		
	}
	public Pessoa(String nome, int anoNascimento, String email) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nAno Nascimento: " + this.anoNascimento;
	}

	//Isso é uma sobrecarga:
	public void mensagem() {
		System.out.println("Essa é minha mensagem");
	}
	
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	//Declaração de um método abstrato
	public abstract void outra_mensagem(String texto);
}
