import java.util.Arrays;
public class Ejercicio2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for (int i = a.length-1; i > 0; i--) {
            System.out.println(a[i]);
        }
        System.out.println(a[0]);
    }
}
