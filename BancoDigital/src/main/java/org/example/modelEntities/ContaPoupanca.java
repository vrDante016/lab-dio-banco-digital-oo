package org.example.modelEntities;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, int agencia, int numero, Double saldo){
        super(cliente, agencia, numero, saldo);
    }
    @Override
    public void depositoConta(double amount) {
        this.setSaldo(getSaldo() + amount);
    }

    @Override
    public Double saqueConta(double amount) throws Exception {
        if(this.getSaldo() < amount){
            throw new Exception("O saldo é insuficiente para fazer o saque");
        }
        this.setSaldo(getSaldo() - amount);
        return this.getSaldo();
    }

    @Override
    public void transferenciaConta(double amount, Conta contaDestino) {
        if(getSaldo() >= amount && contaDestino.getAgencia() == getAgencia()){
            setSaldo(getSaldo() - amount);
            contaDestino.setSaldo((getSaldo() + amount) - 0.5);
        }
    }


}
