import java.util.Scanner;

public class NOTAS_metodos {

        public static void main(String argv[]) {
            int nota = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce la nota del alumno (0-10): ");
            nota = sc.nextInt();

            System.out.println(nota(nota));

    }
    public static String nota(int nota) {
        if ((nota < 0) || (nota > 10)) {
            return("Nota inválida");
        }else if (nota < 3) {
            return("Muy deficiente");
        }else if (nota < 5 ) {
            // No hace falta que comprobemos que es mayor que 3, porque si lo fuera
            // habría entrado por el if (nota < 3) {
            return("Insuficiente");
        }else if (nota < 6 ) {
            return("Suficiente");
        }else if (nota < 7 ) {
            return("bien");
        }else if (nota < 9 ) {
            return("Notable");
        }else {
            return("Sobresaliente");
        }
    }
}
