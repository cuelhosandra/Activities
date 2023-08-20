package aula_udemy_secao06;
//Tipos de dados
// Numéricos: reais
public class Programa12 {

	
	public static void main(String[] args) {
		
		//Tipos primários ou primitivos 
		//Por padrão os números reais em JAVA são considerados double
		float preco1 = 23.4f; //Ocupa menos espaço mas precisa inserir o F no fim
		double preco2 = 23.47878678667; //Ocupa amis espaço
		
		//Tipos não primários ou primitivos
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("Float -> preco1 = " + preco1);
		
		//RECOMENDADO: Utilizar os não primários somente para casos de conversão... Ex.: INTEGER.PARSEINT
	}	
	
}
