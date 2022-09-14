package exercicio1_metodos_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class emprestimoJava {

    Scanner scanner = new Scanner(System.in);

    public void emprestimoCalculo(){

        int valorEmprestimo;
        int parcelas;
        float juros;
        float valorJuros;

        System.out.println("Qual o valor desejado?");
        valorEmprestimo = scanner.nextInt();

        System.out.println("Quantas parcelas desejadas?");
        parcelas = scanner.nextInt();

        if (parcelas >= 1 && parcelas <= 6)
        {
            juros = 0.01f;
        }else if (parcelas >= 7 && parcelas <= 12)
        {
            juros = 0.015f;
        }else {
            juros = 0.025f;
        }

        valorJuros = valorEmprestimo * juros * parcelas;

        System.out.println("Valor desejado: " + valorEmprestimo);
        System.out.println("Quantas parcelas: " + parcelas);
        System.out.println(("Valor dos juros: " + new DecimalFormat("#,###.##").format(valorJuros)));

    }



}
