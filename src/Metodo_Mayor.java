import java.util.Scanner;

public class Metodo_Mayor {
    public static void main(String[] args) {
        int n,m,mayor;
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros enteros: ");
        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println("El mayor de los dos numeros es: " + mayor(n,m));
    }public static int mayor(int n, int m){
        if (n>m){
            return n;
        }else{
            return m;
        }
    }
}
