public class Kalkulator {
    public static int dodawanie(int a, int b) {
        return a + b;
    }

    public static int odejmowanie(int a, int b) {
        return a - b;
    }

    public static int mnozenie(int a, int b) {
        return a * b;
    }

    public static double dzielenie(double a, double b) {
        if (b != 0) return a / b;
        return a;
    }
}

class TestKalkulator{
    public static void main(String[] args){
        int dodawanie = Kalkulator.dodawanie(5, 3);
        int odejmowanie = Kalkulator.odejmowanie(10, 4);
        int mnozenie = Kalkulator.mnozenie(2, 6);
        double dzielenie = Kalkulator.dzielenie(8.0, 2.0);

        System.out.println("[+]: " + dodawanie + ", [-]: " + odejmowanie + ", [*]: " + mnozenie + ", [/]: " + dzielenie);
    }
}