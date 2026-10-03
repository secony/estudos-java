package entities;

public class Conta {
    private String titular;
    private double saldo;
    private int numero;


    public double getSaldo() {
        return saldo;
    }


    public Conta(String titular, int numero, double saldo) {

        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo");
        }

        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositado com sucesso");
        } else if (valor <= 0) {
            System.out.println("Valor invalido");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Sacado com sucesso");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else if (valor <= 0) {
            System.out.println("Saque invalido");
        }

    }

    @Override
    public String toString() {
        return "Saldo: " + getSaldo();
    }
}
