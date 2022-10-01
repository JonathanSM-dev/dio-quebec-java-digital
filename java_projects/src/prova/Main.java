package prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 4;
        int[] eventos = new int[n];

        Battery battery = new Battery();
        for (int i = 0; i < n; i++) {
            eventos[i] = scan.nextInt();
        }


        battery.getBattery(eventos[0], eventos[1], eventos[2], eventos[3]);


    }
}
