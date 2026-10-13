public class Ejercicio4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int media=0;

        for (int b : a) {
            media += b;
        }
        media = media / a.length;
        System.out.println("Tu media es " + media);
    }
}

