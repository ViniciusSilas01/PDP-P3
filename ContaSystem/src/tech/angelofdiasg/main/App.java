package tech.angelofdiasg.main;

import tech.angelofdiasg.contas.Conta;
import tech.angelofdiasg.contas.ContaEspecial;
import tech.angelofdiasg.contas.ContaInvestimento;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		//Criação do objeto
		Scanner leitor = new Scanner(System.in);
		double valor;
		Conta conta1 = new Conta();
		Conta conta2 = new Conta(2, 1000);
		ContaEspecial ContaE1 = new ContaEspecial();
		ContaInvestimento ContaI1 = new ContaInvestimento();

		//Utilização dos estados
		System.out.println("Informe o valor inicial de"
				+ " deposito da conta 01:");
		valor = leitor.nextDouble();
		conta1.depositar(valor);
		//utilização do comportamento
		conta1.sacar(650);
		conta2.sacar(100);



	}

}
