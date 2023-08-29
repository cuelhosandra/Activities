package aula_udemy_secao11;
//Private

/* Quando definimos um atributo ou método como privado: só temos acesso à eles dentro da própria classe
 * 
 */
public class Programa27 {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente("Sandrinha", "Rua taltaltal");
		cli1.dizerOi();
		System.out.println("Nome: " + cli1.getNome());
	
	}

}
