public class Licznik {
    public int liczba;

    public void zwieksz(int n){
        liczba += n;
    }

    public void dodaj(Licznik licznik){
        liczba += licznik.liczba;
    }
}
