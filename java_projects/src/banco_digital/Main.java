package banco_digital;
public class Main {

    public static void main(String[] args) {
        ContaPoupanca JonathanP = new ContaPoupanca();
        //System.out.println("Conta Poupança criada");
        ContaCorrente JonathanC = new ContaCorrente();
        //System.out.println("Conta Corrente criada");

        JonathanP.setSaldo(120000.0);
        System.out.println(JonathanP.getSaldo());
        JonathanC.setSaldo(120000.0);
        System.out.println(JonathanC.getSaldo());
        System.out.println("Valor após depósito:");
        System.out.println(JonathanP.depositar(600));
        JonathanC.transferir(1200, JonathanP);
        System.out.println(JonathanP.getSaldo());
        System.out.println(JonathanC.getSaldo());
        JonathanP.sacar(1200);
        System.out.println(JonathanP.getSaldo());

    }

}