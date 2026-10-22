package Arrays2;

import java.nio.charset.CharacterCodingException;
import java.util.Scanner;

public class EstacionMeteorologica {

    // Colores ANSI para mostrar los textos en diferentes colores
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m"; // Cian claro
    public static final String RS = "\u001B[0m";   // Restablece el color original

    public static void main(String[] args) {

        // Array con los días de la semana
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        // Carácter que se utilizará para dibujar las barras del gráfico
        String caracter = "▊";
        // Variable para guardar temporalmente cada temperatura introducida
        float temps = 0;
        // Array que almacena las temperaturas de los siete días
        double[] temp = new double[dias.length];
        // Variable que acumula las temperaturas para calcular la media
        float media_semana = 0;
        // Número de espacios utilizados para alinear los días en el gráfico
        int espacios = 12;
        // Variable que almacena el color correspondiente a cada temperatura
        String color = "";
        // Permite leer los datos introducidos por teclado
        Scanner sc = new Scanner(System.in);

        // Recorre todos los días de la semana para pedir sus temperaturas
        for (int i = 0; i < dias.length; i++) {

            do {
                System.out.print("Introduce la temperatura del " + dias[i] + ": ");
                                temps = sc.nextFloat();
                // Comprueba que la temperatura esté entre -30 y 50 grados
                if (temps < -30 || temps > 50) {
                    System.out.println(R + "Error: la temperatura debe estar entre "
                            + B + "-30" + RS + " y " + B + "50" + R
                            + " ºC. Vuelve a introducirla." + RS);
                }

            } while (temps < -30 || temps > 50);

            // Guarda la temperatura en la posición correspondiente al día
            temp[i] = temps;
            media_semana += temp[i];
        }
        // Muestra las temperaturas registradas para cada día
        for (int i = 0; i < dias.length; i++) {
            System.out.print("La temperatura del " + dias[i] + " es: "
                    + V + temp[i] + RS + "\n");
        }
        // Calcula y muestra la media de las temperaturas de toda la semana
        System.out.printf("\nLa media de la semana es: %s%.2f%s ºC%n",
                V, media_semana / dias.length, RS);
        // Guarda las posiciones del array donde están la temperatura máxima y mínima

        // Se empieza por la posición 0, que corresponde al lunes
        int diaMaxima = 0;
        int diaMinima = 0;
        // Recorre las temperaturas para encontrar la máxima y la mínima
        for (int i = 1; i < temp.length; i++) {
            // Si encuentra una temperatura mayor, actualiza su posición
            if (temp[i] > temp[diaMaxima]) {
                diaMaxima = i;
            }
            // Si encuentra una temperatura menor, actualiza su posición
            if (temp[i] < temp[diaMinima]) {
                diaMinima = i;
            }
        }
        // Muestra la temperatura máxima e indica el día en que se registró
        System.out.println("La temperatura máxima fue " + V + temp[diaMaxima]
                + RS + " ºC el " + dias[diaMaxima] + ".");
        // Muestra la temperatura mínima e indica el día en que se registró
        System.out.println("La temperatura mínima fue " + V + temp[diaMinima]
                + RS + " ºC el " + dias[diaMinima] + ".");
        // Muestra los días en los que la temperatura superó la media semanal
        System.out.println("\nDías que superaron la media:");
        // Indica si se ha encontrado algún día por encima de la media
        boolean algunDiaSobreMedia = false;
        // Recorre todas las temperaturas para compararlas con la media
        for (int i = 0; i < temp.length; i++) {
            // Comprueba si la temperatura del día supera la media semanal
            if (temp[i] > media_semana / dias.length) {
                // Muestra el día y su temperatura
                System.out.println(dias[i] + ": " + V + temp[i] + RS + " ºC");
                // Indica que al menos un día ha superado la media
                algunDiaSobreMedia = true;
            }
        }
        // Si ningún día ha superado la media, muestra un mensaje
        if (!algunDiaSobreMedia) {
            System.out.println("Ningún día superó la media.");
        }
        // Guarda la posición del primer día de la mayor subida de temperatura
        // El valor -1 indica que todavía no se ha encontrado ninguna subida
        int inicioMayorSubida = -1;
        // Guarda la diferencia de temperatura de la mayor subida encontrada
        double mayorSubida = 0;
        // Compara cada día con el día anterior
        for (int i = 1; i < temp.length; i++) {
            // Calcula cuánto ha cambiado la temperatura entre dos días consecutivos
            double subida = temp[i] - temp[i - 1];
            // Comprueba si la subida actual es mayor que la anterior
            if (subida > mayorSubida) {
                // Actualiza la mayor subida encontrada
                mayorSubida = subida;
                // Guarda la posición del día anterior al de la subida
                inicioMayorSubida = i - 1;
            }
        }
        // Si se ha encontrado alguna subida, muestra los dos días y la diferencia
        if (inicioMayorSubida >= 0) {
            System.out.printf("La mayor subida fue entre %s y %s: %.2f ºC.%n",
                    dias[inicioMayorSubida],
                    dias[inicioMayorSubida + 1],
                    mayorSubida
            );
            // Si no hay ninguna subida positiva, muestra un mensaje
        } else {
            System.out.println("No hubo subidas de temperatura entre días consecutivos.");
        }
        // Muestra el título del gráfico de temperaturas
        System.out.println("\nGrafico de temperaturas:");
        // Recorre los días para dibujar una barra por cada temperatura
        for (int i = 0; i < dias.length; i++) {
            // Calcula los espacios necesarios para alinear los nombres de los días
            int espaciosNecesarios = espacios - dias[i].length();
            String espaciosAlineacion = " ".repeat(espaciosNecesarios);
            // Selecciona el color de la barra según la temperatura
            if (temp[i] < 0) {
                color = C;
                caracter ="▯";
            } else if (temp[i] >= 0 && temp[i] < 10) {
                color = CC;
                caracter = "▊";
            } else if (temp[i] >= 10 && temp[i] < 20) {
                color = V;
                caracter = "▊";
            } else if (temp[i] >= 20 && temp[i] < 30) {
                color = A;
                caracter = "▊";
            } else if (temp[i] >= 30 && temp[i] <= 50) {
                color = R;
                caracter = "▊";
            }
            /* Dibuja una barra cuya longitud corresponde al valor absoluto de la temperatura, convirtiéndolo a entero para repetir el carácter*/
            System.out.println(dias[i] + espaciosAlineacion + color + caracter.repeat((int) Math.abs(temp[i])) + " " + temp[i] + RS);
        }
        // Muestra la leyenda para identificar los colores del gráfico
        System.out.println("\nLeyenda: "
                + C + " ▊ bajo 0" + RS + ", "
                + CC + " ▊ 0-9" + RS + ", "
                + V + " ▊ 10-19" + RS + ", "
                + A + " ▊ 20-29" + RS + ", "
                + R + " ▊ 30-50" + RS);

        sc.close();
    }
}