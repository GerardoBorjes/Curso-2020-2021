
import java.util.Random;
import java.util.Scanner;

public class EjercicioFlota {
    // Declaro el Scanner aquí por comodidad.
    static Scanner gBDreader = new Scanner(System.in);

    public static void main(String[] args) {

        int gBDNumeroBarcos = 10;
        // Creo el tablero del juego, una matriz 2D de 8*8 llena de ceros
        int gBDtablero[][] = new int[8][8];
        for (int i = 0; i < gBDtablero.length; i++) {
            for (int j = 0; j < gBDtablero[0].length; j++) {
                gBDtablero[i][j] = 0;
            }
        }

        // Creo una matriz con los barcos, el jugador no podrá verla durante su partida
        int gBDbarcos[][] = new int[8][8];

        for (int i = 0; i < gBDbarcos.length; i++) {
            for (int j = 0; j < gBDbarcos[0].length; j++) {
                gBDbarcos[i][j] = 0;
            }
        }

        // Con el siguiente bucle lleno la matriz de barcos con 10 barcos en este caso
        for (int i = 0; i < gBDNumeroBarcos; i++) {

            // La fila y la columna del barco será un número aleatorio entre el 0 y el 7
            int gBDFila = GbdRangoAleatorio(0, 8);
            int gBDColumna = GbdRangoAleatorio(0, 8);

            // Si ya existía un barco en esa posición reduzco la variable de iteración en 1
            // para asegurarme de que siempre habrá 10 barcos al final del bucle
            if (gBDbarcos[gBDFila][gBDColumna] == 1) {
                i--;
            } else {
                gBDbarcos[gBDFila][gBDColumna] = 1;
            }

        }
        // Éste es el bucle del juego
        do {
            // Al principio de cada iteración pinto la matriz del tablero.
            gBDPintarMatriz2D(gBDtablero);

            // El usuario introduce por teclado las coordenadas, siempre resto 1 al número
            // para que cuadren con el índice correspondiente
            gBDreader = new Scanner(System.in);
            System.out.println("Introduce fila entre el 1 y el 8");
            int gBDFila = gBDreader.nextInt() - 1;
            System.out.println("Introduce columna entre el 1 y el 8");
            int gBDColumna = gBDreader.nextInt() - 1;

            // Si en la posición habíaun barco, también aparecerá un 1 en la posición del
            // tablero y se restará 1 al número de barcos
            if (gBDbarcos[gBDFila][gBDColumna] == 1) {
                gBDtablero[gBDFila][gBDColumna] = 1;
                gBDNumeroBarcos--;
                System.out.println("TOCADO!");
                continue;
            }
            // Si no accedemos al if anterior, significará que hemos fallado
            System.out.println("No había ningún barco en " + (gBDFila + 1) + ", " + (gBDColumna + 1));

        } while (gBDNumeroBarcos > 0);
        // Si salimos del bucle significa que no quedan barcos y por tanto hemos ganado
        System.out.println("HAS GANADO!");

        gBDreader.close();
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

    /**
     * Muestra por pantalla el contenido de una matriz 2D representado en cuadrícula
     * 
     * @param gBDtablero
     */
    static void gBDPintarMatriz2D(int gBDtablero[][]) {

        for (int i = 0; i < gBDtablero.length; i++) {
            for (int j = 0; j < gBDtablero[0].length; j++) {
                System.out.print(gBDtablero[i][j] + " ");
            }
            System.out.println();
        }

    }

}
