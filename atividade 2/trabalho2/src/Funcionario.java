public class Funcionario {
    private String nome;
    private String dataNasc;
    private String cargo;
    private String tipoContrato;
    private float valorSal;
    private int nmrFilhos = 0;
    private String dataAdmissao;

    public Funcionario(String nome, String dataNasc){
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    
    public float calcSalarioBruto(float horasTrabalhadas){
        float valorF;

        if("Horista".equals(this.tipoContrato)){
            valorF = this.valorSal * horasTrabalhadas;
        } else {
            valorF = this.valorSal;
        }
        return valorF;
    }
    
    
    public float calcularDescontoINSS(float salarioContribuicao) {
        if (salarioContribuicao <= 1302.00F) {
            return salarioContribuicao * 0.075F;
        } else if (salarioContribuicao <= 2571.29F) {
            return (1302.00F * 0.075F) + ((salarioContribuicao - 1302.00F) * 0.09F);
        } else if (salarioContribuicao <= 3856.94F) {
            return (1302.00F * 0.075F) + 
                ((2571.29F - 1302.00F) * 0.09F) + 
                ((salarioContribuicao - 2571.29F) * 0.12F);
        } else if (salarioContribuicao <= 7507.49F) {
            return (1302.00F * 0.075F) + 
                ((2571.29F - 1302.00F) * 0.09F) + 
                ((3856.94F - 2571.29F) * 0.12F) + 
                ((salarioContribuicao - 3856.94F) * 0.14F);
        } else {
            return (1302.00F * 0.075F) + 
                ((2571.29F - 1302.00F) * 0.09F) + 
                ((3856.94F - 2571.29F) * 0.12F) + 
                ((7507.49F - 3856.94F) * 0.14F);
        }
    }

    public float calcularIRRF(double salario) {
        int dependentes = this.nmrFilhos;
        float deducaoDependentes = dependentes * 189.59F;

        double baseCalculo = salario - deducaoDependentes;

        if (baseCalculo <= 1903.98F) {
            return 0.0F;
        } else if (baseCalculo <= 2826.65F) {
            return (float)((baseCalculo - 1903.98F) * 0.075F);
        } else if (baseCalculo <= 3751.05F) {
            return (float)((2826.65F - 1903.98F) * 0.075F +
                        (baseCalculo - 2826.65F) * 0.15F);
        } else if (baseCalculo <= 4664.68F) {
            return (float)((2826.65F - 1903.98F) * 0.075F +
                        (3751.05F - 2826.65F) * 0.15F +
                        (baseCalculo - 3751.05F) * 0.225F);
        } else {
            return (float)((2826.65F - 1903.98F) * 0.075F +
                        (3751.05F - 2826.65F) * 0.15F +
                        (4664.68F - 3751.05F) * 0.225F +
                        (baseCalculo - 4664.68F) * 0.275F);
        }
    }


    public float getSalarioDescontado(int horasTrabalhadas) {
        float salarioBruto = calcSalarioBruto(horasTrabalhadas);
        double descontoINSS = calcularDescontoINSS(salarioBruto);
        double descontoIRRF = calcularIRRF(salarioBruto);
        
        return (float) (salarioBruto - descontoINSS - descontoIRRF);
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
