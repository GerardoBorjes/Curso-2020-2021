package src;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {

    public static void main(String[] args) {

    }

    public void ExModuloVectorial() {
        double a = Boletin1.readDoubleScan("Introduzca Valor de a: ");
        double b = Boletin1.readDoubleScan("Introduzca Valor de b: ");
        double c = Boletin1.readDoubleScan("Introduzca Valor de c: ");

        Boletin1.println("El módulo de los valores introducidos es: "
                + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
    }

    public void ExMaximoYMinimoDeDos() {
        int primerValor = Boletin1.readIntScan("Introduzca el primer valor: ");
        int segundoValor = Boletin1.readIntScan("Introduzca el segundo valor: ");

        Boletin1.println("El máximo de los dos es " + Math.max(primerValor, segundoValor) + " y  el mínimo es "
                + Math.min(primerValor, segundoValor));

    }

    public void ExMaximoYMinimoDeTres() {
        int[] VarInts = new int[3];
        int max, min;
        for (int i = 0; i < VarInts.length; i++) {

            VarInts[i] = Boletin1.readIntScan("Introduce el valor " + (i + 1) + " :");

        }
        max = min = VarInts[0];
        for (int i : VarInts) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        Boletin1.println("El valor más alto fue: " + max + " Y el más bajo fue " + min);
    }

    public void ExObtenerMail() {
        String mail = Boletin1.readStringScan("Introduzca su dirección de correo: ");
        Boletin1.println("La dirección de su mail es " + mail.substring(mail.lastIndexOf("@") + 1));
    }

    public void ExCalcularLetraDni() {
        char[] dniChars = new char[] { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
                'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
        int dniNum = Boletin1.readIntScan("Introduzca los números de su dni: ");
        Boletin1.println("La letra de su dni es: " + dniChars[dniNum % 23]);
    }

    public void ExMatriz5Enteros() {
        Random rand = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101);
        }
        Boletin1.println("Primer valor almacenado " + arr[0] + " \n Último valor almacenado: " + arr[arr.length - 1]);
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrCopy);

        Boletin1.println(Arrays.toString(arr));
        Boletin1.println(Arrays.toString(arrCopy));
        int searchNum = Boletin1.readIntScan("Introduzca un número para buscar su índice en la matriz ordenada: ");
        Boletin1.println("El índex encontrado fue:  " + Arrays.binarySearch(arrCopy, searchNum));
    }

    public void ExFiltrosEnString() {

        String st = Boletin1.readStringScan("Introduzca un texto: ");
        String[] words = st.split(" ");
        Boletin1.println("El texto estaba compuesto por " + words.length + " Palabras");
        for (String string : words) {

            Boletin1.println("El primer caracter de " + string + " es " + string.charAt(0)
                    + " Y el úlltimo caracter era " + string.charAt(string.length() - 1));

            if (string.contains("a")) {
                Boletin1.println(string + " Contenía una a en la posición " + string.indexOf("a"));
            }

            String respuesta = Boletin1.readStringScan(" \n Quieres buscar una letra en esta palabra? S/N");
            switch (respuesta) {
                case "S":
                    String buscar = Boletin1.readStringScan("Introduce el caracter que quieres buscar");
                    if (string.contains(buscar)) {

                        Boletin1.println("El caracter introducido estaba en la posición: " + string.indexOf(buscar));

                    } else {
                        Boletin1.println("La palabra no contenía el caracter introducido");
                    }

                    break;

                default:
                    break;
            }

        }
    }

    public void ExContrasenha() {

        String pass = Boletin1.readStringScan("Introduzca su contraseña: ");
        if (pass.equals(Boletin1.readStringScan("Vuelva a introducir su contraseña: "))) {

            Boletin1.println("Contraseña correcta");
        } else {
            Boletin1.println("Las contraseñas no coinciden");
        }

    }

    public void ExSelect(int index) {
        switch (index) {
            case 1:
                ExModuloVectorial();
                break;
            case 2:
                ExMaximoYMinimoDeDos();
                break;
            case 3:
                ExMaximoYMinimoDeTres();
                break;
            case 4:
                ExObtenerMail();
                break;
            case 5:
                ExCalcularLetraDni();
                break;
            case 6:
                ExMatriz5Enteros();
                break;
            case 7:
                ExFiltrosEnString();
                break;
            case 8:
                ExContrasenha();
                break;

            default:

                Boletin1.println("1.Calculo de módulo vectorial");
                Boletin1.println("2.Máximo y mínimo entre dos números");
                Boletin1.println("3.Máximo y mínimo entre tres números");
                Boletin1.println("4.Obtener dominio mail a partir de string");
                Boletin1.println("5.Calcular la letra del dni dado su número");
                Boletin1.println("6.Operaciones con matriz de 5 enteros aleatorios");
                Boletin1.println("7.Filtros en un string");
                Boletin1.println("8.Contraseñas idénticas");

                break;
        }
    }

}