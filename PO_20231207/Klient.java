import java.time.LocalDate;

public class Klient implements Comparable<Klient>{
    String imie;
    int nrKlienta;
    LocalDate ostatnieLogowanie;

    public Klient(String imie, int nrKlienta, LocalDate ostatnieLogowanie) {
        this.imie = imie;
        this.nrKlienta = nrKlienta;
        this.ostatnieLogowanie = ostatnieLogowanie;
    }

    @Override
    public String toString() {
        return "" + ostatnieLogowanie;
    }

    @Override
    public int compareTo(Klient o) {
        return o.ostatnieLogowanie.compareTo(this.ostatnieLogowanie);
    }
}
