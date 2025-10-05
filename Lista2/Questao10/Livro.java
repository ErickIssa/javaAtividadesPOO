public class Livro {
    private String titulo;
    private String autor;

    public Livro() {
        System.out.println("Livro vazio criado");
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String toString() {
        return "Titulo: " + titulo + 
               ", Autor: " + autor;
    }
}