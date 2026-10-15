package Arrays2;

import java.util.Scanner;

public class Ejercicio3 {
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String BLANCO = "\u001B[97m";
    public static final String RESET = "\u001B[0m";
    public static void main(String[] args){
        int extension;
        Scanner sc = new Scanner(System.in);
        System.out.print(VERDE+"Introduce que tan grandes son los arrays:");
        extension = sc.nextInt();

        int a[]=new int[extension];

        System.out.println(VERDE+"Introduce "+BLANCO+extension+VERDE+" valores que quieras para el primer array"+RESET);
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }

        int buscado;
        System.out.print(VERDE+"Introduceel numero del que quieras la suma");
        buscado = sc.nextInt();

        for (int i = 0; i <a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j]== buscado) {
                    System.out.print(VERDE + "Los numeros "+BLANCO+a[i]+"+"+a[j] +VERDE+" hacen que el resultadode la suma sea "+ BLANCO+buscado+ "\n" + RESET);
                }
            }
        }
    }
}
