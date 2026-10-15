package Arrays2;

import java.util.Scanner;

public class Ejercicio2 {
    public static final String VERDE = "\u001B[32m";
    public static final String BLANCO = "\u001B[97m";
    public static final String RS = "\u001B[0m";
    public static void main(String[] args){
        int extension;
        Scanner sc = new Scanner(System.in);
        System.out.print(VERDE+"Introduce que tan grandes son los arrays:");
        extension = sc.nextInt();

        int a[]=new int[extension];
        int b[]=new int[extension];

        System.out.println(VERDE+"Introduce "+BLANCO+extension+VERDE+" valores que quieras para el primer array"+RS);
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println(VERDE+"Introduce "+BLANCO+extension+VERDE+" valores que quieras para el segundo array"+RS);
        for (int i = 0; i < b.length; i++) {
            b[i]= sc.nextInt();
        }
        for (int i = 0; i <a.length; i++){

            for (int j = 0; j <a.length; j++){
            if (a[i]==b[j]){
                System.out.print(VERDE+"El " +BLANCO+ a[i]+VERDE+" esta en ambos arrays \n"+RS);
            }
            }
        }

    }
}
