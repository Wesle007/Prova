package main.app;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
        Scanner pegar = new Scanner(System.in);

		int contaDigitada;
        double deposito =0;
        boolean continuar = true, c=true;
        
        Coletar saco =new Coletar();
        Cliente cliente1 = new Cliente("Wesle" , 12345);
        Cliente cliente2 = new Cliente("Thalyson" , 54321);
        
        while(continuar) {
        	
        	
        	while(c) {
        		contaDigitada = saco.coletarNumConta();
            	saco.imprimir();
        	deposito =saco.coletarDeposito();
        if(contaDigitada==cliente1.getNumConta()){
            cliente1.setSaldo(cliente1.getSaldo() + deposito);
            c=false;
        }else if(contaDigitada==cliente2.getNumConta()){
        	 cliente2.setSaldo(cliente2.getSaldo() + deposito);
        	 c=false;
        }else{
            System.out.println("DIGITE UMA CONTA EXISTENTE");
        }
        	}
        //Pergunta se quer continuar
        System.out.println("Deseja continuar? S/N");
        String resposta =pegar.nextLine();
        if(resposta.equalsIgnoreCase("s")) {
        	continuar= true;
        }else if (resposta.equalsIgnoreCase("n")) {
        	continuar = false;
        	System.out.println(cliente1.toString());
        	System.out.println("-------------------------");
        	System.out.println(cliente2.toString());
        }else {
        	System.out.println("QUAL FOI MEU MAN,É SÓ S/N");
        }
        c= true;//resetando pra proxima vez
        }
	}
}


