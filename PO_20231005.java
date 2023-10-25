import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Zad 1
        Napisz prostą aplikację kalkulatora tekstowego, która przyjmuje dwa liczby od użytkownika jako wejście i wykonuje podstawowe operacje matematyczne (dodawanie, odejmowanie, mnożenie, dzielenie). Wyświetl wyniki na ekranie.*/
        /*System.out.println("Podaj pierwsza liczbe");
        double n1 = scanner.nextDouble();

        System.out.println("Podaj druga liczbe");
        double n2 = scanner.nextDouble();

        System.out.println("Wynik '+' to: " + (n1 + n2));
        System.out.println("Wynik '-' to: " + (n1 - n2));
        System.out.println("Wynik '*' to: " + (n1 * n2));
        System.out.println("Wynik '/' to: " + (n1 / n2));*/

        /*Zad 2
        Napisz program, który wczytuje ze standardowego wejścia dwa łańcuchy znaków, a następnie wypisuje je w kolejnych wierszach na standardowym wyjściu.*/
        /*System.out.println("Podaj pierwszy ciag znakow");
        String ciag1 = scanner.next();

        System.out.println("Podaj drugi ciag znakow");
        String ciag2 = scanner.next();

        System.out.println(ciag1);
        System.out.println(ciag2);*/

        /*Zad 3
        Napisz program, który wczytuje ze standardowego wejścia cztery liczby wymierne, a następnie wypisuje ich sumę na standardowym wyjściu.
         */
        /*System.out.println("Podaj pierwsza liczbe");
        float n1 = scanner.nextFloat();

        System.out.println("Podaj druga liczbe");
        float n2 = scanner.nextFloat();

        System.out.println("Podaj trzecia liczbe");
        float n3 = scanner.nextFloat();

        System.out.println("Podaj czwarta liczbe");
        float n4 = scanner.nextFloat();
        System.out.println("Wynik: " + (n1 + n2 + n3 + n4));*/

        /*Zad 4
        Stwórz program do obliczenia pola kwadratu. Dane pobierz od użytkownika, wynik wyświetl na standardowym wyjściu.
        */
        /*System.out.println("Podaj dlugosc boku kwadratu");
        float bok = scanner.nextFloat();

        System.out.println("Wynik: " + (Math.pow(bok, 2)));*/

        /*Zad 5
        Napisz program, który przyjmuje trzy liczby całkowite jako argumenty i zwraca największą z nich. Zastosuj instrukcje warunkowe do porównania liczb.*/
        /*System.out.println("Podaj pierwsza liczbe");
        double n1 = scanner.nextDouble();

        System.out.println("Podaj druga liczbe");
        double n2 = scanner.nextDouble();

        System.out.println("Podaj trzecia liczbe");
        double n3 = scanner.nextDouble();

        if(n1 >= n2 && n1 >= n3) System.out.println(n1);
        else if(n2 >= n1 && n2 >= n3) System.out.println(n2);
        else System.out.println(n3);*/

        /*Zad 6
        Napisz program, który na podstawie podanego jako argument numeru dnia tygodnia (od 1 do 7) wypisze nazwę tego dnia tygodnia. Dla przykładu, jeżeli użytkownik poda liczbę 1, program powinien wypisać “Poniedziałek”. Jeżeli podana liczba nie jest z zakresu od 1 do 7, program powinien wyświetlić komunikat “Niepoprawny numer dnia tygodnia”*/
        /*System.out.println("Dzien tygodnia: ");
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
        }*/

        /*Zad 7
        Napisz program, który będzie sprawdzał, czy podany rok jest rokiem przestępnym. Rok jest przestępny, jeśli jest podzielny przez 4, ale nie jest podzielny przez 100, chyba że jest podzielny przez 400*/
        /*System.out.println("Podaj rok: ");
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("To jest rok przestepny");
        }else{
            System.out.println("To nie jest rok przestepny");
        }*/

        /*Zad 8
        Napisz program sprawdzający czy podane liczby z klawiatury mogą stanowić poprawna godzinę w formacie 24-godzinnym. Przykładowe wejście: Podaj godzinę: 22Podaj minuty: 12Podaj sekundy: 33 Przykładowe wyjście: Poprawna godzina!*/
        /*System.out.println("Podaj hh: ");
        int hh = scanner.nextInt();

        System.out.println("Podaj mm: ");
        int mm = scanner.nextInt();

        System.out.println("Podaj ss: ");
        int ss = scanner.nextInt();

        if(hh >= 0 && hh <= 23 && mm >= 0 && mm <= 59 && ss >= 0 && ss <= 59){
            System.out.println("Poprawna godzina!");
        }else{
            System.out.println("Niepoprawna godzina!");
        }*/

        /*Zad 9
        Napisz program, który wykorzystując pętlę for wyświetli liczby od 1 do 100.*/
        /*for(int i=1; i<=100; i++){
            System.out.println(i);
        }*/

        /*Zad 10
        Napisz program, który przy użyciu pętli while obliczy sumę liczb od 1 do 50.*/
        /*double suma = 0;
        int i = 1;
        while(i != 51){
            suma += i;
            i++;
        }
        System.out.println(suma);*/

        /*Zad 11
        Napisz program, który oblicza sumę cyfr dowolnej wprowadzonej liczby. Program powinien akceptować liczbę jako input od użytkownika.*/
        /*System.out.println("Podaj liczbe: ");
        int n = scanner.nextInt();

        int suma = 0;
        while(n > 0){
            suma += n % 10;
            n /= 10;

        }
        System.out.println(suma);*/

        /*Zad 12
        Stwórz program, który przyjmie od użytkownika liczbę całkowitą i zwróci tę liczbę w odwrotnej kolejności. Na przykład, dla liczby 12345, wynik powinien wynosić 54321. Możesz ograniczyć program tylko do liczb dodatnich.*/
        /*System.out.println("Podaj liczbe: ");
//        int n = scanner.nextInt();
        int n = 12345;

        String str = "";
        while(n > 0){
            str += n % 10;
            n /= 10;

        }
        System.out.println(Integer.parseInt(str));*/

        /*Zad 13
        Napisz program, który sprawdzi, czy podana liczba jest liczbą Armstronga. Liczba Amstronga to taka, której suma jej cyfr podniesionych do potęgi równiej liczbie cyfr w tej liczbie, jest równa samej liczbie. (Liczba 153 jest liczbą Armstronga).*/
        /*System.out.println("Podaj liczbe: ");
//        int n = 153;
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
            System.out.println("Liczba Armstronga");
        }else{
            System.out.println("To nie liczba Armstronga");
        }*/

        /*Zad 14
        Napisz program wczytujący kolejne liczby całkowite (różnych znaków) z klawiatury i kończący się gdy ich suma przekroczy 100.*/
        int suma = 0;
        while(suma < 101){
            System.out.println("Podaj liczbe: ");
            suma += scanner.nextInt();
        }
        System.out.println("Suma przekroczyla '100', twoja suma: " + suma);
    }
}