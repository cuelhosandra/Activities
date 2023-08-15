 //Operador ternário

public class Programa04 {

		public static void main(String[] args) {
			
			
			
			int valor = -10, numero;
			
			//ISSO É UM OPERADOR TERÁRIO: 
			
			numero = (valor > 0) ? valor : 7; 
			
			System.out.println(numero);
		}
} 

//NUMERO RECEBE UM RESULTADO ( numero = )
//SE O VALOR FOR MAIOR QUE 0, RESULTADO É VALOR ( (valor > 0) ? valor )
//SE NÃO, RESULTADO É 7 ( : 7; )



//FIZEMOS EM UMA LINHA O QUE FARÍAMOS COM IF ELSE CONFORME EXEMPLO:

// 			if (valor > 0) {
//			numero = valor;
//	} 		else {
//			numero = 7;
// 	}

//		System.out.println(numero);
//		}  
//	} 