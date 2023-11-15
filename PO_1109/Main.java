public class Main {
    public static void main(String[] args) {
        /*Animal animal = new Animal("Krowa");
        Animal animal2 = new Animal("Krowa");
        System.out.println(animal.equals(animal2));
        animal.dajGlos();

        Cat kot = new Cat("Filemon");
        System.out.println(kot);
        kot.dajGlos();
        Animal animal3 = new Cat("Filemon");
        System.out.println(animal3.getClass());*/

        //Zadanie 1
        //Stwórz klasę bazową Person z prywatnym polem firstName oraz chronionym polem lastName. Następnie stwórz klasę Employee, która dziedziczy po klasie Person. W klasie Employee próbuj odnieść się do obu pól i zauważ, które z nich są dostępne.

        //Zadanie 2
        //Na bazie klasy Person z poprzedniego podpunktu, stwórz metody dostępowe (gettery) dla obu pól. W klasie Employee stwórz metodę displayData, która korzysta z tych metod dostępowych, aby wypisać informacje o pracowniku. Zastanów się, dlaczego metody dostępowe są używane do dostępu do prywatnych pól.
        Employee p1 = new Employee("Jan", "Kowal");
        p1.displayData();

        //Zadanie 3
        //Wykonaj poniższe czynności:
        //Zdefiniuj klasę Book, która posiada następujące pola: title, author i numberOfPages.
        //Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem do odpowiednich pól.
            //Liczba stron (numberOfPages) nie powinna być ujemna. W przypadku podania wartości ujemnej, ustaw liczbę stron na jedną.
            //Pola title i author nie powinny być puste ani równać się null. W przypadku podania pustego napisu lub null, ustaw odpowiednio pusty napis.
        //Dodaj metodę toString(), która zwraca informacje o książce w formacie: "Book: [title] by [author], Pages: [numberOfPages].".
        //Dodaj metodę equals(), która porównuje dwie książki na podstawie ich pól title, author i numberOfPages
        Book b1 = new Book("t1", "a1", 4);
        Book b2 = new Book("t1", "a1", 4);
        Book b3 = new Book("t2", "", -3);
        //System.out.println(b1.toString());
        System.out.println(b1.equals(b2));//True
        System.out.println(b2.equals(b3));//False


        //Zadanie 4
        //Stwórz klasę Tool z chronionym konstruktorem, który przyjmuje nazwę narzędzia. Następnie stwórz klasę potomną Hammer, która dziedziczy po klasie Tool. W klasie Hammer stwórz konstruktor, który korzysta z konstruktora klasy bazowej. Zastanów się, dlaczego używając modyfikatora private dla konstruktora klasy bazowej, taki scenariusz nie byłby możliwy.
        Hammer hammer = new Hammer("Mlot");
        System.out.println("Nazwa narzedzia: " + hammer.nazwa);

        //Zadanie 5
        //Wykonaj kolejno poniższe czynności:
        //Stwórz klasę bazową Pojazd z metodą jedz, która wypisuje “Pojazd jedzie”. Następnie stwórz klasę potomną Samochod, która przesłania metodę jedz tak, by wypisywała “Samochod jedzie”. Utwórz obiekt klasy Samochod i wywołaj jego metodę jedz, aby zaobserwować wynik.
        //Na bazie klasy Pojazd z poprzedniego podpunktu, w klasie Samochod, przesłoń metodę jedz tak, by wywoływała oryginalną metodę z klasy bazowej i dodatkowo wypisywała informacje specyficzne dla klasy Samochod. Użyj słowa kluczowego super, aby wywołać metodę z klasy bazowej.
        Pojazd pojazd = new Pojazd();
        pojazd.jedz();
        Pojazd samochod1 = new Samochod();
        samochod1.jedz();

        //Zadanie 6
        //Stwórz klasę Kalkulator z metodą dodaj, która przyjmuje dwa argumenty typu int i zwraca ich sumę. Następnie stwórz klasę potomną KalkulatorRozszerzony, która przesłania metodę dodaj w taki sposób, by przyjmowała trzy argumenty typu int i zwracała ich sumę. Zastanów się, czy to faktycznie przesłanianie metody, czy może coś innego.
        KalkulatorRozszerzony kR = new KalkulatorRozszerzony();
        KalkulatorRozszerzony kal = new KalkulatorRozszerzony();
        System.out.println(kal.dodaj(3, 2));//5
        System.out.println(kR.dodaj(1, 2, 3));//6

        //Zadanie 7
        //Stwórz klasę bazową Komputer z publiczną metodą uruchom, która wypisuje “Komputer uruchomiony”. Stwórz klasę potomną Laptop, która próbuje przesłonić metodę uruchom, ale z modyfikatorem dostępu protected. Spróbuj skompilować kod i zastanów się, dlaczego występują pewne ograniczenia w przesłanianiu metod pod względem modyfikatorów dostępu.
        Komputer komp = new Komputer();
        komp.uruchom();

        //Zadanie 8
        //Stwórz trzy klasy: Istota, Człowiek i Programista. Klasa Człowiek powinna dziedziczyć po klasie Istota, a klasa Programista po klasie Człowiek. W każdej z klas dodaj konstruktor, który wypisuje informację o tworzeniu instancji danej klasy. Stwórz instancję klasy Programista i zaobserwuj kolejność wywoływania konstruktorów.
        Programista programista = new Programista();
    }
}