public class Funcionario {
    private String nome;
    private String dataNasc;
    private String cargo;
    private String tipoContrato;
    private float valorSal;
    private int nmrFilhos;
    private String dataAdmissao;

    public Funcionario(String nome, String dataNasc,String cargo,String tipoContrato,float valorSal,int nmrFilhos,String dataAdmissao){
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

     public String getDataNasc(){
        return dataNasc;
    }
    public void setDataNasc(String dataNasc){
        this.dataNasc = dataNasc;
    }
}
