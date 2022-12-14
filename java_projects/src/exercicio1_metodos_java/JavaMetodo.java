package exercicio1_metodos_java;

import java.util.Scanner;

import static exercicio1_metodos_java.saudacaoJava.greetingJava;

public class JavaMetodo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Operacao operacao = new Operacao();

        int i;
        String confirmation;

        greetingJava();

        System.out.println("Escolha a operação:");
        System.out.println("Soma(1)");
        System.out.println("Subtração(2)");
        System.out.println("Multiplicação(3)");
        System.out.println("Divisão(4)");

        i = scanner.nextInt();

        if (i == 1 || i == 2 || i == 3 || i == 4) {
            System.out.println("Digite os dois números a serem usados:");
            int a, b;
           a = scanner.nextInt();
           b = scanner.nextInt();
           System.out.println("resultado: ");

            if (i == 1){
                System.out.println(operacao.soma(a, b));
            } else if (i == 2) {
                System.out.println(operacao.subtracao(a, b));
            } else if (i == 3) {
                System.out.println(operacao.multiplicacao(a, b));
            } else {
                System.out.println(operacao.divisao(a, b));
            }
        } else {
            System.out.println("Operação não encontrada");
        }

        System.out.println("--------------------------------");
        System.out.println("|------------------------------|");
        System.out.println("--------------------------------");


        System.out.println("Deseja fazer um empréstimo?(Y/N)");
        confirmation = scanner.next();
        if (confirmation.equals("Y") || confirmation.equals("y")) {


            int valorEmprestimo;
            int parcelas;
            float juros;


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



            emprestimoJava emprestimo = new emprestimoJava();
            emprestimo.emprestimoCalculo(valorEmprestimo, parcelas, juros);
        }else{
            greetingJava();
            System.out.println("Encerrando...");
        }

        scanner.close();
    }
}
