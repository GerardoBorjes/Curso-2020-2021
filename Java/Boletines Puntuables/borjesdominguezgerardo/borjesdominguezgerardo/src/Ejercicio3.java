import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {

    // Defino el Scanner aquí para no tener problemas más tarde al cerrarlo o
    // utilizarlo
    static Scanner gbdreader = new Scanner(System.in);

    public static void main(String[] args) {
        boolean gbdsalir = false;
        do {
            System.out.println("Elije un nivel de dificultad");
            System.out.println("1.Fácil\n2.Normal\n3.Difícil\n4.Salir");

            int gbdopcion = gbdreader.nextInt();
            switch (gbdopcion) {
                case 1:
                    GbdJuegoDeAdivinar(15, 3);
                    break;

                case 2:
                    GbdJuegoDeAdivinar(30, 4);
                    break;

                case 3:
                    GbdJuegoDeAdivinar(50, 5);
                    break;
                case 4:
                    gbdsalir = true;
                    break;
                default:
                    gbdsalir = true;
                    break;
            }
        } while (!gbdsalir);

    }

    // He decidido crear un método para hacer el juego, que recibe el número más
    // alto y el número de vida
    static void GbdJuegoDeAdivinar(int numeros, int vidas) {
        // Creamos una variable que guarde la solución del juego
        int gbdSolucion = GbdRangoAleatorio(1, numeros + 1);
        System.out.println("Intenta adivinar el número, es un número entre el 1 y el " + numeros + " y tienes " + vidas
                + " intentos");

        // El bucle se repite mientras tengas vidas
        do {

            gbdreader = new Scanner(System.in);
            System.out.println("Prueba a adivinar el número. Vidas: " + vidas);
            // El usuario introduce un intento
            int gbdIntento = gbdreader.nextInt();
            // Si fallamos por debajo, recibimos un mensaje diciendo que el número es más
            // alto
            if (gbdIntento < gbdSolucion) {
                System.out.println("El número es más grande");
                // Si nos pasamos nos dirá que el número es menor
            } else if (gbdIntento > gbdSolucion) {
                System.out.println("El número es más pequeño");
            } else {
                // En cualquier otro caso, quiere decir que hemos acertado, así que salimos del
                // bucle;
                break;
            }
            // Si no llegamos al break anterior, perderemos una vida antes de la siguiente
            // iteración del bucle
            vidas--;

        } while (vidas > 0);
        // Si hemos salido del bucle y nos quedaban vidas, habremos ganado
        if (vidas > 0) {
            System.out.println("HAS GANADO!");
        } else {
            // De otra forma, habremos perdido
            System.out.println("Has perdido, el número era el " + gbdSolucion + " mejor suerte la próxima vez");
        }
    }

    /**
     * Devuelve un número aleatorio comprendido entre dos enteros dados,
     * mínimo[inclusivo] y máximo[exclusivo]
     * 
     * @param min
     * @param max
     * @return
     */
    static int GbdRangoAleatorio(int min, int max) {
        // Declaramos una variable de tipo Random
        Random gbdrnd = new Random();
        // Utilizamos la función nextInt para devolver un número aleatorio comprendido
        // en el rango
        // dado
        return gbdrnd.nextInt(max - min) + min;
    }
}
