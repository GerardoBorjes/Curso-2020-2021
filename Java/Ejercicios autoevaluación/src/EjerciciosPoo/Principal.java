package EjerciciosPoo;

/**
 * main
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        Libro l1 = new Libro();
        Libro l2 = new Libro("El nombre del viento.", "Patrick Routhfuss.", 2007, (short) 480);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        l1.setTitulo("Partida y regreso");
        l1.setAutor("Bilbo Bolsón");
        l1.setNumPaginas((short) 432);
        l1.setAnho(193);
        l1.setValoracion(4.8f);
        l2.setValoracion(5f);

        if (l1.getValoracion() > l2.getValoracion()) {
            System.out.println(l1.toString());
        } else {
            System.out.println(l2.toString());
        }

        Libro libros[] = { l1, l2, new Libro("El fin de la eteridad", "Isaac Asimov", 1955, (short) 191),
                new Libro("Crónicas de la torre: El valle de los lobos", "Laura Gallego", 2000, (short) 320) };

        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }

        System.out.println(BuscaLibro(libros, "El fin de la eteridad").toString());

        if (contieneLibro(libros, "Un paso hacia el abismo")) {
            System.out.println("Contiene libro");
        } else {
            System.out.println("No lo contiene");
        }
    }

    public static Libro BuscaLibro(Libro libros[], String titulo) throws Exception {
        Libro l = new Libro();
        for (Libro libro : libros) {
            if (libro.getTitulo() == titulo) {
                l = libro;
                break;
            }

        }
        if (l.getTitulo() == null) {
            throw new Exception("Libro no encontrado");
        } else {
            return l;
        }
    }

    public static boolean contieneLibro(Libro[] libros, String titulo) {

        for (Libro libro : libros) {
            if (libro.getTitulo() == titulo) {
                return true;
            }

        }
        return false;
    }
}