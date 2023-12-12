public class Osoba2 implements Comparable<Osoba2>{
    String imie;
    double wzrost;

    public Osoba2(String imie, double wzrost) {
        this.imie = imie;
        this.wzrost = wzrost;
    }

    @Override
    public String toString() {
        return "" + wzrost;
    }

    @Override
    public int compareTo(Osoba2 o) {
        return (int)Math.signum(o.wzrost - this.wzrost);
    }
}
