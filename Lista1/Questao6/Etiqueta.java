package Questao6;

public class Etiqueta {
    private String marca;
    private String tamanho;

    public Etiqueta(String Marca, String tamanho){
        this.marca = Marca;
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
