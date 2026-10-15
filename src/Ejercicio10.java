import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int posicion = 0;
        int a[]=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 valores que quieras");
        for (int i = 0; i < 10; i++) {
            a[i]= sc.nextInt();
        }

        System.out.println("Introduce que numero quieres buscar");
        int buscar = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (buscar == a[i]) {
                posicion = i+1;
                break;
            } else {
                posicion = -1;
            }
        }
        if (posicion != -1) {
            System.out.println("El numero que querias esta en la posicion " + posicion);
        } else
            System.out.println("El numero que quieres buscar no esta en el array, error " + posicion);
    }

    }
