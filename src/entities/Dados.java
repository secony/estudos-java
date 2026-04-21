package entities;

public class Dados {

    private int accountN;
    public String name;
    private double saldo;
    private double valorAdd = 0;

    public Dados(int accountN, String name, double saldo) {
        this.accountN = accountN;
        this.name = name;
        this.saldo = saldo;
    }

    public int getAccountN() {
        return accountN;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo não pode ser negativo.");
            return;
        }
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public double getValorAdd() {
        return valorAdd;
    }

    public void setValorAdd(double valorAdd) {
        this.valorAdd = valorAdd;
    }

    public static double addValue(double saldo, double valorAdd ) {
        return saldo + valorAdd;
    }

    @Override
    public String toString() {
        return " Account data: " +
                "\n "+
                "\n account = " + accountN +
                "\n name = '" + name + '\'' +
                "\n saldo = " + saldo;

    }
}
