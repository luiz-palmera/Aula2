package br.com.aula2.exercicio;

public class ContaCorrente
{
	private long numero;
	private int agencia;
	private double saldo;
	
	ContaCorrente(long num, int ag){
		numero = num;
		agencia = ag;
		saldo = 0;
	}
	
	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
	public void sacar(double valor){
		if(valor <= saldo) 
			saldo = saldo - valor;
		else
			System.out.println("Saldo Insuficiente");
	}
	
	public double ConsultaSaldo(){
		return saldo;
	}
	

}
