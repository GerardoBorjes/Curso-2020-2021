import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Zona de declaración de variables
        Scanner gbdreader;
        int gbdarray[] = new int[100];
        int gbdopcion;
        boolean gbdContinuar = true;
        // -----------------

        for (int i = 0; i < gbdarray.length; i++) {
            gbdarray[i] = gbdRangoAleatorio(0, 101);
        }

        do {
            gbdreader = new Scanner(System.in);
            System.out.println("Selecciona una opción del menú");
            System.out.println("1. Valores superiores en la matriz a uno dado");
            System.out.println("2. Calcular la media de los 50 primeros valores");
            System.out.println("3. Mostrar los 10 primeros valores superiores a 20 y sus posiciones");
            System.out.println("4. Mostrar por pantalla el primer valor inferior a uno introducido por el usuario");
            System.out.println("5. Mostrar por pantalla los valores de la matriz que sean primos");
            System.out.println("6. Mostrar el valor más alto, el más bajo, segundo más alto y segundo más bajo");
            System.out.println("7. Escribir en binario los múltiplos de 3 y 5");
            System.out.println("8. Salir");
            gbdopcion = gbdreader.nextInt();
            switch (gbdopcion) {
                case 1:
                    System.out.println("Introduce un valor, se mostrarán los valores de la matriz superiores al mismo");
                    gbdSuperiores(gbdreader.nextInt(), gbdarray);
                    break;
                case 2:
                    System.out.println(
                            "La media de los 50 primeros valores de la matriz es: " + gbdMediaValores(gbdarray, 50));
                    break;
                case 3:
                    gbdSuperiores(20, gbdarray, 10);
                    break;
                case 4:
                    System.out
                            .println("Introduce un valor, se mostrará el primer valor de la matriz inferior al mismo");
                    gbdInferiores(gbdreader.nextInt(), gbdarray, 1);
                    break;
                case 5:
                    gbdPrimos(gbdarray);
                    break;
                case 6:
                    // Declaramos variables, las he igualado todas al primer valor de la matriz
                    int gbdSubMax = gbdarray[0], gbdMax = gbdarray[0];
                    int gbdSubMin = gbdarray[0], gbdMin = gbdarray[0];

                    // Recorremos la matriz, desde el 1, porque el 0 es el valor asignado de las
                    // variables.
                    for (int i = 1; i < gbdarray.length; i++) {
                        // Si el número es más grande que el número más grando que hayamos visto en la
                        // matriz
                        if (gbdarray[i] > gbdMax) {
                            // Entonces le pasamos el valor más grande conocido hasta el momento a SubMax
                            gbdSubMax = gbdMax;
                            // Y la variable Max adquiere el nuevo valor más grande.
                            gbdMax = gbdarray[i];
                        }
                        // Este if hace exactamente lo mismo que el anterior pero con los valores más
                        // pequeños
                        if (gbdarray[i] < gbdMin) {
                            gbdSubMin = gbdMin;
                            gbdMin = gbdarray[i];
                        }
                    }

                    // Al final del bucle todas las variables adquieren el valor que buscábamos en
                    // cada una
                    System.out.println("El valor más grande es: " + gbdMax + " Y el segundo es: " + gbdSubMax);
                    System.out.println("El valor más pequeño es: " + gbdMin + " Y el segundo es: " + gbdSubMin);
                    break;
                case 7:
                    // Recorremos el array
                    for (int i : gbdarray) {
                        if (i == 0) {
                            // Para evitar que el 0 aparezca como resultado, mejor si aparece un 0, lo
                            // ignoramos.
                            continue;
                        }
                        // Si el número es múltiplo de 3 y 5
                        if (i % 3 == 0 && i % 5 == 0) {
                            // Lo escribimos en binario por consola
                            System.out.print(Integer.toBinaryString(i) + ", ");
                        }
                    }
                    break;
                case 8:
                    gbdContinuar = false;
                default:
                    break;
            }

        } while (gbdContinuar);

        gbdreader.close();
    }

    // #region Métodos
    // #region Metodo para números superiores en la matriz
    /**
     * Escribe por consola los valores superiores al valor dado que se encuentren
     * dentro de una matriz dada.
     * 
     * @param valor
     */
    static void gbdSuperiores(int valor, int[] array) {
        // Recorremos la matriz con un bucle foreach
        for (int i : array) {
            // Si el elemento de la matriz es superior al valor dado, lo escribimos por
            // pantalla.
            if (i > valor) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Escribe por consola los valores superiores al valor dado que se encuentren
     * dentro de una matriz dada .Solo escribirá valores hasta que alcance el
     * límite;
     * 
     * @param valor
     * @param array
     * @param limite
     */
    static void gbdSuperiores(int valor, int[] array, int limite) {
        // Esta vez declaramos un contador
        int gbdcontador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > valor) {
                // Si el elemento de la matriz es superior al valor dado, lo escribimos por
                // pantalla junto a su posición
                System.out.println(array[i] + " en la posición: " + i);
                gbdcontador++;
            }
            // Cuando el contador sea igual al límite (10 en caso de este ejercicio) salimos
            // del bucle y dejamos de comparar valores
            if (gbdcontador == limite)
                break;
        }

    }
    // #endregion

    // #region Metodos para números inferiores en la matriz
    /**
     * Escribe por consola los valores inferiores al valor dado que se encuentren
     * dentro de una matriz dada.
     * 
     * @param valor
     */
    static void gbdInferiores(int valor, int[] array) {
        // Recorremos la matriz con un bucle foreach
        for (int i : array) {
            // Si el elemento de la matriz es inferior al valor dado, lo escribimos por
            // pantalla.
            if (i < valor) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Escribe por consola los valores inferiores al valor dado que se encuentren
     * dentro de una matriz dada .Solo escribirá valores hasta que alcance el
     * límite;
     * 
     * @param valor
     * @param array
     * @param limite
     */
    static void gbdInferiores(int valor, int[] array, int limite) {
        // declaramos un contador
        int gbdcontador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < valor) {
                // Si el elemento de la matriz es inferior al valor dado, lo escribimos por
                // pantalla junto a su posición
                System.out.println("El " + array[i] + " en la posición: " + i);
                gbdcontador++;
            }
            // Cuando el contador sea igual al límite salimos
            // del bucle y dejamos de comparar valores
            if (gbdcontador == limite)
                break;
        }

    }

    // #endregion

    static void gbdPrimos(int[] array) {
        for (int i : array) {
            if (i < 2) {
                // El 0 y el 1 no son considerados primos, por eso, en el caso excepcional de
                // que la matriz contenga estos números, pasaremos al siguiente dato.
                continue;
            }
            // Creamos una variable de control para determinar si el número es primo al
            // final del bucle anidado
            boolean gbdprimo = true;
            // Para encontrar un número primo basta con comprobar que no sea divisible entre
            // los enteros entre el 2 y su raíz cuadrada
            // Hacemos un bucle iniciado en el 2 que recorra todos los números entre el 2 y
            // la raíz cuadrada del número de la matriz.
            for (int j = 2; j <= Math.ceil(Math.sqrt(i)); j++) {
                // Su el resto es 0, quiere decir que tiene otro divisor, por lo tanto no es
                // primo.
                if (i % j == 0) {
                    // Cambiamos la variable de control y salimos de este bucle.
                    gbdprimo = false;
                    break;
                }
            }
            if (gbdprimo) {
                System.out.println(i + " Es un número primo");
            }

        }
    }

    /**
     * Devuelve un número aleatorio comprendido entre dos enteros dados,
     * mínimo[inclusivo] y máximo [exclusivo]
     * 
     * @param min
     * @param max
     * @return
     */
    static int gbdRangoAleatorio(int min, int max) {
        // Declaramos una variable de tipo Random
        Random gbdrnd = new Random();
        // Utilizamos la función nextInt para devolver un número aleatorio comprendido
        // en el rango
        // dado
        return gbdrnd.nextInt(max - min) + min;
    }

    /**
     * Devuelve la media de todos los valores de una matriz
     * 
     * @param array
     * @return
     */

    static float gbdMediaValores(int[] array) {
        int gbdsuma = 0;
        for (int i = 0; i < array.length; i++) {
            gbdsuma += array[i];
        }
        return gbdsuma / array.length;
    }

    /**
     * Devuelve la media de los primeros valores del rango en una matriz
     * 
     * @param array
     * @param rango
     * @return
     */
    static float gbdMediaValores(int[] array, int rango) {
        int gbdsuma = 0;
        for (int i = 0; i < rango; i++) {
            gbdsuma += array[i];
        }
        return gbdsuma / rango;
    }

    // #endregion
}