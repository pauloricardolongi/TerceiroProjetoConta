package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;


public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;//declarar a variável para instanciar
		
		System.out.print("Entre com o número da Conta:");
		int numero = sc.nextInt();
		System.out.print("Entre com o nome do Titular:");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Tem depósito inicial (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {
			System.out.print("Entre com o valor inicial do depósito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);//se for sim: construtor 3 argumento
		}
		else {
			conta = new Conta(numero, titular); // não: construtor 2 argumento
			
		}	
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		//depósito
		System.out.println();
		System.out.print("Entre com o valor do depósito");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Atualizado dados conta:");
		System.out.println(conta);
		
		//saque
				System.out.println();
				System.out.print("Entre com o valor para saque");
				double valorSaque = sc.nextDouble();
				conta.saque(valorSaque);
				System.out.println("Atualizado dados conta:");
				System.out.println(conta);
		
		sc.close();

	}

}
