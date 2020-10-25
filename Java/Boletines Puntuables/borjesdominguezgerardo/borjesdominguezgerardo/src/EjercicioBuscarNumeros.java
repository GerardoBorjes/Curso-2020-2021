public class EjercicioBuscarNumeros {

    public static void main(String[] args) throws Exception {
        int nums[] = { 1, 2, 3, 4, 4, 2, 1, 4, 6, 3, 5, 2 };
        BuscarNumeros(nums, 4, 3);
    }

    /**
     * Función que recibe una matriz y una cantidad opcional de números enteros.
     * Escribe por consola la posición de los números en la matriz de forma cómoda a
     * la vista
     * 
     * @param matriz
     * @param n
     */
    static void BuscarNumeros(int matriz[], int... n) {

        for (int i : n) {
            boolean encontrado = false;
            String printarPosiciones = "";
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j] == i) {
                    if (!encontrado) {
                        printarPosiciones = i + " Aparece en la posición " + j;
                        encontrado = true;
                    } else {

                        printarPosiciones += ", " + j;
                    }

                }
            }
            if (printarPosiciones.contains(",")) {
                int ultimaComa = printarPosiciones.lastIndexOf(",");
                String coletilla = printarPosiciones.substring(ultimaComa);
                coletilla = coletilla.replaceAll(",", " y");
                printarPosiciones = printarPosiciones.substring(0, ultimaComa) + coletilla;
            }
            System.out.println(printarPosiciones);
        }

    }

}
