package entities;

public class Conta {
	private int numero; //número conta não pode ser alterado
	private String titular;
	private double saldo;//saldo não pode ser alterado
	//balance= saldo, amount=quantia,    withdraw= saque,  holder= titular
	
	public Conta(int numero, String titular) {		
		this.numero = numero;
		this.titular = titular;
	}

	public Conta(int numero, String titular, double depositoInicial) {		
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	public void deposito(double quantia) {
		saldo =  saldo + quantia;
	}
	public void saque(double quantia) {
		saldo = saldo - quantia - 5.0;
	}
	public String toString() {
		return "Conta "
				+ numero
				+ ", Titular: "
				+ titular
				+ ", saldo: $ "
				+ String.format("%.2f",saldo);
	}

}
