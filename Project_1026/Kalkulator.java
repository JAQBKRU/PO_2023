public class Kalkulator {
    public static int dodawanie(final int a, final int b) {
        return a + b;
    }
    
    public static int odejmowanie(final int a, final int b) {
        return a - b;
    }
    
    public static int mnozenie(final int a, final int b) {
        return a * b;
    }
    
    public static double dzielenie(final double a, final double b) {
        return b != 0.0 ? a / b : a;
    }
}