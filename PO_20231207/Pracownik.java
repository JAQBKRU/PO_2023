import java.time.LocalDate;

public class Pracownik implements Comparable<Pracownik> {
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "" + pensja;
    }

    @Override
    public int compareTo(Pracownik o) {
        return (int)Math.signum(this.pensja - o.pensja);
    }
}
