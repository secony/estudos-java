
package Application;
import entities.Carro;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Carro car = new Carro();
        Carro car2 = new Carro();
        Carro car3 = new Carro();

        car.ano = 2000;
        car.marca = "Fiat";
        car.modelo = "Uno";

        car2.marca = "Mercedes";
        car2.modelo = "C200";
        car2.ano = 2020;

        car3.marca = "Chevrolet";
        car3.modelo = "Astra";
        car3.ano = 2011;

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);


    }


}