import java.util.Comparator;

public class Osoba implements Comparator<Osoba> {
    String imie;
    int wiek;
    double wzrost;

    public Osoba(String imie, int wiek, double wzrost) {
        this.imie = imie;
        this.wiek = wiek;
        this.wzrost = wzrost;
    }

    @Override
    public String toString() {
        return "" + wiek;
    }

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.wiek - o2.wiek;
    }
}

class WiekOsobaComparator implements Comparator<Osoba>{
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.wiek - o2.wiek;
    }
}
