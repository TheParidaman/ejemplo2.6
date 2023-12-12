package ejercicio2.pkg6;

import java.util.Scanner;

public class EJERCICIO26 {

    public static void main(String[] args) {
        System.out.println("Ingrese numero");

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("numero no valido");
        } else if(numero % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

    }
}
