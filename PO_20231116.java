//Zadanie z 20231116
import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Zad 1
        StringBuilder sb = new StringBuilder("test");
        System.out.println(zad1.capitalizeEverySecond(sb));

        //zad 6
        Vehicle2 car = new Car3();
        car.drive();

        //Zad 7
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6,};
        System.out.println(zad7.mergeArrays(arr1, arr2));
    }
}

//Zad 1
//Napisz metodę statyczną capitalizeEverySecond, która przyjmuje jako argument obiekt typu StringBuilder. Metoda ma zmienić każdą drugą literę na wielką. Stwórz przypadek testowy.
class zad1{
    public static String capitalizeEverySecond(StringBuilder sb){
        for(int i = 0; i < sb.length(); i+=2){
            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }
        return sb.toString();
    }
}

//Zad 2
//Napisz klasę Student, która ma pola: firstName, lastName i fieldOfStudy. Zdefiniuj w niej dwa konstruktory, jeden przyjmujący wszystkie trzy parametry, a drugi tylko firstName i lastName. Drugi konstruktor powinien wywoływać pierwszy, przekazując mu domyślną wartość fieldOfStudy jako unknown.
class Student{
    public String firstName;
    public String lastName;
    public String fieldOfStudy;

    public Student(String firstName, String lastName, String fieldOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, "unknown");
    }
}

//Zad 3
//Zdefiniuj klasę Car, która ma pola: brand, model i productionYear. Klasa powinna zawierać dwa konstruktory: pierwszy przyjmujący wszystkie trzy parametry, a drugi tylko markę i model. Drugi konstruktor powinien wywoływać pierwszy, przekazując mu domyślną wartość productionYear jako aktualny rok.
class Car{
    public String brand;
    public String model;
    public int productionYear;

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public Car(String brand, String model) {
        this(brand, model, 2023);
    }
}

//Zad 4
//Stwórz klasę bazową o nazwie Vehicle z polami: brand i model. Klasa ta powinna posiadać konstruktor przyjmujący oba te parametry. Następnie stwórz klasę potomną o nazwie Car, która dziedziczy po klasie Vehicle. Klasa Car powinna posiadać dodatkowe pole numberOfDoors. Stwórz konstruktor dla klasy Car, który przyjmuje wszystkie trzy parametry i korzysta z konstruktora klasy bazowej. Stwórz przypadek testowy.
class Vehicle{
    public String brand;
    public String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}

class Car2 extends Vehicle{
    public int numberOfDoors;

    public Car2(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }
}

//Zad 5
//Wykonaj poniższe czynności:
//Zdefiniuj klasę Book, która posiada następujące pola: title, author i numberOfPages.
//Napisz konstruktor, który przyjmuje trzy argumenty i waliduje je przed przypisaniem do odpowiednich pól.
    //Liczba stron (numberOfPages) nie powinna być ujemna. W przypadku podania wartości ujemnej, ustaw liczbę stron na jedną.
    //Pola title i author nie powinny być puste ani równać się null. W przypadku podania pustego napisu lub null, ustaw odpowiednio pusty napis.
//Dodaj metodę toString(), która zwraca informacje o książce w formacie: "Book: [title] by [author], Pages: [numberOfPages].".
//Dodaj metodę equals(), która porównuje dwie książki na podstawie ich pól title, author i numberOfPages
class Book{
    public String title;
    public String author;
    public int numberOfPages;

    public Book(String title, String author, int numberOfPages){
        if(numberOfPages < 0) this.numberOfPages = 1;
        else this.numberOfPages = numberOfPages;

        if(!title.isEmpty() && title != null) this.title = title;
        else this.title = "";

        if(!author.isEmpty() && author != null) this.author = title;
        else this.author = "";
    }

    @Override
    public String toString(){
        return "Book: " + this.title + " by " + this.author + ", Pages: " + this.numberOfPages + ".";
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Book o){
            return this.title.equals(o.title) && this.author.equals(o.author) && this.numberOfPages == o.numberOfPages;
        }
        return false;
    }
}

//Zad 6
//Wykonaj kolejno poniższe czynności:
//1.Stwórz klasę bazową Vehicle z metodą drive, która wypisuje “The vehicle is moving.”. Następnie stwórz klasę potomną Car, która nadopisuje metodę drive tak, by wypisywała “The car is moving.”. Utwórz obiekt klasy Car i wywołaj jego metodę drive, aby zaobserwować wynik.
//2.Na bazie klasy Vehicle z poprzedniego podpunktu, w klasie Car, nadpisz metodę drive tak, by wywoływała oryginalną metodę z klasy bazowej i dodatkowo wypisywała informacje specyficzne dla klasy Car. Użyj słowa kluczowego super, aby wywołać metodę z klasy bazowej.
class Vehicle2{
    public void drive(){
        System.out.println("The vehicle is moving.");
    }
}

class Car3 extends Vehicle2{
    public void drive(){
        super.drive();
        System.out.println("The Car is moving.");
    }
}

//Zad 7
//Napisz statyczną metodę mergeArrays, która przyjmuje dwie tablice liczb całkowitych jako argumenty. Funkcja powinna zwrócić nową listę tablicową, która jest połączeniem obu pierwotnych tablic. Na przykład, dla list tablicowych [1, 2, 3] i [4, 5, 6], funkcja powinna zwrócić [1, 2, 3, 4, 5, 6]. Stwórz przypadek testowy.
class zad7{
    public static ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
            arr.add(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++){
            arr.add(arr2[i]);
        }

        return arr;
    }
}