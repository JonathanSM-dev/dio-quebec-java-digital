package exercicio_list2;

public class confirmacao {
    public static  int Confirmacao(String confirmation) {
        int verification = 0;
        if (confirmation != null){
            if (confirmation.startsWith("s") || confirmation.startsWith("S")){
                verification++;
            }
        }

        return verification;
    }
}
