package Lista2.Questao9;

public class Cliente extends Pessoa {
    private int id;
    private String cadastro;
    private boolean estaCadastrado = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCadastro() {
        return cadastro;
    }

    public boolean isEstaCadastrado() {
        return estaCadastrado;
    }

    public void cadastrar(String cadastro) {
        this.cadastro = cadastro;
        this.estaCadastrado = true;
        System.out.println("Cliente cadastrado com sucesso!");
    }
}

