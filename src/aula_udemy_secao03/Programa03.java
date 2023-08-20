package aula_udemy_secao03;
//ESTRUTURA DE DECISÃO:

// IF, ELSE, ELSE IF
public class Programa03 {

	public static void main(String[] args) {
		
		/*	double numero = 2;
		
		
		if (numero > 5) {
			System.out.println("Sim, o numero " + numero + " eh maior a 5");
		} 
		else if (numero == 5) {
			System.out.println("O numero " + numero + " eh igual a 5");
		}
		else if (numero % 2 == 0) {
			System.out.println("O numero " + numero + " eh par");
		}
		else {
			System.out.println("Nao, o numero " + numero + " nao eh maior que 5");
		}

	} */

	//OUTRO EXEMPLO
	
		// SE O VALOR FOR MAIOR QUE 0, O NUMERO SERÁ IGUAL AO VALOR.... SE NÃO, SERÁ 7
	int valor = 3, numero;
	
	if (valor > 0) {
		numero = valor;
	} else {
		numero = 7;
	 }
	
	System.out.println(numero);
	}
}