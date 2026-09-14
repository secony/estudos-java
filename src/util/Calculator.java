package util;

public class Calculator {

    public final double PI = 3.14;

    public double circunferencia(double raio){
        return (2 * PI * raio);
    }

    public double volume(double raio){
        return (4* PI * raio *  raio * raio) /3;
    }

}
