import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int longitud=10;
        int a[]=new int[longitud];
        int sumapos=0,sumaneg=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores que quieras");
        for (int i = 0; i < longitud; i++) {
            a[i]= sc.nextInt();
        }
        for (int i = 0; i <longitud; i++) {
            if (a[i]>=0){
                sumapos = sumapos+a[i];
            }else {
                sumaneg = sumaneg+a[i];
            }
        }
        System.out.println("La suma de los numeros es "+sumapos+ " y " + sumaneg);
    }
}
