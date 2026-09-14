package util;

public class CurrencyConverter {

    public static double converter (double dollar, double quantity){
        return (dollar + (dollar * 0.06)) *  quantity;
    }
}