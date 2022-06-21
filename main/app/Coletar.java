package main.app;

import java.util.Scanner;

public class Coletar {
	Scanner pegar = new Scanner(System.in);
	
	public int coletarNumConta() {
		 System.out.print("Digite o numero da conta:");
	     int contaDigitada = pegar.nextInt();
	    return contaDigitada;
	}
	public double coletarDeposito() {
		System.out.print("Quanto voçê quer depositar:");
	     double deposito = pegar.nextDouble();
	     return deposito;
	}
public void imprimir() {
	System.out.println("_________________________");
}
}
