//Zadanie z 20231012
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Zad dodatkowe
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");
        int num1 = scanner.nextInt();//243
        System.out.println(odwrocLiczbe(num1));//342

        Random random = new Random();
        //int liczba = random.nextInt(10,15);//[10;15)
        double num2 = random.nextDouble();//[0;1)
        System.out.println(num2);*/

//        System.out.println(generateRandomInt());//Zad 1
//        System.out.println(generateRandomDouble());//Zad 2
//        System.out.println(generateRandomGaussian());//Zad 3
//        System.out.println(generateRandomBoolean());//Zad 4
//        zadanie5();//Zad 5
//        zadanie6();//Zad 6
//        zadanie7();//Zada 7
//        piramida();//Zad 8
//        zadanie9();//Zad 9
//        System.out.println(reverseString("bananowy"));//Zad 10//ywonanab
//        zadanie11();
    }

    //Zad dodatkowe
    /*public static int odwrocLiczbe(int n){
        int odwrocona = 0;
        while(n != 0){
            odwrocona = odwrocona * 10 + n % 10;
            n /= 10;
        }
        return odwrocona;
    }*/

    //Zad 1
    //Napisz metodę generateRandomInt, która generuje i zwraca losową liczbę całkowitą.
    /*public static int generateRandomInt(){
        Random r = new Random();

        return r.nextInt();
    }*/

    //Zad 2
    //Napisz metodę generateRandomDouble, która generuje i zwraca losową liczbę zmiennoprzecinkową z zakresu od 0.0 do 1.0
    /*public static double generateRandomDouble(){
        Random r = new Random();

        return r.nextDouble(1);
    }*/

    //Zad 3
    //Napisz metodę generateRandomGaussian, która generuje i zwraca losową liczbę zmiennoprzecinkową zgodnie z rozkładem normalnym.
    /*public static double generateRandomGaussian(){
        Random r = new Random();

        return r.nextGaussian();
    }*/

    //Zad 4
    //Napisz metodę generateRandomBoolean, która generuje i zwraca losową wartość logiczną (true lub false)
    /*public static boolean generateRandomBoolean(){
        Random r = new Random();

        return r.nextBoolean();
    }*/

    //Zad 5
    //Napisz program, który tworzy tablicę jednowymiarową 10 liczb całkowitych, a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia
    /*public static void zadanie5(){
        Random r = new Random();
        int[] tab = new int[10];

        for(int i=0; i < tab.length; i++){
            tab[i] = r.nextInt();
        }

        for(int i=9; i >= 0; i--){
            System.out.println(tab[i]);
        }
    }*/

    //Zad 6
    //Utwórz program, który tworzy jednowymiarową tablicę 20 liczb losowych z przedziału od 1 do 100, a następnie oblicza i wyświetla ich średnią wartość
    /*public static void zadanie6(){
        Random r = new Random();
        int[] tab = new int[20];

        int suma = 0;
        for(int i=0; i < tab.length; i++){
            tab[i] = r.nextInt(1,101);
            suma += tab[i];
        }

        double avg = (double)suma/tab.length;
        System.out.println(avg);
    }*/


    //Zad 7
    //Napisz program, który tworzy tablicę jednowymiarową 15 liczb całkowitych, a następnie oblicza i wyświetla największą i najmniejszą wartość w tablicy
    /*public static void zadanie7(){
        Random r = new Random();
        int[] tab = new int[15];

        for(int i=0; i < tab.length; i++){
            tab[i] = r.nextInt();
        }

        int max = Arrays.stream(tab).max().orElseThrow();
        int min = Arrays.stream(tab).min().orElseThrow();

        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }*/

    //Zad 8
    //Napisz program, który przyjmuje jako wejście pojedynczy znak oraz liczbę całkowitą n. Używając klasy StringBuilder, zbuduj i wypisz piramidę o wysokości n, gdzie każdy poziom piramidy składa się z podanego znaku. Na przykład dla znaku * i n=3, oczekiwany wynik to:
    //  *
    // ***
    //*****
    /*public static void piramida(){
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
    }*/

    //Zad 9
    //Dany jest napis. Używając StringBuilder, napisz program, który usuwa wszystkie powtarzające się znaki, pozostawiając tylko pierwsze wystąpienie każdego znaku. Na przykład dla napisu “bananowy”, oczekiwany wynik to “banowy”.
    /*public static void zadanie9(){
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
    }*/


    //Zad 10
    //Napisz metodę statyczną reverseString, która przyjmuje jako argument obiekt typu StringBuilder i zwraca nowy StringBuilder, będący odwróconym napisem pierwotnym.
    /*public static String reverseString(String napis){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < napis.length(); i++){
            sb.append(napis.charAt(napis.length()-i-1));
        }

        return sb.toString();
    }*/

    //Zad 11
    //Napisz program, który tworzy listę tablicową 10 liczb całkowitych, a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia
    //lista tablicowa = ArrayList<T>
    //ArrayList<Integer>
    /*public static void zadanie11(){
        ArrayList<Integer> arr = new ArrayList<>(List.of(5, 8, 2, 10, 21, 7, 14, 3, 1, 9));

        for (int i=0; i < arr.size(); i++) {
            System.out.println(arr.get(arr.size()-i-1));
        }
    }*/
}