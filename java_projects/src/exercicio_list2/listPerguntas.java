package exercicio_list2;

import java.util.*;

import static exercicio_list2.confirmacao.Confirmacao;

public class listPerguntas {
    public static void main(String[] args) {
        List<String> question = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        String confirmation;
        int verificacao = 0;
        question.add("Telefonou para a vítima?");
        question.add("Esteve no local do crime?");
        question.add("Mora perto da vítima?");
        question.add("Devia para a vítima?");
        question.add("Já trabalhou para a vítima?");


        for (int i = 0; i < 5; i++) {
            System.out.println(question.get(i));
            confirmation = scan.next();
            verificacao += Confirmacao(confirmation);
        }

        if (verificacao == 2) {
            System.out.println("Pessoa é Suspeita");
        } else if (verificacao == 3 || verificacao == 4) {
            System.out.println("Pessoa é Cúmplice");
        }else if (verificacao == 5) {
            System.out.println("Pessoa é Assassina");
        }else{
            System.out.println("Pessoa é Inocente");
        }

        //System.out.println(verificacao);

    }
}
