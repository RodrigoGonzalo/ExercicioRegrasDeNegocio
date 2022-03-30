package br.com.fiap.regardenegocio.contrato;


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
	
	public void CalcularParcelas(double ValorContrato, int NumeroParcelas) {
		double Resultado;
		for(int i = 0; i < NumeroParcelas; i++ ) {
			Resultado = ValorContrato + 0.01;
			Resultado = ValorContrato + 0.02;
		}
	}
	
	
	
}
