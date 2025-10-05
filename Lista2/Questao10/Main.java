public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(2);
        Livro livro1 = new Livro("Java Programming", "John Smith");
        biblioteca.adicionarLivro(livro1);

        Livro livro2 = new Livro("Introduction to OOP", "Alice Johnson");
        biblioteca.adicionarLivro(livro2);

        int totalLivros = biblioteca.getNumLivros();

        if (totalLivros < biblioteca.getLivros().length) {
            Livro livro3 = new Livro("Data Structures", "Bob Davis");
            biblioteca.adicionarLivro(livro3);
        }
        totalLivros = biblioteca.getNumLivros();
        biblioteca.listarLivros(totalLivros);
    }
}