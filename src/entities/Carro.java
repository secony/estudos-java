package entities;

public class Carro {

    public String modelo;
    public String marca;
    public int ano;

    @Override
    public String toString() {
        return  "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano;
    }

}

