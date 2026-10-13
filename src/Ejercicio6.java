import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        int a[]={1,9,12,1111,12,1,8,1,989,87,897,};
        Arrays.sort(a);
        System.out.println("El menor numero es "+a[0]+" el mayor numero es "+a[a.length-1]);
    }
}
