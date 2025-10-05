public class Biblioteca {
    private Livro[] livros;
    private int numLivros;

    public Biblioteca(int tamanhoMaximo) {
        livros = new Livro[tamanhoMaximo];
        numLivros = 0;
    }

    public void adicionarLivro(Livro livro) {
    if (numLivros < livros.length) {
        livros[numLivros] = livro;
        numLivros++;
    } else {
        System.out.println("A biblioteca está cheia. Não é possível adicionar mais livros.");
    }
}


    public void listarLivros(int totalLivros) {
        System.out.println("Livros na biblioteca:");
        for (int i = 0; i < totalLivros; i++) {
            System.out.println("Título: " + livros[i].toString());
        }
    }

    public int getNumLivros(){
        return numLivros;
    }

    public Livro[] getLivros(){
        return livros;
    }
}
