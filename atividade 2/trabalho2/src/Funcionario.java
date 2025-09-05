public class Funcionario {
    private String nome;
    private String dataNasc;
    private String cargo;
    private String tipoContrato;
    private float valorSal;
    private int nmrFilhos;
    private String dataAdmissao;

    public Funcionario(String nome, String dataNasc){
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    
    public float calcSalario(float horasTrabalhadas){
        float valorF;

        if(this.tipoContrato == "Horista"){
            valorF = this.valorSal * horasTrabalhadas;
        }else{
            valorF = this.valorSal;
        }
        return valorF;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    //--------------------------------------------------------------------------------
    public String getTipoContrato(){
        return tipoContrato;
    }
    public void setTipoContrato(String tipoContrato){
        this.tipoContrato = tipoContrato;
    }

    public float getValorSal(){
        return valorSal;
    }

    public void setValorSal(float valorSal){
        this.valorSal = valorSal;
    }

    public int getNmrFilhos(){
        return nmrFilhos;
    }

    public void setNmrFilhos(int nmrFilhos){
        this.nmrFilhos = nmrFilhos;
    }

    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getDataAdmissao(){
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }

}
