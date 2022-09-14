package exercicio1_metodos_java;

import java.text.DecimalFormat;


public class emprestimoJava {



    public void emprestimoCalculo(int valorEmprestimo, int parcelas, float juros){
         float valorJuros;

        valorJuros = valorEmprestimo * juros * parcelas;
        System.out.println("Valor desejado: " + valorEmprestimo);
        System.out.println("Quantas parcelas: " + parcelas);
        System.out.println(("Valor dos juros: " + new DecimalFormat("#,###.##").format(valorJuros)));

    }



}
