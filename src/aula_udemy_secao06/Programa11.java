package aula_udemy_secao06;
//Tipos de dados
// Numéricos: inteiros 
public class Programa11 {

	public static void main(String[] args) {
		
		//Tipos primários ou primitivos
		long num0 = 99; // Inteiro 99999999999999999999
		int num1 = 6; // Inteiro 9999999 (ocupa mais espaço na memoria)
		short num2 = 4; // Inteiro (curto) 999 (ocupa menos espaço na memoria)
		byte num3 = 4; // Inteiro (ocupa bem menos espaço na memoria)
		char num8 = 34; //ASCII TABLE - ele imprime os caracteres desta tabela
		
		//Tipos não primários ou primitivos
		Long num7 = (long) 999999999; //Cast
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;
		Character num9 = 34; //ASCII TABLE - ele imprime os caracteres desta tabela
		
		//Pra ver o tamanho que cada variavel está ocupando na memoria:
		
		System.out.println("Tamanho que cada var esta ocupando na memoria:");
		System.out.println("int/Integer "+ Integer.SIZE + " bits");
		System.out.println("short/Short "+ Short.SIZE + " bits");
		System.out.println("byte/Byte "+ Byte.SIZE + " bits");
		System.out.println("long/Long "+ Long.SIZE + " bits");
		
		System.out.println("Valores minimos e maximos suportados por cada var:");
		System.out.println("int/Integer "+ Integer.MIN_VALUE);
		System.out.println("int/Integer "+ Integer.MAX_VALUE);
		
		System.out.println("short/Short "+ Short.MIN_VALUE);
		System.out.println("short/Short "+ Short.MAX_VALUE);
		
		System.out.println("byte/Byte "+ Byte.MIN_VALUE);
		System.out.println("byte/Byte "+ Byte.MAX_VALUE);
		
		System.out.println("long/Long "+ Long.MIN_VALUE);
		System.out.println("long/Long "+ Long.MAX_VALUE);
		
		
		//RECOMENDADO: Utilizar os não primários somente para casos de conversão... Ex.: INTEGER.PARSEINT
	}
}
