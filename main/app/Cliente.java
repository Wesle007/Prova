package main.app;



public class Cliente {
    private String nome;
    private int numConta;
    private double saldo;
 
 
    public Cliente(String nome , int numConta){
    	this.nome = nome;
    	this.numConta = numConta;
    	this.saldo = 0;
 }   
    @Override
    public String toString() {
    	return "Cliente nome: " + nome + "\nNumero da Conta: " + numConta + "\nSaldo: " + saldo ;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
