package aula_udemy_secao12;

/*
 * Ocorre quando substituímos um método de uma superclasse na sua subclasse, usando a mesma assinatura
 * 
 * Assinatura:
 * 
 * metodo publico Peixe(String nome, Int idade){
 * }
 * 
 * metodo publico Mamifero(String nome, Int idade){
 * }
 * 
 * Ou seja: possui a mesma quantidade e tipo de atributos na assinatura
 */
public class Polimorfismo {
	
	/*
	 * Criando algoritmo sobre um exemplo de Polimorfismo:
	 * 
	 * 
	 * Animal Classe abstrata 
	 * atributos: peso
	 * 			  idade
	 * 			  membros
	 * métodos:  locomover()
	 * 			 alimentar()
	 * 
	 * 
	 * 
	 * Mamífero extends Animal
	 * atributos: corPelo
	 * @Soprebor
	 * publico metodo locomover()
	 * 		Escreva("Correndo")
	 * fimMetodo
	 * @Sobrepor
	 * publico metodo alimentar()
	 * 		Escreva("Nham nham nham")
	 * fimMetodo
	 * 
	 * 
	 * 
	 * Peixe extends Animal
	 * atributos: corEscama
	 * métodos: soltarBolha()
	 * publico metodo soltarBolha()
	 * 		Escreva("glub glub")
	 * fimMetodo
	 * @Sobrepor
	 * publico metodo locomover()
	 * 		Escreva("Nadando")
	 * fimMetodo
	 * @Sobrepor
	 * publico metodo alimentar()
	 * 		Escreva("nhac nhac")
	 * fimMetodo
	 * 
	 * 
	 * Programa Principal (main):
	 * 
	 * m = novo Mamifero();
	 * p = novo Peixe();
	 * 
	 * m.setPeso(45)
	 * m.setIdade(10)
	 * m.setMembros(4)
	 * m.locomover() //Correndo
	 * m.alimentar() // Nham nham nham
	 * 
	 * O RESULTADO ACIMA SE CHAMA DE POLIMORFISMO DE SOBREPOSIÇÃO
	 */

}
