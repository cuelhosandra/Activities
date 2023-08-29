package aula_udemy_secao11;

public class Cliente {
	private String nome;
	private String endereco;
	
	public Cliente (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
		//Mesmo que o método é private, estou inserindo ele num método público, então ele pode ser usado em outra classe
		this.dizerOi();
	}

	private void dizerOi() {
		System.out.println("Oie");
	}

	//Criando get e set pra utilizar os atributos em outra classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}
