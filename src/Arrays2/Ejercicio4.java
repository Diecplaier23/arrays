package Arrays2;

/*arreglo ncesario, hacer todo lo que pide, esta como lo hizo vicotor */
public class Ejercicio4 {
        public static final String ROJO = "\u001B[31m";
            public static final String VERDE = "\u001B[32m";
            public static final String BLANCO = "\u001B[97m";
            public static final String RESET = "\u001B[0m";
            public static void main(String[] args){

            int[]num ={1,5,3,2,9};
            int posicion_borrar=1;
            for(int i =posicion_borrar; i <num.length -1; i++){
                num[i]=num[i+1];

            }
            num[num.length-1]=0;
            for (int i = 0; i < num.length; i++) {
                System.out.print(" " +BLANCO+ num[i]);
            }



        }
}
