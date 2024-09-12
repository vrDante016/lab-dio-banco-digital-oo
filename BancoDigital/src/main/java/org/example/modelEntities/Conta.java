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

    public void depositoConta(double amount) {
        this.saldo += amount;

    }


    public Double saqueConta(double amount) throws Exception {
        if(amount < 0){
            throw new Exception("O valor do saque é menor que zero");
        }
        return this.saldo -= amount;
    }


    public void transferenciaConta(double amount, Conta contaDestino) {
        if(amount <= saldo && contaDestino.getAgencia() == this.getAgencia()){
            this.saldo -= amount;
            contaDestino.setSaldo(contaDestino.getSaldo() + amount);
        }
    }
}
