package Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String BLANCO = "\u001B[97m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args) {

        int extension;
        Scanner sc = new Scanner(System.in);
        System.out.print(VERDE + "Introduce que tan grandes son los arrays:");
        extension = sc.nextInt();

        int a[] = new int[extension];
        int b[] =new int [extension];

        System.out.println(VERDE + "Introduce " + BLANCO + extension + VERDE + " valores que quieras para el primer array" + RESET);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < extension; i++) {
            b[i]=a[a.length-1-i];
        }

        System.out.print(VERDE+"El resultado es:");
        for (int i = 0; i < extension; i++) {
            System.out.print(" " +BLANCO+ b[i]);
        }

    }
}
