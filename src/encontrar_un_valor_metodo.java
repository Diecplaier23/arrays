import java.util.Arrays;
import java.util.Scanner;

public class encontrar_un_valor_metodo {
    public static void main(String[] args)
    {
        int[] numeros = new int[20];
        int numeroBuscado;;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        numeroBuscado = sc.nextInt();

        if (pertenece(numeros, numeroBuscado)) {
            System.out.printf("El número %d está en el array", numeroBuscado);
        } else {
            System.out.printf("El número %d NO está en el array", numeroBuscado);
        }
    }public static boolean pertenece(int[] numeros, int numeroABuscar) {
        for (int num : numeros) {
            if (num == numeroABuscar) {
                return true;
            }
        }
        return false;
    }

}
