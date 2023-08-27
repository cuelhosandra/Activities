package aula_udemy_secao11;
import java.util.Scanner;
/*
 * GETTERS E SETTERS
 * 
 * Getter -> método público, que serve para consultar dados;
 * 			- A nomenclatura é: getNome_do_atributo()
 *  
 */

/*
 * PUBLIC: Classes e construtores devem ser obrigatórios ser PUBLIC. 
 * PUBLIC: Métodos também são PUBLIC.
 * Sendo público: consigo utilizar em todos os outros programas ou classes do meu projeto
 * 
 */
public class Conta {
	
	private int numeroConta;
	private float saldoConta;
	private float limiteConta;
	private Cliente cliente;

	public Conta(int numeroConta, float saldoConta, float limiteConta, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.limiteConta = limiteConta;
		this.cliente = cliente;
	}

	void sacarDinheiro(float valor) {
		
		if (valor <= limiteConta) {
			this.saldoConta = saldoConta - valor;
			System.out.println("Operacao realizada. Seu saldo agora eh: " + this.saldoConta);
		}else {
		
			System.out.println("Saldo insuficiente. Seu saldo eh: " + this.saldoConta);
			
		}
	
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
	
	
	//GETTERS E SETTERS
	
	public float getSaldoConta() {
		return saldoConta;
	}
	
	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(float limiteConta) {
		this.limiteConta = limiteConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
