package src;

public class Boletin1 {

    public static void main(String[] args) {
        while (true) {

            Ex1 ejercicios1 = new Ex1();
            ejercicios1.ExSelect(0);
            int selected = Integer.parseInt(readline("Introduzca Ejercicio: "));
            clearScreen();
            ejercicios1.ExSelect(selected);
            readline("Presione Enter");

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
}
