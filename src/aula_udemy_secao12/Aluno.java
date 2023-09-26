package aula_udemy_secao12;
/*
 * A classe que foi herdada à outra se chama também como:
 * - Clase específica;
 * - Sub-classe;
 * - Classe filha.
 */
public class Aluno extends Pessoa {
	private String ra = "1234";
	
	public Aluno(String nome, int anoNascimento, String email, String ra) {	
		//Utilizar SUPER pra pegar atributos da outra classe:
		super(nome, anoNascimento, email);
		this.ra = ra;
	}
	
		public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	
	public String toString() {
		return super.toString() + "\nR.a: " + this.ra;
	}
}
