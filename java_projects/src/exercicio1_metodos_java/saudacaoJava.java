package exercicio1_metodos_java;

import java.util.Calendar;

public class saudacaoJava {

    public static void  greetingJava(){

        Calendar data = Calendar.getInstance();
        int horas = data.get(Calendar.HOUR_OF_DAY);

        if (horas >= 6 && horas < 12) {
            System.out.println("Bom Dia!");
        } else if (horas >= 12 && horas < 18) {
            System.out.println("Boa Tarde!");
        } else if (horas >= 18 && horas < 24) {
            System.out.println("Boa Noite!");
        } else if (horas >= 0 && horas < 6) {
            System.out.println("Boa Madrugada!");
        }else {
            System.out.println("Erro: Horário inválido");
        }
    }

}
