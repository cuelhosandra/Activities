package aula_udemy_secao09;
// Classes:
//Nas Classes Java, não existe a implementação da função main()
//As Classes Java servem para modelar o programa
//Todas as Classes Java possuí a seguinte forma:
// public class NomeDaClasse{
//}

/*
 * Atributos:
 * 
 * São as características de uma classe
 * Atributos são os mesmos que variáveis
 */

/* Métodos:
 * 
 * Ação de um objeto
 * São comportamentos do objeto
 * 
 * Contém os mesmos requisitos de uma função:
 *  - Tipo de retorno (tipo de dado que o método vai retornar) EXEMPLO: VOID;
 *  - Nome - corresponde à ação que o método vai utilizar;
 *  - Párâmetros/Argumentos de entrada (opcional);
 *  - Retorno (Opcional - depende do tipo de retorno)
 *  
 *  
 *  Diferença entre função e método:
 *  1 - Método: faz parte de uma classe;
 *  2 - Função: é solta. Não depende de classes.
 */

public class Produto {
	
	String nome = "notebook";
	float preco;
	float desconto;

	// Método pra aumentar o preço +10
	
	void aumentarPreco(float valor) {
		System.out.println("teste");
		this.preco = this.preco + valor;
	}
}
