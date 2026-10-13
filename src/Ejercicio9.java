public class Ejercicio9 {
    public static void main(String[] args) {
        int a[]={1,5,8,9,7,3,1,6};
        int pares=0, impares=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 ==0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("El array tiene "+ pares+" pares "+"y " +impares +" impares");
    }
}