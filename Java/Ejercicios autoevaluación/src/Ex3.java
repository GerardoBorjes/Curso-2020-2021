package src;

import java.util.regex.Pattern;

public class Ex3 {
    public static void main(String[] args) {

    }

    public void ExNumeroPrimo() {

        int num = Boletin1.readIntScan("Introduce un número: ");
        int numRoot = (int) Math.sqrt(num);
        boolean primo = true;
        for (int i = num - (num - 2); i <= numRoot; i++) {

            if (num % i == 0) {
                primo = false;
                break;
            }

        }
        if (primo) {
            Boletin1.println("El número " + num + " es primo");
        } else {
            Boletin1.println("El número " + num + " no es primo");
        }
    }

    public void ExEcuacion() {
        double solucionPos = 0;
        double solucionNeg = 0;
        double a = Boletin1.readIntScan("Inserta valor de a: ");
        double b = Boletin1.readIntScan("Inserta valor de b: ");
        double c = Boletin1.readIntScan("Inserta valor de c: ");

        if (b == 0) {
            if (Math.sqrt(-(c / a)) < 0) {
                Boletin1.println("Raíz negativa");
                return;
            }

            solucionPos = Math.sqrt(-(c / a));
            solucionNeg = -solucionPos;

        }
        if (c == 0) {
            solucionPos = 0;
            solucionNeg = -(b / a);
        }
        if (a == 0) {
            solucionPos = -(c / b);
            solucionNeg = -(c / b);

        } else if (solucionPos == solucionNeg) {
            if (Math.sqrt(b * b - 4 * a * c) < 0) {
                Boletin1.println("Raíz negativa");
                return;
            }
            solucionPos = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            solucionNeg = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        }
        Boletin1.println("La solución de x sub 1 es: " + solucionPos);
        Boletin1.println("La solución de x sub 2 es: " + solucionNeg);

    }

    public void ExMenor() {
        int min;
        int nums[] = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Boletin1.readIntScan("Introduce el número en la posición " + i + ": ");
        }
        min = nums[0];
        for (int i : nums) {
            if (min > i) {
                min = i;
            }
        }
        Boletin1.println("El menor de los números es " + min + ".");

    }

    public void ExSalario() {
        double tax = Boletin1.readDoubleScan("Introduzca la tasa por hora: ");
        double hours = Boletin1.readDoubleScan("Introduzca las horas trabajadas semanalmente: ");
        double total = hours <= 38 ? (tax * hours) : ((38 * tax) + (hours - 38) * (tax * 0.5));
        Boletin1.println("Su salario bruto es: " + total);
        total = total > 300 ? total - (total * 0.1) : total;
        Boletin1.println("Su salario neto es: " + total);
    }

    public void ExDesviacionMedia() {
        float[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        float media = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];
        }
        media /= array.length;
        Boletin1.println("La media es " + media);
        for (int i = 0; i < array.length; i++) {
            Boletin1.println("La desviación media del valor " + i + " Es: " + Math.abs(array[i] - media));
        }
    }

    public void ExEncontrar0() {
        float[] array = { 0, 1, 0, 3, 0, 5, 0, 7, 8, 9 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                Boletin1.println("0 en la posición " + i);

        }
    }

    public void ExEncontrarNeg() {
        float[] array = { 0, 1, 0, -3, 0, 5, 0, 7, 8, 9 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                Boletin1.println("Primer negativo en la posición " + i);
                break;
            }

        }
    }

    public void ExMayor() {
        int max;
        int nums[] = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Boletin1.readIntScan("Introduce el número en la posición " + i + ": ");
        }
        max = nums[0];
        for (int i : nums) {
            if (max < i) {
                max = i;
            }
        }
        Boletin1.println("El mayor de los números es " + max + ".");

    }

    public void ExDni() {
        String st = Boletin1.readStringScan("Introduce Dni: ");
        String message = Pattern.matches("[0-9]{7,8}[A-Z a-z]", st) ? "Dni correcto" : "Dni incorrecto";
        Boletin1.println(message);
    }

    public void ExVocales() {
        String st = Boletin1.readStringScan("Introduce Mensaje: ");
        for (int i = 0; i < st.length(); i++) {
            if ("AEIOUaeiou".indexOf(st.charAt(i)) != -1) {
                Boletin1.println("Vocal encontrada en posición " + i);
            }
        }
    }

    public void ExZInicial() {
        String st = Boletin1.readStringScan("Introduce Mensaje: ");
        String[] Words = st.split(" ");
        for (String string : Words) {
            if (string.startsWith("z") || string.startsWith("Z")) {
                Boletin1.println(string);
            }
        }
    }

    public void Ex2dIdentidad() {
        int[][] nums2d = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        boolean identity = true;
        for (int i = 0; i < nums2d.length; i++) {
            for (int j = 0; j < nums2d[0].length; j++) {
                if (j == i) {
                    if (nums2d[i][j] != 1) {
                        identity = false;
                    }
                }
            }
        }
        if (identity)
            Boletin1.println("Es una matrid de indentidad");
        else
            Boletin1.println("No es una matrid de indentidad");
    }

    public void ExPorcentajeNegativo() {
        int[] array = { 0, 1, 0, -3, 0, 5, 0, -7, 8, -9 };
        int counter = 0;
        for (int i : array) {
            counter += i < 0 ? 1 : 0;
        }
        Boletin1.println(
                "El porcentaje de valores negativos es del " + Boletin1.RuleOfThree(array.length, 100, counter) + "%");

    }

    public void ExStrings() {
        String[] stArray = { "Hola", "Atento", "Contento", null, "Lmao" };
        String search = Boletin1.readStringScan("Introduce una palabra para buscar en la matriz: ");
        boolean llenado = false, found = false;
        for (int i = 0; i < stArray.length; i++) {
            if (stArray[i] == null && !llenado) {
                stArray[i] = "Lleno";
                llenado = true;
            }
            if (stArray[i].contains("t")) {
                Boletin1.println(stArray[i]);
            }
            if (stArray[i] == search) {
                found = true;
            }
        }
        if (found) {
            Boletin1.println("La búsqueda tuvo éxito");
        } else {
            Boletin1.println("La búsqueda no tuvo éxito");
        }
    }

    public void ExSelect(int index) {
        switch (index) {
            case 1:
                ExNumeroPrimo();
                break;
            case 2:
                ExEcuacion();
                break;
            case 3:
                ExMenor();
                break;
            case 4:
                ExSalario();
                break;
            case 5:
                ExDesviacionMedia();
                break;
            case 6:
                ExEncontrar0();
                break;
            case 7:
                ExEncontrarNeg();
                break;
            case 8:
                ExMayor();
                break;
            case 9:
                ExDni();
                break;
            case 10:
                ExVocales();
                break;
            case 11:
                ExZInicial();
                break;
            case 12:
                Ex2dIdentidad();
                break;
            case 13:
                ExPorcentajeNegativo();
                break;
            case 14:
                ExStrings();
                break;

            default:

                Boletin1.println("1.Programa que indica si un número es primo o no");
                Boletin1.println("2.Ecuación de segundo grado");
                Boletin1.println("3.El menor de 4 números");
                Boletin1.println("4.Calcular el salario neto semanal de los trabajadores de una empresa");
                Boletin1.println(
                        "5.Contar los valores de una matriz que están por encima de la media. Y la desviación media de la matriz ");
                Boletin1.println("6.Programa que encuentra las posiciones de un array en las que hay ceros");
                Boletin1.println("7.Encontrar la posición del primer número negativo");
                Boletin1.println("8.Programa que encuentra el valor más alto de un array");
                Boletin1.println("9.Solicitar el DNI y comprobar que tiene la sintaxis correcta");
                Boletin1.println("10.Detectar las posiciones de una cadena en las que hay vocales");
                Boletin1.println("11.Programa que detecta cuantas palabras de una cadena empiezan por Z o por z.");
                Boletin1.println("12.Programa que comprueba si una matriz de dos dimensiones es la matriz identidad");
                Boletin1.println(
                        "13.Programa que calcula el porcentaje de valores negativos que hay en una matriz 2D.");
                Boletin1.println("14.programa que trabaja con una matriz de Strings");

                break;
        }
    }
}