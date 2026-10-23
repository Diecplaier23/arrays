package Arrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m"; // Cian claro
    public static final String RS = "\u001B[0m";   // Restablece el color original
    static final String[] DIBUJOS = {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
    };
    public static void main(String[] args){
        String[] toas_palabras = {
                "helicoptero", "bibliotecario", "piramide", "volcan", "murcielago", "serpiente",
                "tortuga", "rinoceronte", "ardilla", "destornillador", "frigorifico",
                "lavadora", "ventilador", "impresora", "semaforo", "carretera", "aeropuerto",
                "hospital", "restaurante", "universo", "galaxia", "planeta", "meteorito",
                "electricidad", "programacion", "videojuego", "laberinto", "esqueleto", "fantasma"};

        Random random = new Random();
        int palabra_aleaotria = random.nextInt(toas_palabras.length);
        int intentos=0;
        int intentos_restantes = DIBUJOS.length-1;
        int aparece=0;
        String palabra = toas_palabras[palabra_aleaotria];
        char[] letras = palabra.toCharArray();
        char[] caracteres = new char[letras.length];
        Arrays.fill(caracteres, '_');
        ArrayList<String> usadas = new ArrayList<>();
        ArrayList<String> errores = new ArrayList<>();
        /*Tester*/
        System.out.println(palabra);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce una letra, o si la conoces la palabra correcta: ");
            String imput = sc.nextLine();
            if (imput.equals(palabra)) {
                System.out.println(V + "Has acertado la palabra, en hora buena" + RS);
            }else if (imput.length() != 1 && Character.isLetter(imput.charAt(0))){
                System.out.println(R + "Error: Introduce solo una letra" + RS);
            } else if (!Character.isLetter(imput.charAt(0))) {
                System.out.println(R + "Error: No puedes introducir números ni símbolos" + RS);
            } else if (usadas.contains(imput)) {
                System.out.println(R + "Error: Ya has introducido esa letra" + RS);
            } else {
                usadas.add(imput);
                if (palabra.contains(imput)) {
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == imput.charAt(0)) {
                            caracteres[i] = imput.charAt(0);
                            aparece++;
                        }
                    }
                    System.out.println(DIBUJOS[intentos]);
                    System.out.print(V+"Palabra: "+RS);
                    System.out.println(caracteres);
                    System.out.print(V+"Tienes estas letras mal:"+B+errores+V+RS+"\n");
                    System.out.print(V+"Te quedan: "+ B+(intentos_restantes-intentos) +V+" intentos restantes para perder"+RS+"\n");
                    System.out.println(V+"Letra: "+B+imput+RS);
                    System.out.print(V+"!Bien¡ La '"+B+imput+V+"' aparece en la palabra "+B+aparece+V+" veces"+RS+"\n");
                } else {
                    errores.add(imput);
                    intentos++;

                }
            }
        } while (intentos < intentos_restantes);
        System.out.print("\n");
        System.out.print(R+"Has perdido :("+RS+"\n");
        System.out.print(V+"La palabra era "+palabra+RS+"\n");
    }
}
