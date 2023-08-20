package aula_udemy_secao06;
//Operações matemáticas
public class Programa15 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 10, res;
		float res2;
		
		//Soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " eh " + res);
		
		//Subtração
		res = num2 - num1;
		System.out.println("A subtracao de " + num2 + " - " + num1 + " eh " + res);
		
		//Multiplicação
		res = num1 * num2;
		System.out.println("A multiplicacao de " + num1 + " * " + num2 + " eh " + res);
		
		//Divisão (Inteira)
		res = num2 / num1;
		System.out.println("A divisao de " + num2 + " / " + num1 + " eh " + res);
		
		//Divisão (Real)
		res2 = (float)num2 / (float)num1;
		System.out.println("A divisao de " + num2 + " / " + num1 + " eh " + res2);
		
		//Módulo
		//Se o resto do módulo da var por 2 for 0, a variável eh par. Caso contrário, é impar
		res = num1 % 2;
		System.out.println("O resto da divisao de " + num1 + " por 2 eh " + res);
		
		//Se for 0 = divisivel 
		res = num1 % 3;
		System.out.println(num2 + " eh divisivel por 3? " + res);
	}
}
