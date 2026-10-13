import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a[]={1,5,8,9,7,3,1,6};
        int max= a[1], min=a[1];
        for (int i = 0; i < a.length; i++) {
            if (max >a[i]){
                max=a[i];
            }
            if (min <a[i]){
                min =a[i];
            }
        }
        System.out.println("El numero mas grande es "+max+" y el mas pequeño es "+ min);
    //Lo mismo pero más facil
        Arrays.sort(a);
        System.out.println("El numero mas grande es " +a[0] +" y el mas pequeño es "+ a[a.length-1]);
    }
}
