//Przydatne rzeczy do kolokwium

//user input number <-------------------------------------
        import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe");
        double n1 = scanner.nextDouble();//2

        System.out.println("Podaj druga liczbe");
        double n2 = scanner.nextDouble();//3,1

        System.out.println("Wynik '+' to: " + (n1 + n2));//(2 + 3,1) = 5,1

//user input string <-------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszy ciag znakow");
        String ciag1 = scanner.next();//abc

        System.out.println("Podaj pierwszy ciag znakow");
        String ciag2 = scanner.next();//efg

        System.out.println(ciag1);//abc


//switch <-------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dzien tygodnia: ");
        int dayNum = scanner.nextInt();

        switch(dayNum) {
            case 1:
                System.out.println("PN");
                break;
            case 2:
                System.out.println("WT");
                break;
            case 3:
                System.out.println("SR");
                break;
            case 4:
                System.out.println("CZW");
                break;
            case 5:
                System.out.println("PT");
                break;
            case 6:
                System.out.println("SB");
                break;
            case 7:
                System.out.println("ND");
                break;
            default:
                System.out.println("Niepoprawny numer dnia tygodnia");
                break;
        }


//Napisz program, który oblicza sumę cyfr dowolnej wprowadzonej liczby.
//Program powinien akceptować liczbę jako input od użytkownika.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int n = scanner.nextInt();//14

        int suma = 0;
        while(n > 0){
            suma += n % 10;
            n /= 10;

        }
        System.out.println(suma);//5


//Stwórz program, który przyjmie od użytkownika liczbę całkowitą i zwróci tę 
//liczbę w odwrotnej kolejności. Na przykład, dla liczby 12345, wynik powinien 
//wynosić 54321. Możesz ograniczyć program tylko do liczb dodatnich.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int n = scanner.nextInt();//12345

        String str = "";
        while(n > 0){
            str += n % 10;
            n /= 10;

        }
        System.out.println(Integer.parseInt(str));//54321


//Napisz program, który sprawdzi, czy podana liczba jest liczbą Armstronga.
//Liczba Amstronga to taka, której suma jej cyfr podniesionych do potęgi równiej 
//liczbie cyfr w tej liczbie, jest równa samej liczbie. (Liczba 153 jest liczbą Armstronga).
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj liczbe: ");//153
        int n = scanner.nextInt();
        int nCopy = n;
        int strLength = 0;
        while(n > 0){
            n /= 10;
            strLength++;
        }

        int sum = 0;
        n = nCopy;
        while(n > 0){
            sum += Math.pow(n % 10, strLength);
            n /= 10;
        }

        if(nCopy == sum){
            System.out.println("Liczba Armstronga");//TAK
        }else{
            System.out.println("To nie liczba Armstronga");
        }

//Napisz program, który tworzy tablicę jednowymiarową 10 liczb całkowitych,
//a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia
    public static void zadanie5(){
        Random r = new Random();
        int[] tab = new int[10];

        for(int i=0; i < tab.length; i++){
            tab[i] = r.nextInt();
        }

        for(int i=9; i >= 0; i--){
            System.out.println(tab[i]);
        }
    }

//Utwórz program, który tworzy jednowymiarową tablicę 20 liczb losowych z 
//przedziału od 1 do 100, a następnie oblicza i wyświetla ich średnią wartość
    public static void zadanie6(){
        Random r = new Random();
        int[] tab = new int[20];

        int suma = 0;
        for(int i=0; i < tab.length; i++){
            tab[i] = r.nextInt(1,101);
            suma += tab[i];
        }

        double avg = (double)suma/tab.length;
        System.out.println(avg);
    }

//StringBuilder <-------------------------------------
//Napisz program, który przyjmuje jako wejście pojedynczy znak oraz liczbę całkowitą n.
//Używając klasy StringBuilder, zbuduj i wypisz piramidę o wysokości n, gdzie każdy 
//poziom piramidy składa się z podanego znaku. Na przykład dla znaku * i n=3, oczekiwany wynik to:
//  *
// ***
//*****
    public static void piramida(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj znak: ");
        char znak = scanner.next().charAt(0);
        System.out.print("Podaj wysokosc piramidy: ");
        int h = scanner.nextInt();

        for(int i=0; i < h; i++){
            int nSpacji = h-i-1;
            int nZnakow = 2*i+1;

            StringBuilder sb = new StringBuilder();
            while(nSpacji-->0){
                sb.append(' ');
            }

            while(nZnakow-->0){
                sb.append(znak);
            }

            System.out.println(sb.toString());
        }
    }

//Dany jest napis. Używając StringBuilder, napisz program, który usuwa 
//wszystkie powtarzające się znaki, pozostawiając tylko pierwsze wystąpienie 
//każdego znaku. Na przykład dla napisu “bananowy”, oczekiwany wynik to “banowy”.
    public static void zadanie9(){
        String napis = "bananowy";//banowy
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < napis.length(); i++){
            int jestNaSB = 0;
            for(int k=0; k < sb.length(); k++){
                if(sb.charAt(k) == napis.charAt(i)){
                    jestNaSB = 1;
                }
            }

            if(jestNaSB == 0){
                sb.append(napis.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }

//Napisz metodę statyczną reverseString, która przyjmuje jako argument obiekt 
//typu StringBuilder i zwraca nowy StringBuilder, będący odwróconym napisem pierwotnym.
    public static String reverseString(String napis){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < napis.length(); i++){
            sb.append(napis.charAt(napis.length()-i-1));
        }

        return sb.toString();
    }

//ArrayList <-------------------------------------
import java.util.ArrayList;
import java.util.List;
//Napisz program, który tworzy listę tablicową 10 liczb całkowitych,
//a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia
//lista tablicowa = ArrayList<T>
//ArrayList<Integer>
    public static void zadanie11(){
        ArrayList<Integer> arr = new ArrayList<>(List.of(5, 8, 2, 10, 21, 7, 14, 3, 1, 9));

        for (int i=0; i < arr.size(); i++) {
            System.out.println(arr.get(arr.size()-i-1));
        }
    }








//dwa konstruktory - jeden domyślny, który nie przyjmuje żadnych argumentów,
//i drugi, który przyjmuje trzy argumenty odpowiadające polom klasy.
public class Ksiazka {
    public String tytul;
    public String autor;
    public int rokWydania;

    //constructor - default param
    public Ksiazka(){
        tytul = "default";
        autor = "default";
        rokWydania = 2023;
    }

    public Ksiazka(String tytul, String autor, int rokWydania){
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }
}
//run in main.java
        Ksiazka k1 = new Ksiazka();
        System.out.println(k1.tytul);

        Ksiazka k2 = new Ksiazka("Bill Gatsby", "FSJ", 1585);
        System.out.println(k2.autor);


//... dwa konstruktory, jeden przyjmujący wszystkie trzy parametry,
//a drugi tylko imię i nazwisko. Drugi konstruktor powinien wywołać 
//pierwszy, przekazując mu domyślną wartość wieku jako 0.
public class Osoba {
    public String imie;
    public String nazwisko;
    public int wiek;
    public Osoba(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie, String nazwisko){
        this(imie, nazwisko, 0);
    }
}

//run in main.java
        Osoba o1 = new Osoba("Daryl", "Adams", 31);
        System.out.println(o1.wiek);

        Osoba o2 = new Osoba("Darcy", "Murphy");
        System.out.println(o2.wiek);

//Zaprojektuj klasę Kwadrat, która posiada pole bok oraz konstruktor, 
//który umożliwia ustawienie wartości tego pola. Następnie napisz 
//drugi konstruktor, który nie przyjmuje żadnych argumentów, a jedynie 
//wywołuje pierwszy konstruktor z wartością domyślną 1
public class Kwadrat {
    public int bok;

    public Kwadrat(int bok){
        this.bok = bok;
    }

    public Kwadrat(){
        this(1);
    }
}

//wartosc niemutowalna - final
public class Matematyka {
    public static final double PI = 3.14159265359;//final - niemutowalna
}

//run in main.java
        System.out.println("PI: " + Matematyka.PI);
//        Matematyka.PI = 3;//nie zadziala bo jest niemutowalna























