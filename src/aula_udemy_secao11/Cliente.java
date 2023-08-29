package aula_udemy_secao11;

//PROTECTED (modificador de acesso default/padrão):

////Se não inserir public nem private, significa que é PROTECTED
///Ou seja, você consegue utilizar na classe do mesmo pacote mas fora dele, não 
public class Cliente {
	private String nome;
	private String endereco;
	
	public Cliente (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
		//Mesmo que o método é private, estou inserindo ele num método público, então ele pode ser usado em outra classe
//		this.dizerOi();
	}

	//Se não inserir public nem private, significa que é PROTECTED
	 void dizerOi() {
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
