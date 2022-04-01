package br.com.fiap.regardenegocio.contrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class Contrato {
	
	// Tipagem dos Atributos
	private int NumeroContrato;
	private String DataContrato;
	private double ValorContrato;
	private int NumeroParcelas;
	
	// Construtores
	public Contrato() {
		
	}
	
	public Contrato(int NumeroContrato, String DataContrato, double ValorContrato, int NumeroParcelas) {
		this.NumeroContrato = NumeroContrato;
		this.DataContrato = DataContrato;
		this.ValorContrato = ValorContrato;
		this.NumeroParcelas = NumeroParcelas;
	}

	
	// Getters and Setters
	public int getNumeroContrato() {
		return NumeroContrato;
	}

	public void setNumeroContrato(int NumeroContrato) {
		this.NumeroContrato = NumeroContrato;
	}

	public String getDataContrato() {
		return DataContrato;
	}

	public void setDataContrato(String DataContrato) {
		this.DataContrato = DataContrato;
	}

	public double getValorContrato() {
		return ValorContrato;
	}

	public void setValorContrato(double ValorContrato) {
		this.ValorContrato = ValorContrato;
	}

	public int getNumeroParcelas() {
		return NumeroParcelas;
	}

	public void setNumeroParcelas(int NumeroParcelas) {
		this.NumeroParcelas = NumeroParcelas;
	}
	
	// Métodos
	
	// Array para calcular parcelas
	public ArrayList<Double> CalcularParcelas(){
		// Declarando as variáveis
		double juros;
		double parcela = ValorContrato / NumeroParcelas;
		double resultado;
		
		// Objeto Array do Tipo double que vai ser chamado no main
		ArrayList <Double> Valores = new ArrayList<Double>();
		
		// for para calcular as parcelas com juros
		for( int i=0, j=1; i<NumeroParcelas; i++, j++) {
			juros = parcela + (parcela * 0.01) * j;
			resultado = juros + (juros * 0.02);
			Valores.add(resultado);
		}
		// retorna o objeto Array
		return Valores;
	}
	
	// Método para Calcular o Tempo em formato de Array
	public ArrayList<String> CalcularTempo(){
		
		// Declara os Objeto de tempo
		LocalDate LD = null;
		DateTimeFormatter DTF = null;
		
		// Try e Catch para o processo de transformar String pra Date
		try {
			// A variável DTF define o padrão que eu quero de data
			DTF = DateTimeFormatter.ofPattern("dd/mm/yyyy");
			
			// O LD vai receber o meu getDataContrato com o meu DTF como parâmetro
			LD = LocalDate.parse(getDataContrato(), DTF);
		}catch(DateTimeParseException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		// Criei um Objeto Array do tipo String
		ArrayList <String> Data = new ArrayList<String>();
		
		// Variável LocalDate recebe o LD
		LocalDate Amanha = LD;
		
		// for para calcular as datas
		for(int i=0; i<NumeroParcelas; i++) {
			Amanha = Amanha.plusMonths(1);
			String DepoisDeAmanha = Amanha.format(DTF);
			Data.add(DepoisDeAmanha);
		}
		// Retorna o Array Data
		return Data;
	}
	
	
	
	
}
