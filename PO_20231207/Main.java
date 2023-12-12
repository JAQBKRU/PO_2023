import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(4.0));
        studentList.add(new Student(3.8));
        studentList.add(new Student(4.6));
        studentList.add(new Student(4.0));
        System.out.println(studentList);
//        Collections.sort(studentList, new AverageGradeStudentComp());
        studentList.sort(new AverageGradeStudentComp());
        System.out.println(studentList);
        studentList.sort(new YearOfBirthStudentComp());
        System.out.println(studentList);
        Student s1 = new Student("Carl", 2.5, 1999);
        Student s2 = (Student)s1.clone();
        System.out.println(s1 + " " + s2);
        s2.averageGrade = 3.2;
        System.out.println(s1 + " " + s2);*/

        //Zad 1
        //Napisz klasę Pracownik, która zawiera pola: imie (typu String),
        // pensja (typu double) i dataZatrudnienia (typu LocalDate).
        // Zaimplementuj interfejs Comparable w taki sposób, aby obiekty
        // klasy Pracownik były sortowane rosnąco według pensji. Stwórz
        // listę 5 obiektów klasy Pracownik i posortuj ją według sprecyzowanego
        // kryterium.
        /*ArrayList<Pracownik> pracownikList = new ArrayList<>();
        pracownikList.add(new Pracownik("p1", 5, LocalDate.of(2020, 2, 12)));
        pracownikList.add(new Pracownik("p2", 2, LocalDate.of(2020, 3, 12)));
        pracownikList.add(new Pracownik("p3", 7, LocalDate.of(2020, 8, 12)));
        pracownikList.add(new Pracownik("p4", 2, LocalDate.of(2020, 9, 12)));
        pracownikList.add(new Pracownik("p5", 3, LocalDate.of(2020, 4, 17)));
        System.out.println(pracownikList);
        Collections.sort(pracownikList);
        System.out.println(pracownikList);*/

        //Zad 2
        //Napisz klasę Klient, która zawiera pola: imie (typu String),
        // nrKlienta (typu int) i ostatnieLogowanie (typu LocalDate).
        // Zaimplementuj interfejs Comparable w taki sposób, aby obiekty
        // klasy Klient były sortowane malejąco według daty ostatniego
        // logowania. Stwórz listę 5 obiektów klasy Klient i posortuj ją
        // według sprecyzowanego kryterium.
        /*ArrayList<Klient> klientList = new ArrayList<>();
        klientList.add(new Klient("k1", 1, LocalDate.of(2023, 12, 1)));
        klientList.add(new Klient("k2", 2, LocalDate.of(2023, 11, 30)));
        klientList.add(new Klient("k3", 3, LocalDate.of(2023, 12, 3)));
        klientList.add(new Klient("k4", 4, LocalDate.of(2023, 11, 29)));
        klientList.add(new Klient("k5", 5, LocalDate.of(2023, 12, 2)));
        System.out.println(klientList);
        Collections.sort(klientList);
        System.out.println(klientList);*/

        //Zad 3
        //Napisz klasę Osoba z polami imie (String), wiek (int) i wzrost
        // (double). Napisz klasę implementującą interfejs Comparator,
        // która porównuje osoby na podstawie wieku. Stwórz tablicę 5
        // osób i posortuj ją według wieku.
        /*ArrayList<Osoba> osobaList = new ArrayList<>();
        osobaList.add(new Osoba("Jan", 17, 164));
        osobaList.add(new Osoba("Anna", 20, 183));
        osobaList.add(new Osoba("Marek", 32, 166));
        osobaList.add(new Osoba("Kasia", 25, 167));
        osobaList.add(new Osoba("Piotr", 20, 162));
        System.out.println(osobaList);
        Collections.sort(osobaList, new WiekOsobaComparator());
        System.out.println(osobaList);*/

        //Zad 4
        //Napisz klasę Produkt z polami nazwa (String), cena (double) i
        // dataWaznosci (LocalDate). Napisz klasę implementującą interfejs
        // Comparator, która porównuje produkty na podstawie daty ważności.
        // Stwórz listę 5 produktów i posortuj ją według daty ważności.
        /*ArrayList<Produkt> productList = new ArrayList<>();
        productList.add(new Produkt("Jogurt", 2.5, LocalDate.of(2023, 12, 15)));
        productList.add(new Produkt("Chleb", 3.0, LocalDate.of(2023, 12, 10)));
        productList.add(new Produkt("Ser", 5.0, LocalDate.of(2023, 12, 5)));
        productList.add(new Produkt("Mleko", 2.0, LocalDate.of(2023, 12, 20)));
        productList.add(new Produkt("Jajka", 4.0, LocalDate.of(2023, 12, 8)));
        System.out.println(productList);
        Collections.sort(productList, new DataWaznosciComparator());
        System.out.println(productList);*/

        //Zad 5
        //Napisz klasę Osoba, która zawiera pola: imie (typu String),
        // wzrost (typu double). Zaimplementuj interfejs Comparable w
        // taki sposób, aby obiekty klasy Osoba były sortowane malejąco
        // według wzrostu. Stwórz listę 5 obiektów klasy Osoba i posortuj
        // ją według sprecyzowanego kryterium.
        /*ArrayList<Osoba2> osoba2List = new ArrayList<>();
        osoba2List.add(new Osoba2("Jan", 180.5));
        osoba2List.add(new Osoba2("Anna", 165.0));
        osoba2List.add(new Osoba2("Marek", 175.0));
        osoba2List.add(new Osoba2("Kasia", 170.0));
        osoba2List.add(new Osoba2("Piotr", 185.0));
        System.out.println(osoba2List);
        Collections.sort(osoba2List);
        System.out.println(osoba2List);*/

        //Zad 6
        //Napisz klasę Student, która zawiera pola: name (typu String),
        // averageGrade (typu double) i yearOfStudy (typu int). Zaimplementuj
        // interfejs Comparable w taki sposób, aby obiekty klasy Student
        // były sortowane według jednego kryterium: malejąco według
        // średniej ocen, a przy równości sortowane były rosnąco według
        // roku studiów. Stwórz tablicę 4 obiektów klasy Student i posortuj
        // ją według sprecyzowanego kryterium.
        /*ArrayList<Student2> student2List = new ArrayList<>();
        student2List.add(new Student2("p1", 5.3, 1));
        student2List.add(new Student2("p2", 2.5, 3));
        student2List.add(new Student2("p3", 3.4, 2));
        student2List.add(new Student2("p4", 2.5, 4));
        student2List.add(new Student2("p5", 2.2, 2));
        System.out.println(student2List);
        Collections.sort(student2List);
        System.out.println(student2List);*/

        //Zad 7
        //Napisz klasę Car z trzema polami: make (String), model (String)
        // i mileage (double). Zaimplementuj interfejs Cloneable i nadpisz metodę clone(), aby móc klonować obiekty tej klasy. W metodzie
        // main() utwórz obiekt Car, sklonuj go, a następnie zmień
        // przebieg (mileage) oryginalnego samochodu. Wyświetl przebieg
        // obu samochodów, aby zobaczyć, czy są niezależne.
        Car c1 = new Car("m1", "mode1", 12.4);
        Car c2 = (Car)c1.clone();
        System.out.println(c1);
        System.out.println(c2);
        c1.mileage = 25.16;
        System.out.println(c1);
        System.out.println(c2);
    }
}