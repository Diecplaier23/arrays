package Arrays2;

import java.util.Scanner;

public class Ejercicio1 {
    public static final String R = "\u001B[31m";
    public static final String V = "\u001B[32m";
    public static final String B = "\u001B[97m";
    public static final String RS = "\u001B[0m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(V + "¿Cuántos valores quieres introducir? " + RS);
        int cantidad = sc.nextInt();

        int a[] = new int[cantidad];

        System.out.println(V + "Introduce los valores que quieras:" + RS);

        for (int i = 0; i < cantidad; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Valores duplicados:");

        boolean duplicado;

        for (int i = 0; i < cantidad; i++) {
            duplicado = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    duplicado = true;
                    break;
                }
            }

            if (duplicado) {
                continue;
            }

            for (int j = i + 1; j < cantidad; j++) {
                if (a[i] == a[j]) {
                    System.out.println(R + a[i] + RS);
                    break;
                }
            }
        }

        sc.close();
    }
}

