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

    
    public float calcSalarioBruto(float horasTrabalhadas){
        float valorF;

        // Corrigido: usar equals() para comparar strings
        if("Horista".equals(this.tipoContrato)){
            valorF = this.valorSal * horasTrabalhadas;
        } else {
            valorF = this.valorSal; // Para outros tipos de contrato, retorna o salário fixo
        }
        return valorF;
    }
    
    
    public double calcularDescontoINSS(float salarioContribuicao) {
        if (salarioContribuicao <= 1302.00) {
            return salarioContribuicao * 0.075; // 7.5%
        } else if (salarioContribuicao <= 2571.29) {
            return (1302.00 * 0.075) + ((salarioContribuicao - 1302.00) * 0.09);
        } else if (salarioContribuicao <= 3856.94) {
            return (1302.00 * 0.075) + 
                   ((2571.29 - 1302.00) * 0.09) + 
                   ((salarioContribuicao - 2571.29) * 0.12);
        } else if (salarioContribuicao <= 7507.49) {
            return (1302.00 * 0.075) + 
                   ((2571.29 - 1302.00) * 0.09) + 
                   ((3856.94 - 2571.29) * 0.12) + 
                   ((salarioContribuicao - 3856.94) * 0.14);
        } else {
            // Para salários acima do teto, calcula apenas até o limite máximo
            return (1302.00 * 0.075) + 
                   ((2571.29 - 1302.00) * 0.09) + 
                   ((3856.94 - 2571.29) * 0.12) + 
                   ((7507.49 - 3856.94) * 0.14);
        }
    }

    public double calcularIRRF(double salario) {
    int dependentes = this.nmrFilhos;
    double deducaoDependentes = dependentes * 189.59;

    // Base de cálculo
    double baseCalculo = salario - deducaoDependentes;

    if (baseCalculo <= 1903.98) {
        return 0.0;
    } else if (baseCalculo <= 2826.65) {
        return (baseCalculo - 1903.98) * 0.075;
    } else if (baseCalculo <= 3751.05) {
        return (2826.65 - 1903.98) * 0.075 +
               (baseCalculo - 2826.65) * 0.15;
    } else if (baseCalculo <= 4664.68) {
        return (2826.65 - 1903.98) * 0.075 +
               (3751.05 - 2826.65) * 0.15 +
               (baseCalculo - 3751.05) * 0.225;
    } else {
        return (2826.65 - 1903.98) * 0.075 +
               (3751.05 - 2826.65) * 0.15 +
               (4664.68 - 3751.05) * 0.225 +
               (baseCalculo - 4664.68) * 0.275;
    }
}


    public float getSalarioDescontado(int horasTrabalhadas) {
        float salarioBruto = calcSalarioBruto(horasTrabalhadas);
        double descontoINSS = calcularDescontoINSS(salarioBruto);
        return (float) (salarioBruto - descontoINSS);
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
