package EjerciciosPoo;

/**
 * Libro
 */
public class Libro {

    private String titulo, autor;
    private int anho;
    private short numPaginas;
    private float valoracion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anho, short numPaginas) {
        setTitulo(titulo);
        setAutor(autor);
        setAnho(anho);
        setNumPaginas(numPaginas);

    }

    // #region Getters & Setters

    // Titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Autor
    public String getAutor() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    // Anho

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    // numPaginas
    public short getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    // valoracion
    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
    // #endregion

    @Override
    public String toString() {

        return "Título: " + titulo + " Autor: " + autor + " Anho: " + anho + " Número de páginas: " + numPaginas
                + " Valoración: " + valoracion;
    }

}