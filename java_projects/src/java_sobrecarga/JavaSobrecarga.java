package java_sobrecarga;

import java.util.Scanner;

import static java_sobrecarga.CalculoArea.area;

public class JavaSobrecarga {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int base1, base2, altura;


        System.out.println("Base1: ");
        base1 = scan.nextInt();
        System.out.println("Area: " + area(base1));

        System.out.println("------------------------------------------------");

        System.out.println("Base1: ");
        base1 = scan.nextInt();
        System.out.println("Base2: ");
        base2 = scan.nextInt();
        System.out.println("Area: " + area(base1, base2));

        System.out.println("------------------------------------------------");

        System.out.println("Base1: ");
        base1 = scan.nextInt();
        System.out.println("Base2: ");
        base2 = scan.nextInt();
        System.out.println("Altura: ");
        altura = scan.nextInt();
        System.out.println("Area: " + area(base1, base2, altura));

    }
}
