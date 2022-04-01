package br.com.fiap.regardenegocio.teste;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.fiap.regardenegocio.contrato.Contrato;

public class TesteCalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Importando o SimpleDateFormat
		
		// Criando Objeto
		Contrato Contract = new Contrato();
		
		// Criando o Scanner
		Scanner Dados = new Scanner(System.in);
		
		// Entrada dos Dados
		System.out.println("Informe o Número do Contrato");
		Contract.setNumeroContrato(Dados.nextInt());
		//Dados.nextInt(Contract.getNumeroContrato());
		
		System.out.println("Informe a Data desse Contrato");
		Contract.setDataContrato(Dados.next());
		
		System.out.println("Digite o valor do Contrato");
		Contract.setValorContrato(Dados.nextDouble());
		
		System.out.println("Digite a Quantidade de Parcelas");
		Contract.setNumeroParcelas(Dados.nextInt());
		
		// Chamando os Arrays que criei nom métodos
		ArrayList<String> Data = Contract.CalcularTempo();
		ArrayList<Double> Parcela = Contract.CalcularParcelas();
		
		System.out.println("Parcelas:");
		
		for(int i=0; i<Data.size(); i++) {
			System.out.printf("%s - R$ %.2f \n", Data.get(i), Parcela.get(i));
		}
	}

}
