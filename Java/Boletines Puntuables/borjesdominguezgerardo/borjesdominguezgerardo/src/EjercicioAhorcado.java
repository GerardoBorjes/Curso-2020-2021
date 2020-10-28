import java.util.Random;
import java.util.Scanner;

public class EjercicioAhorcado {

    // Declaro el Scanner aquí por comodidad.
    static Scanner gBDreader = new Scanner(System.in);

    public static void main(String[] args) {
        // Defino una variable con las vidas y una matriz con las posibles palabras del
        // juego
        int çvidas = 7;
        String çpalabras[] = { "secador", "dinosaurio", "ninja", "gato", "oscuridad", "brujo", "halloween", "siesta",
                "comida", "helado", "camino", "jirafa", "atuendo" };
        Random çrnd = new Random();
        // Elijo una palabra al azar con la ayuda de la clase Random
        String çSolcion = çpalabras[çrnd.nextInt(çpalabras.length)];
        // Hago dos arrays de caracteres a partir de la solución, uno que verá el
        // usuario y otro que usaremos para comprobar los intentos del usuario
        char çAdivinanza[] = çSolcion.toCharArray();
        char çSolcionEnChars[] = çSolcion.toCharArray();

        // Lleno el array que verá el usuario de guiones
        for (int i = 0; i < çAdivinanza.length; i++) {
            çAdivinanza[i] = '-';
        }
        // Este es el bucle de juego
        do {
            // Al principio de cada ronda se pinta el array de caracteres con guiones
            for (char c : çAdivinanza) {
                System.out.print(c);
            }
            // Esta variable de control la utilizaré para saber si debo restar vidas al
            // jugador
            boolean çacierto = false;
            System.out.println("\nIntroduce una letra, tienes " + çvidas + " oportunidades");

            // Utilizamos el lector para recoger el caracter escrito por el usuario
            char çintento = gBDreader.nextLine().charAt(0);

            for (int i = 0; i < çSolcionEnChars.length; i++) {
                // Comprobamos si la letra del usuario está en el array de chars con todas las
                // letras
                if (çSolcionEnChars[i] == çintento) {
                    // Si está, igualamos la posición del array de guiones al caracter del usuario
                    çAdivinanza[i] = çintento;
                    // Cambiamos la variable de control antes mentada a true para no restar vidas al
                    // usuario
                    çacierto = true;
                }
            }
            // Si no acertó, le restamos una vida
            if (!çacierto) {
                çvidas--;
            }
            // Si no tiene vidas, salimos del bucle
            if (çvidas <= 0) {
                break;
            }
            // El bucle volverá a repetirse mientras el array de guiones siga conteniendo
            // algún guión
        } while (String.valueOf(çAdivinanza).contains("-"));
        // Si hemos salido del bucle con vidas, entonces hemos ganado
        if (çvidas > 0) {
            System.out.println("Has ganado! la palabra era " + çSolcion);
            // En otro caso, habremos perdido
        } else {
            System.out.println("Has perdido, lo siento. La palabra era " + çSolcion);
        }

    }

}
