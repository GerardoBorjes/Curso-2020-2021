package src;

public class Boletin1 {

    public static void main(String[] args) {

        Ex1 ejercicios1 = new Ex1();
        int selected = Integer.parseInt(readline("Introduzca Ejercicio: "));
        ejercicios1.ExSelect(selected);
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

}
