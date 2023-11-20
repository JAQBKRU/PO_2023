//Zadanie z 20231019

public class Main {
    public static void main(String[] args) {
        //Zad 1 - testowe
        /*House domStefana = new House();
        domStefana.area = 150;
        domStefana.floors = 2;
        domStefana.garden = false;
        domStefana.garage = true;
        domStefana.rooms = 6;

        System.out.println(domStefana.getPrice());*/

        //Zad 1
        //Utwórz klasę Dog z polami: name, breed i age. Napisz metodę bark(), która wydrukuje na konsoli "Hau Hau". Stwórz przypadek testowy, aby wywołać metodę co najmniej jeden raz.
        /*Dog pies1 = new Dog();
        pies1.name = "Rekin";
        pies1.breed = "York";
        pies1.age = 4;

        pies1.bark();*/

        //Zad 2
        //Stwórz klasę BankAccount z polem balance. Napisz metody deposit(double amount) i withdraw(double amount), które odpowiednio zwiększają i zmniejszają saldo o daną kwotę. Stwórz przypadek testowy, aby wywołać każdą metodę co najmniej jeden raz.
        /*BankAccount konto = new BankAccount();
        konto.balance = 1490;

        konto.deposit(400);
        System.out.println(konto.balance);
        konto.withdraw(1000);
        System.out.println(konto.balance);*/

        //Zad 3
        //Stwórz klasę Time z polami: hours i minutes. Napisz metodę addTime(Time otherTime), która dodaje do bieżącego czasu czas podany jako argument i zwraca nowy obiekt klasy Time. Zadbaj o to, aby minuty i godziny nie przekraczały odpowiednio 59 i 23. Stwórz przypadek testowy, aby wywołać metodę co najmniej jeden raz.
        /*Time czas = new Time();
        czas.hours = 11;
        czas.minutes = 42;

        Time czas2 = new Time();
        czas2.hours = 13;
        czas2.minutes = 19;
        Time czasWynik = czas.addTime(czas2);
        System.out.printf("hours: %d\nminutes: %d", czasWynik.hours, czasWynik.minutes);*/

        //Zad 4
        //Wykonaj po kolei dwa podpunkty:
        //A. Stwórz klasę Car zawierającą pole brand. W klasie Main, utwórz obiekt klasy Car, przypisz mu wartość null i spróbuj odwołać się do pola brand. Jaki jest wynik?
        //B. Zmodyfikuj kod z podpunktu A tak, aby sprawdzić, czy obiekt Car jest null przed odwołaniem się do pola brand. Jaki jest wynik?
        /*Car car1 = new Car();
        car1 = null;
        if(car1 != null){
            car1.brand = "BMW";
        }*/

        //Zad 5
        //Utwórz klasę Osoba z publicznym polem imie oraz prywatnym polem haslo. Zobacz jak różne modyfikatory dostępu wpływają na dostęp do tych pól z innej klasy.
        /*Osoba o1 = new Osoba();
        o1.imie = "Carl";
        System.out.println(o1.imie);*/

        //Zad 6
        //Stwórz dwie klasy: Rodzic i Dziecko. Klasa Rodzic powinna mieć jedno pole protected. Spróbuj uzyskać dostęp do tego pola z klasy Dziecko.
        /*Rodzic rodzic = new Rodzic();
        rodzic.imie = "John";
        Dziecko dziecko = new Dziecko();
        dziecko.nadajImieRodzica(rodzic);
        System.out.println(dziecko.imieRodzica);*/

        //Zad 7
        //Wykonaj kolejno poniższe czynności:
        //Stwórz klasę Licznik z jednym polem liczba. Dodaj do klasy metodę zwieksz, która przyjmuje parametr typu int i zwiększa wartość pola liczba o wartość tego parametru. W klasie Main, utwórz zmienną typu int, przekaż ją do metody zwieksz i sprawdź, czy wartość zmiennej zmieniła się po wywołaniu metody.
        //Dodaj do klasy Licznik metodę dodaj, która przyjmuje inny obiekt Licznik i dodaje wartość jego pola liczba do pola liczba bieżącego obiektu. Utwórz dwa obiekty Licznik w klasie Main i użyj metody dodaj. Sprawdź, czy obiekt przekazany jako argument metody dodaj zmienił swoją wartość po wywołaniu metody.
        //Stwórz klasę Zmieniacz, która posiada metodę zmienWartosc, która jako argument przyjmuje typ int. Wewnątrz metody zmień wartość argumentu na inną. W klasie Main utwórz zmienną int, a następnie przekaż ją do metody zmienWartosc i sprawdź, czy wartość zmiennej się zmieniła.
        //Dodaj do klasy Zmieniacz metodę zmienObiekt, która jako argument przyjmuje obiekt Licznik. Wewnątrz metody zmień wartość pola liczba obiektu Licznik na inną. W klasie Main utwórz obiekt Licznik, a następnie przekaż go do metody zmienObiekt i sprawdź, czy wartość pola liczba obiektu się zmieniła.
        //a)
        /*int n = 18;
        Licznik licznik = new Licznik();
        licznik.liczba = 20;
        licznik.zwieksz(n);
        System.out.println(licznik.liczba);//38

        //b)
        Licznik licznik1 = new Licznik();
        licznik1.liczba = 4;
        Licznik licznik2 = new Licznik();
        licznik2.liczba = 13;
        licznik1.dodaj(licznik2);
        System.out.println(licznik1.liczba);//17

        //c)
        int nC = 997;
        Zmieniacz zmieniacz = new Zmieniacz();
        zmieniacz.zmienWartosc(nC);
        System.out.println(nC);//997 -> 777 - NIE

        //d)
        Licznik licznikD = new Licznik();
        licznikD.liczba = 444;
        zmieniacz.zmienObiekt(licznikD);
        System.out.println(licznikD.liczba);//444 -> 998 - TAK*/
    }
}