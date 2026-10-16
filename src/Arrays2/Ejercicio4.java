package Arrays2;

import java.util.Scanner;

public class Ejercicio4 {
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String BLANCO = "\u001B[97m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = {1, 5, 3, 2, 9};
        int posicion_borrar;

        do {
            System.out.print(VERDE + "Introduce el índice que quieres borrar: " + RESET);
            posicion_borrar = sc.nextInt();
        } while (posicion_borrar < 0 || posicion_borrar >= num.length);

        for (int i = posicion_borrar; i < num.length - 1; i++) {
            num[i] = num[i + 1];
        }

        num[num.length - 1] = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print(" " + BLANCO + num[i] + RESET);
        }

    }
}
