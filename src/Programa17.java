//Vetores parte 2

public class Programa17 {
	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3;
			
		}		
		
		//Imprime o primeiro e último elemento + 3
		System.out.println(numeros[0]);
		System.out.println(numeros[9]);
		
		//Os arrays possuem tamanho fixo e não podem ser alterados. Ex.:		
		//Não podemos declarar novamente um novo valor à variavel números na posição x. Ex.:
		//	numeros[10] = 42;
		
	}
	

}
