package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto-taxa;
    }

    public double aumento(double porcentagemAumento){
        return salarioBruto += salarioBruto * (porcentagemAumento /100);
    }


    @Override
    public String toString() {
        return "Funcionario: " + nome + ", R$:" + salarioLiquido() ;
    }
}