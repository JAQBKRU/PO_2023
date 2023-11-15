public class Kalkulator {
    public int dodaj(int a, int b){
        return a + b;
    }
}

class KalkulatorRozszerzony extends Kalkulator{
    public int dodaj(int a, int b, int c) {
        return a + b + c;
    }
}
