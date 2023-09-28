package aula_udemy_secao12;
//Herança e Polimorfismo fazem parte de Orientação a Objetos

//Herança: Benefícios da Herança:
/* 
 * Evita repetição de código;
 * Facilita a manutenção do programa;
 * 
 * Quando uma classe herda de outra classe, ela ganha:
 * Todos os atributos e métodos da classe herdada.
 */
public class Progama28 {

	public static void main(String[] args) {
		
		//Utilizando Construtor vazio (não recomendado):
//		Pessoa p1 = new Pessoa();		
//		p1.setNome("Sandra Coelho");
//		System.out.println(p1.getNome());
		
		//Pessoa p1 = new Pessoa("Sandra Coelho", 22, "teste@");		
		//System.out.println(p1.getAnoNascimento());
		
		Aluno a1 = new Aluno("Vanessa da Silva", 22, "teste@teste", "424242");		
		System.out.println(a1.getNome());
		
		Professor prof1 = new Professor("Joao", 25, "teste@teste", "3123131");
		System.out.println(prof1.getMatricula());
	}

}
