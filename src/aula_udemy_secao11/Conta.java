package aula_udemy_secao11;
import java.util.Scanner;

public class Conta {
	
	int numeroConta;
	float saldoConta;
	float limiteConta;
	Cliente cliente;

	public Conta(int numeroConta, float saldoConta, float limiteConta, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.limiteConta = limiteConta;
		this.cliente = cliente;
	}
	
	void sacarDinheiro(float valor) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Qual valor deseja sacar?");
//		valor = sc.nextFloat();
		this.saldoConta = saldoConta - valor;
//		System.out.println("Seu saldo atual é: " + valor);
	
	}
	
	void depositarDinheiro(float valor) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Qual valor deseja depositar?");
//		valor = sc.nextFloat();
		this.saldoConta = saldoConta + valor;
//		System.out.println("Seu saldo atual é: " + valor);
		
	}
	
//	public void mostrarSaldo() {
//		this.saldoConta = saldoConta;
//		System.out.println("Seu saldo atual é: " + saldoConta);
//	}
}
