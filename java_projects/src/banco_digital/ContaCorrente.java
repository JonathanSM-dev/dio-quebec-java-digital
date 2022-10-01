package banco_digital;

import java.util.Scanner;

import static banco_digital.VerificaSaldo.verificaSaldo;

public class ContaCorrente implements ContaPadrao{
    private Double saldo;
    double deposito;
    Scanner scan = new Scanner(System.in);



    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    @Override
    public double depositar(double deposito){
        saldo = saldo + deposito;
        return saldo;
    }

    @Override
    public void sacar(double saque) {

        verificaSaldo(saque, getSaldo());
    }
    //propositalmente só é possível transferir de uma conta-corrente para uma poupança
    public void transferir(double saque, ContaPoupanca contaDestino) {
        if (!verificaSaldo(getSaldo(), saque)){
            System.out.println("Saldo insuficiente");
        }else {
            this.sacar(saque);
            contaDestino.depositar(saque);
            System.out.println("Transferência realizada");
        }

    }

}

