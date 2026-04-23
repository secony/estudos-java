package entities;

public class Dados {

    private int accountN;
    private String name;
    private double saldo;

    public Dados(int accountN, String name, double saldo) {
        this.accountN = accountN;
        this.name = name;
        this.saldo = saldo;
    }


    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo não pode ser negativo.");
            return;
        }
        this.saldo = saldo;
    }


    public void deposit(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        this.saldo += valor;
    }

    public void withdraw (double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }
        double total = valor + 5.0;
        if (total > this.saldo) {
            System.out.println("Saldo insuficiente. Saldo atual: R$" + this.saldo);
            return;
        }
        this.saldo -= total;
    }


    @Override
    public String toString() {
        return " ////// ACCOUNT DATA: ////// " +
                "\n " +
                "\n ACCOUNT = " + accountN +
                "\n NAME = " + name  +
                "\n BALANCE = " + saldo;

    }
}
