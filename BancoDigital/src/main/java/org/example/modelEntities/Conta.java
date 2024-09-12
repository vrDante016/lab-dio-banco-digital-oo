package org.example.modelEntities;

public abstract class Conta {

    private int agencia;
    private int numero;
    private Double saldo;
    private Cliente cliente;
    public Conta(){

    }

    public Conta(Cliente cliente, int agencia, int numero, Double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract void depositoConta(double amount);


    public abstract Double saqueConta(double amount) throws Exception;



    public abstract void transferenciaConta(double amount, Conta contaDestino);

}
