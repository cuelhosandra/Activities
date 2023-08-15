//ForEach -> ParaCada
public class Programa10 {

	public static void main(String[] args) {
		
		String nome = "Sandra Linda";
		
		//Para cada um dos caracteres da string, imprima o caractere
		for (char letra : nome.toCharArray()) {
		//char - tipo da variavel
		//letra - variavel
		//nome.toCharArray - convertendo em caracteres e array
			
			
		//	System.out.println(letra);
		//pra imprimir na mesma linha, tirar o printLN:
			System.out.print(letra);
			
		}
	}

}
