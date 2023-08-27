package aula_udemy_secao11;

//Encapsulamento

public class Programa25 {

	public static void main(String[] args) {
		
		//GET -> Obter o valor;
		//SET -> Atribuir o valor.
		
//		Cliente Sandra = new Cliente("Sandra Coelho", "R Cel Vidal Ramos 400");
//		Cliente Victor = new Cliente("Victor Trindade", "R Cel Vidal Ramos 400");
		
		
		Cliente Amanda = new Cliente(null, null);
		
		Amanda.setEndereco("Rua Amadeu da Luz 222");
		System.out.println(Amanda.getEndereco());
		
//		Conta conta1 = new Conta(1, 150, 800, Sandra);
		
//		System.out.println("Seu saldo atual eh: " + conta1.getSaldoConta());
//		conta1.depositarDinheiro(300);
//		System.out.println("Após o deposito, seu saldo e: " + conta1.getSaldoConta());		
//		conta1.sacarDinheiro(900);
	}

}
