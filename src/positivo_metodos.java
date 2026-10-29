import java.util.Scanner;

public class positivo_metodos {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numeros entero: ");
        n = sc.nextInt();
        System.out.println("Positivo: "+positivo(n));
    }
    public static boolean positivo(int n){
        return (n>=0);
    }
}
