/* Objetos:
 * 
 * São produtos/instância da classe;
 * 
 * 
 */

public class Programa22 {

	public static void main(String[] args) {
		
		//Declarando e inicializando o objeto: 
		Produto p1 = new Produto(); // Produto(); é o CONSTRUTOR
		
	
		p1.preco = 210.00f;
		p1.desconto = 10;

		//Chamando o atributo:
		System.out.println(p1.nome);
		
		//Chamando o Método:
		p1.aumentarPreco(0);
		
		//Chamando o atributo:
		System.out.println(p1.preco - p1.desconto);
		
		
		//Declarando e Instanciando Pessoa:
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Sandra Coelho";
		pessoa1.email = "sandracoelho_br@hotmail.com";
		pessoa1.cpf = "101011010111";
		
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("E-mail: " + pessoa1.email);
		System.out.println("CPF: " + pessoa1.cpf);
		
		//Declarando e Instanciando Pessoa com parâmetros:
		
		Pessoa pessoa2 = new Pessoa("Sandra", "teste@teste", "239232"); {
			
		
		System.out.println("Nome: " + pessoa2.nome);
		System.out.println("E-mail: " + pessoa2.email);
		System.out.println("CPF: " + pessoa2.cpf);
		}
		
	}

}
