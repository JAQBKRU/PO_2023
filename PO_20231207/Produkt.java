import java.time.LocalDate;
import java.util.Comparator;

public class Produkt implements Comparator<Produkt> {
    String nazwa;
    double cena;
    LocalDate dataWaznosci;

    public Produkt(String nazwa, double cena, LocalDate dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }

    @Override
    public String toString() {
        return "" + dataWaznosci;
    }

    @Override
    public int compare(Produkt o1, Produkt o2) {
        return o1.dataWaznosci.compareTo(o2.dataWaznosci);
    }
}

class DataWaznosciComparator implements Comparator<Produkt>{
    @Override
    public int compare(Produkt o1, Produkt o2) {
        return o1.dataWaznosci.compareTo(o2.dataWaznosci);
    }
}