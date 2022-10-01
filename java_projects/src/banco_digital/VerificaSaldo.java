package banco_digital;

import static java.lang.System.exit;

public class VerificaSaldo  {

    public static boolean verificaSaldo(Double saldo, Double saque){
        if (saldo <= 0 || saldo < saque) {
            System.out.println("Saldo insuficiente:");
            System.out.println(saldo);
            return false;
        }else {
            System.out.println("Saque realizado:");
            //System.out.println(saque);
            saldo = saldo - saque;
            System.out.println(saque);
            System.out.println(saldo);
            return true;
        }
    }
}
