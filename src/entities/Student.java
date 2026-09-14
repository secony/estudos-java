package entities;

public class Student {
    public String name;
    public double nota1 = 0;
    public double nota2 = 0;
    public double nota3 = 0;

    public double finalNota (){
        return nota1 +nota2+nota3;
    }

    public String AprovadoReprovado(){
        if (finalNota()<60){
            return "Reprovado faltando "+ (60 - finalNota());
        }

            return "Aprovado";

    }
}