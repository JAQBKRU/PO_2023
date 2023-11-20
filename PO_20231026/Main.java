public class Main {
    public static void main(String[] args) {
        //Zad 1
        //Napisz klasę Ksiazka, która będzie zawierać trzy pola: tytul, autor, rokWydania. Następnie zaimplementuj dwa konstruktory - jeden domyślny, który nie przyjmuje żadnych argumentów, i drugi, który przyjmuje trzy argumenty odpowiadające polom klasy. W przypadku drugiego konstruktora, nazwy parametrów muszą być takie same jak nazwy pól. Sprawdź czy jesteś w stanie prawidłowo przypisać wartości do pól klasy używając słowa kluczowego this.
        /*Ksiazka k1 = new Ksiazka();
        System.out.println(k1.tytul);

        Ksiazka k2 = new Ksiazka("Bill Gatsby", "FSJ", 1585);
        System.out.println(k2.autor);*/

        //Zad 2
        //Stwórz klasę Samochod, która będzie zawierać trzy pola: marka, model, rokProdukcji. Zaimplementuj trzy konstruktory - pierwszy domyślny, drugi przyjmujący dwa argumenty (marka i model), trzeci przyjmujący trzy argumenty (marka, model, rokProdukcji). W przypadku drugiego i trzeciego konstruktora, nazwy parametrów muszą być takie same jak nazwy pól. Wykorzystaj słowo kluczowe this do rozróżnienia pól klasy od parametrów.
        /*Samochod s1 = new Samochod();
        System.out.println(s1.marka);

        Samochod s2 = new Samochod("BMW", "E4", 2020);
        System.out.println(s2.model);

        Samochod s3 = new Samochod("BMW", "E4");
        System.out.println(s3.model);*/

        //Zad 3
        //Napisz klasę Osoba, która będzie miała pola: imie, nazwisko i wiek. Zdefiniuj w niej dwa konstruktory, jeden przyjmujący wszystkie trzy parametry, a drugi tylko imię i nazwisko. Drugi konstruktor powinien wywołać pierwszy, przekazując mu domyślną wartość wieku jako 0.
        /*Osoba o1 = new Osoba("Daryl", "Adams", 31);
        System.out.println(o1.wiek);

        Osoba o2 = new Osoba("Darcy", "Murphy");
        System.out.println(o2.wiek);*/

        //Zad 4
        //Zaprojektuj klasę Kwadrat, która posiada pole bok oraz konstruktor, który umożliwia ustawienie wartości tego pola. Następnie napisz drugi konstruktor, który nie przyjmuje żadnych argumentów, a jedynie wywołuje pierwszy konstruktor z wartością domyślną 1
        /*Kwadrat k1 = new Kwadrat();
        System.out.println(k1.bok);

        Kwadrat k2 = new Kwadrat(6);
        System.out.println(k2.bok);*/

        //Zad 5
        //Napisz klasę Student, która ma pola: imie, nazwisko i kierunekStudiow. Zdefiniuj w niej dwa konstruktory, jeden przyjmujący wszystkie trzy parametry, a drugi tylko imię i nazwisko. Drugi konstruktor powinien wywoływać pierwszy, przekazując mu domyślną wartość kierunku studiów jako nieznany
        /*Student s1 = new Student("Lyndon", "Reed", "IT");
        System.out.println(s1.kierunekStudiow);

        Student s2 = new Student("Harold", "Farrell");
        System.out.println(s2.kierunekStudiow);*/

        //Zad 6
        //Stwórz klasę Osoba. Klasa powinna zawierać pole imienne oraz statyczne pole licznik. Zadaniem jest zwiększanie wartości licznik za każdym razem, gdy tworzona jest nowa instancja klasy Osoba. Dodaj metodę, która zwróci wartość licznik. Stwórz przypadek testowy.
        /*Osoba2 o1 = new Osoba2();
        System.out.println(Osoba2.getLicznik());

        Osoba2 o2 = new Osoba2();
        System.out.println(Osoba2.getLicznik());*/

        //Zad 7
        //Stwórz klasę Matematyka, która posiada pole statyczne PI, które przechowuje przybliżoną wartość liczby . Upewnij się, że wartość tego pola jest niemutowalna. Stwórz przypadek testowy.
//        System.out.println("PI: " + Matematyka.PI);
//        Matematyka.PI = 3;

        //Zad 8
        //Stwórz klasę Kalkulator, która posiada podstawowe metody matematyczne: dodawanie, odejmowanie, mnożenie i dzielenie. Zaimplementuj te metody jako metody statyczne. Utwórz drugą klasę, w której przetestujesz te metody bez tworzenia instancji klasy Kalkulator.
//        TestKalkulator.main(args);

        //Zad 9
        //Stwórz klasę Produkt, która zawiera pole statyczne liczbaProduktow oraz pole statyczne MAX_PRODUKTOW. Pole liczbaProduktow będzie służyć do zliczania ilości utworzonych produktów, a MAX_PRODUKTOW do ograniczenia ich liczby. Oznacz tylko jedno z tych pól słowem kluczowym final i zastanów się nad konsekwencjami tego wyboru.
        /*Produkt p1 = new Produkt("Produkt 1");
        System.out.println("Liczba produktów: " + Produkt.liczbaProduktow);

        Produkt p2 = new Produkt("Produkt 2");
        System.out.println("Liczba produktów: " + Produkt.liczbaProduktow);

        // przekroczenie limitu
        Produkt p3 = new Produkt("Produkt 3");
        System.out.println("Liczba produktów: " + Produkt.liczbaProduktow);*/

        //Zad 10 - nie bedzie na KOLOKWIUM
        //Stwórz klasę Singleton, która używa pola statycznego do przechowywania jednej i tylko jednej instancji tej klasy. Klasa powinna zawierać prywatny konstruktor oraz publiczną statyczną metodę getInstance(), która zwraca jedyną instancję klasy Singleton. Stwórz przypadek testowy.
        /*Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) System.out.println("ta sama referencja");
        else System.out.println("inna referencja");*/
    }
}