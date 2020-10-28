
import java.util.Scanner;

public class Ejercicio2 {
    static Scanner gBDreader;

    public static void main(String[] args) {

        String gBDemails[] = new String[10];
        gBDemails[0] = "GerardoBorjes@gmail.com";
        gBDemails[1] = "JohnDoe@yahoo.com";
        gBDemails[2] = "JaneDoe@outlook.com";
        gBDemails[3] = "Usuario@hotmail.com";
        gBDemails[4] = "Usuario1@yahoo.com";

        System.out.println(gBDemails[5]);
        boolean gBDSalir = false;
        do {

            System.out.println("1. Guardar un nuevo mail");
            System.out.println("2. Buscar un mail");
            System.out.println("3. Contar mails");
            System.out.println("4. Porcentaje de correos");
            System.out.println("5.Salir");
            gBDreader = new Scanner(System.in);
            int gBDopcion = gBDreader.nextInt();
            switch (gBDopcion) {
                case 1:
                    System.out.println("Introduce un correo");
                    gBDreader = new Scanner(System.in);
                    String gBDmail = gBDreader.nextLine();
                    gBDGuardarEnMatriz(gBDemails, gBDmail);
                    break;

                case 2:
                    System.out.println("Escribe un mail para saber si existe");
                    gBDreader = new Scanner(System.in);
                    int gBDIndex = gBDEncontrar(gBDemails, gBDreader.nextLine());
                    if (gBDIndex > -1) {
                        System.out.println("El email existe, está almacenado en la posición: " + gBDIndex);
                    }
                    break;

                case 3:
                    System.out.println("La cantidad de emails en la matriz es: " + gBDContarLlenos(gBDemails));
                    break;

                case 4:
                    String gBDSufijos[] = { "gmail.com", "hotmail.com", "yahoo.com", "outlook.com" };
                    int gBDCantidadDeMails = gBDContarLlenos(gBDemails);
                    for (int i = 0; i < gBDSufijos.length; i++) {
                        int gBDcounter = 0;
                        for (int j = 0; j < gBDemails.length; j++) {
                            if (gBDemails[j] != null) {

                                if (gBDemails[j].substring(gBDemails[j].lastIndexOf('@') + 1).equals(gBDSufijos[i])) {

                                    gBDcounter++;
                                }
                            }

                        }

                        System.out.println("El porcentaje de mails del dominio " + gBDSufijos[i] + " Es del "
                                + ((100 * gBDcounter) / gBDCantidadDeMails) + "%");
                    }
                    break;
                case 5:
                    gBDSalir = true;
                    gBDreader.close();
                    break;

                default:
                    gBDreader.close();
                    gBDSalir = true;
                    break;
            }

        } while (!gBDSalir);

    }

    /**
     * Método que cuenta el número de objetos dentro de un array que no son nulos.
     * 
     * @param array
     * @return
     */
    static int gBDContarLlenos(Object array[]) {
        int gBDcounter = 0;
        for (Object object : array) {
            if (object != null) {
                gBDcounter++;
            }
        }

        return gBDcounter;

    }

    /**
     * Método que recibe una matriz y un objeto, guarda el objeto en la primera
     * posición no definida de la matriz.
     * 
     * @param array
     * @param item
     */
    static void gBDGuardarEnMatriz(Object array[], Object item) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == null) {
                array[i] = item;

                break;
            }
        }
    }

    /**
     * Método que devuelve un entero con el índice de un objeto en una matriz, si no
     * existe, devuelve -1
     * 
     * @param array
     * @param item
     * @return
     */
    static int gBDEncontrar(Object array[], Object item) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }

        return -1;
    }

}
