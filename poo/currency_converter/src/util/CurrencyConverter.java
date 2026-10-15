package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    
    public static double dollarToReal(double dollarPrice, double dollarAmount) {
        return dollarPrice * dollarAmount;

}
public static double realToDollar(double realPrice, double realAmount) {
    return realPrice / realAmount;
}
}
    
