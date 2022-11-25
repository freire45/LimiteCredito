package br.com.erickfreire.limitedecredito;

import java.util.Scanner;

public class LimiteDeCredito {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String numeroConta;
		int saldoInicial;
		int totalCredito;
		int totalDebito;
		int limiteCredito;
		
		System.out.println("Programa que verifica se um cliente excedeu limite de crédito: ");
		System.out.print("Digite o Número da Conta: ");
		numeroConta = entrada.nextLine();
		
		System.out.print("Digite o saldo inicial da conta: ");
		saldoInicial = entrada.nextInt();
		
		System.out.print("Digite o total de créditos da conta: ");
		totalCredito = entrada.nextInt();
		
		System.out.print("Digite o total de débitos da conta: ");
		totalDebito = entrada.nextInt();
		
		System.out.print("Digite o limite de crédito da conta: ");
		limiteCredito = entrada.nextInt();
		
		Cliente c1 = new Cliente(numeroConta, saldoInicial, totalDebito, totalCredito, limiteCredito);		
		
		c1.verificaLimiteCredito();
	}

}
