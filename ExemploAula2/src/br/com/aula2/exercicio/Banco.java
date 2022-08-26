package br.com.aula2.exercicio;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		long numero;
		int agencia;
		double valor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número da conta");
		numero = ler.nextLong();
		System.out.println("Digite o número da agência");
		agencia = ler.nextInt();
		
		ContaCorrente c1 = new ContaCorrente(numero,agencia);
		System.out.println("Digite o valor de depósito");
		valor = ler.nextDouble();
		c1.depositar(valor);
		System.out.println("Saldo: " + c1.ConsultaSaldo());
		
		/*ContaCorrente c1; 	//Cria variável c1 do tipo da classe
		c1 = new ContaCorrente(1234, 526); 	//Instancia a variável c1
		c1.depositar(1000);
		System.out.println(c1.ConsultaSaldo());
		c1.sacar(500);
		System.out.println(c1.ConsultaSaldo());*/

	}

}
