package src;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Boletin1 {

    public static void main(String[] args) {

        println("1. Operadores");
        println("2. Api de JAVA");
        int tema = Integer.parseInt(readline("Seleccione tema de ejercicios: "));
        switch (tema) {
            case 1:
                while (true) {
                    Ex1 ejercicios = new Ex1();
                    ejercicios.ExSelect(0);
                    int selected = Integer.parseInt(readline("Introduzca Ejercicio: "));
                    clearScreen();
                    ejercicios.ExSelect(selected);
                    readline("Presione Enter");

                }

            case 2:

                while (true) {
                    Ex2 ejercicios = new Ex2();
                    ejercicios.ExSelect(0);
                    int selected = Integer.parseInt(readline("Introduzca Ejercicio: "));
                    clearScreen();
                    ejercicios.ExSelect(selected);
                    readline("Presione Enter");

                }
            default:
                break;
        }

    }

    // Funciones para acceso rápido
    public static void println(Object ob) {
        System.out.println(ob);
    }

    public static void print(Object ob) {
        System.out.print(ob);
    }

    public static String readline(String st) {
        print(st);
        String readed = System.console().readLine();
        return readed;

    }

    public static float Percentage(float value, int percentage) {

        float percent = (value * percentage) / 100;

        return percent;
    }

    // Copied From StackOverflow
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static float DecimalFix(float value, int decimalLimit) {

        BigDecimal roundf = new BigDecimal(value).setScale(decimalLimit, RoundingMode.HALF_EVEN);

        return roundf.floatValue();
    }

    public static String readStringScan(String st) {
        print(st);
        Scanner reader = new Scanner(System.in);

        String line = reader.nextLine();

        return line;

    }

    public static int readIntScan(String st) {
        print(st);
        Scanner reader = new Scanner(System.in);

        int line = reader.nextInt();

        return line;

    }

    public static double readDoubleScan(String st) {
        print(st);

        Scanner reader = new Scanner(System.in);

        double line = reader.nextDouble();

        return line;

    }

    public static int RandomRange(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

}
