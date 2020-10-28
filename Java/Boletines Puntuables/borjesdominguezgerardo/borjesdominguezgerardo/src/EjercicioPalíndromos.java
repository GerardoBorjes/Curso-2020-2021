import java.util.Scanner;

/**
 * EjercicioPalíndromos
 */
public class EjercicioPalíndromos {
    // Declaro aquí el Scanner para facilitarme su uso
    static Scanner çreader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Untroduce una cadena y se determinará si es palíndroma");
        // Declaro dos strings, uno lo igualo a la entrada de texto del usuario y el
        // otro lo dejo vacío
        String çcadena = çreader.nextLine();
        String çCadenaInversa = "";

        // Para evitar problemas con letras mayúsculas, minúsculas y espacios, las paso
        // todas a lowecase y elimino los espacios
        çcadena = çcadena.toLowerCase();
        çcadena = çcadena.replaceAll(" ", "");

        // Creo una cadena de caracterer con el método String.toCharArray
        char çArrayChar[] = çcadena.toCharArray();

        // He modificado el bucle for para que vaya desde la última posición a la
        // primera, es decir, he invertido el for.
        for (int i = çArrayChar.length - 1; i >= 0; i--) {

            // Como el for se va posicionando desde la última posición, voy sumando cada
            // caracter a la cadena vacía
            çCadenaInversa += çArrayChar[i];

        }

        // Hago un if para comparar las cadenas resultantes
        if (çcadena.equals(çCadenaInversa)) {
            System.out.println("La cadena es palíndroma");
        } else {
            System.out.println("La cadena no es palíndroma");
        }
        çreader.close();

    }
}