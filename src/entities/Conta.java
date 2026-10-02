package entities;

public class Conta {
    private String titular;
    private double saldo;
    private int numero;


    public double getSaldo() {
        return saldo;
    }



    public Conta(String titular, int numero,  double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    public void depositar(double valor){
        if (valor >= 0){
            saldo += valor;
            System.out.println("Depositado com sucesso");
        }
        else {
            System.out.println("Valor invalido");
            return;
        }
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Sacado com sucesso");
        }
        else {
            System.out.println("Saldo insuficiente");
            return;
        }

    }

    @Override
    public String toString() {
        return "Saldo: " + getSaldo();
    }
}
