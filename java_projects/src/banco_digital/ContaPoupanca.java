package banco_digital;

import java.util.Scanner;

import static banco_digital.VerificaSaldo.verificaSaldo;

public class ContaPoupanca implements ContaPadrao{
    private Double saldo;
    double deposito;
    Double rendimento = 0.01;
    int meses;

    Scanner scan = new Scanner(System.in);

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    @Override
    public double depositar(double deposito) {
        saldo = saldo + deposito;

        return saldo;
    }

    @Override
    public void sacar(double saque) {
        System.out.println("Caso saque antes do tempo original programado você pagará metade do seu rendimento mais uma taxa fixa de R$120. Quanto tempo ficou em rendimento?");
        int meses2 = Integer.parseInt(scan.next());
        System.out.println("Quantos meses estavam no acordo?");
        int meses = scan.nextInt();
        if (meses2 < meses){
            //É possível criar uma variável ou função para calcular rendimento, mas preferi desafiar a minha lógica mesmo que polua o código
            Double valorRendimento = getSaldo() * rendimento * meses;
            Double valorRendimento2 = valorRendimento/2;
            System.out.println("Você receberia: " + valorRendimento);
            System.out.println("Você recebeu: " + (valorRendimento2-120));
        }

        verificaSaldo(getSaldo(), saque);

    }
}
