package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;


public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;//declarar a vari�vel para instanciar
		
		System.out.print("Entre com o n�mero da Conta:");
		int numero = sc.nextInt();
		System.out.print("Entre com o nome do Titular:");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Tem dep�sito inicial (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {
			System.out.print("Entre com o valor inicial do dep�sito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);//se for sim: construtor 3 argumento
		}
		else {
			conta = new Conta(numero, titular); // n�o: construtor 2 argumento
			
		}	
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		//dep�sito
		System.out.println();
		System.out.print("Entre com o valor do dep�sito");
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
