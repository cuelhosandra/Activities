package aula_udemy_secao11;

public class Programa25 {

	public static void main(String[] args) {
		
		Cliente Sandra = new Cliente("Sandra Coelho", "R Cel Vidal Ramos 400");
		Cliente Victor = new Cliente("Victor Trindade", "R Cel Vidal Ramos 400");
		
		Conta conta1 = new Conta(1, 150, 800, Sandra);
		
		System.out.println("Seu saldo atual eh: " + conta1.saldoConta);
		conta1.depositarDinheiro(300);
		System.out.println("Após o deposito, seu saldo e: " + conta1.saldoConta);
	}

}
