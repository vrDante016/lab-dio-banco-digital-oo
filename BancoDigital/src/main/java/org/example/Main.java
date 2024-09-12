package org.example;

import org.example.modelEntities.Cliente;
import org.example.modelEntities.Conta;
import org.example.modelEntities.ContaCorrente;

public class Main {
    public static void main(String[] args) throws Exception {

                // Criando clientes
                Cliente cliente1 = new Cliente("João");
                Cliente cliente2 = new Cliente("Maria");

                // Criando contas
                Conta conta1 = new ContaCorrente(cliente1, 12, 234, 1000.0 );
                ContaCorrente conta2 = new ContaCorrente(cliente2, 12, 2333,500.0);

                // Testando depósitos
                conta1.depositoConta(500.0);
                System.out.println("Saldo conta 1 após depósito: " + conta1.getSaldo());

                // Testando saques
                conta1.saqueConta(200.0);
                System.out.println("Saldo conta 1 após saque: " + conta1.getSaldo());

                // Testando transferências
                conta1.transferenciaConta(300.0, conta2);
                System.out.println("Saldo conta 1 após transferência: " + conta1.getSaldo());
                System.out.println("Saldo conta 2 após transferência: " + conta2.getSaldo());



    }
}