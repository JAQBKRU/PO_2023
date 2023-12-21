public class Main {
    public static void main(String[] args) {
        //Zad 1
        //Napisz interfejs o nazwie LoudAnimal, który będzie miał jedną metodę o nazwie makeNoise(). Następnie stwórz dwie klasy: Dog i Cat, które będą implementować ten interfejs. Dla każdej klasy zaimplementuj metodę makeNoise(), tak aby wydrukowała ona odpowiedni dźwięk zwierzęcia.
        Dog d1 = new Dog();
        //d1.makeNoise();
        Cat c1 = new Cat();
        //c1.makeNoise();

        //Zad 2
        //Stwórz interfejs o nazwie MyComparator, który będzie zawierał metodę compare(int a, int b): int. Metoda ta powinna zwrócić -1, jeśli a < b, 0 jeśli a == b i 1 jeśli a > b. Następnie stwórz klasę TestMyComparator, która będzie implementować ten interfejs. W klasie tej zaimplementuj metodę compare zgodnie z jej opisem.
        TestMyComparator t1 = new TestMyComparator();
//        System.out.println(t1.compare(3, 5));
//        System.out.println(t1.compare(2, 2));
//        System.out.println(t1.compare(5, 3));

        //Zad 3
        //Napisz interfejs Converter z trzema abstrakcyjnymi metodami: convertToEuro(double amount) zwracającą double, convertToUSD(double amount) zwracającą double oraz getConversionRate(String currency) przyjmującą nazwę waluty jako String i zwracającą double. Stwórz dwie klasy: CurrencyConverter i UnitConverter, które implementują ten interfejs. W osobnej klasie ConverterTest, przetestuj implementację metod dla obiektów obu klas.
        Converter curCon = new CurrencyConverter();
        Converter unitCon = new UnitConverter();
        double kwota = 10;
//        System.out.println(kwota + " USD to " + curCon.convertToUSD(kwota) + " Euro");
//        System.out.println("10 jednostek to " + unitCon.convertToEuro(10) + " Euro");
//        System.out.println("Kurs USD: " + curCon.getConversionRate("USD"));

        //Zad 4
        //Utwórz interfejs Authentication z trzema metodami abstrakcyjnymi: login(String username, String password) zwracającą boolean, logout() zwracającą void oraz resetPassword(String username, String oldPassword, String newPassword) zwracającą boolean. Stwórz dwie klasy UserAuthentication i AdminAuthentication, które implementują ten interfejs. W klasie AuthenticationTest przetestuj implementacje metod dla obiektów obu klas.
        Authentication uA = new UserAuthentication("u", "p123");
        Authentication aA = new AdminAuthentication("a", "p123#");
//        System.out.println("User login: " + uA.login("u1", "p123"));
//        System.out.println("Admin login: " + aA.login("a", "p123#"));
//        System.out.println("User reset password: " + uA.resetPassword("u", "p123", "newPass"));
//        System.out.println("Admin reset password: " + aA.resetPassword("a", "p123#x", "newPass"));
//        uA.logout();
//        aA.logout();

        //Zad 5
        //Zaprojektuj interfejs Sensor z trzema metodami abstrakcyjnymi: readValue() zwracającą double, getStatus() zwracającą String oraz reset() zwracającą void. Stwórz dwie klasy TemperatureSensor i PressureSensor, które implementują ten interfejs. W klasie SensorTest przetestuj działanie metod dla obiektów z obu klas.


        //Zad 6
        //Wykonaj poniższe czynności:
            //Napisz interfejs DataProcessor z dwoma metodami abstrakcyjnymi: processData(String data) zwracającą String i isValid(String data) zwracającą boolean.
            //Stwórz klasę TextProcessor, która implementuje DataProcessor. W metodzie processData zwróć dane w odwróconej kolejności, a w metodzie isValid sprawdź, czy dane nie są pustym napisem. Zabezpiecz metody przed nullem.
            //Stwórz drugą klasę NumberProcessor, która również implementuje DataProcessor. W metodzie processData zwróć dane z dodatkowym tekstem na początku “Processed:”, a w metodzie isValid sprawdź, czy dane są liczbą.
            //W klasie TestDataProcessor stwórz obiekty obu klas i przetestuj ich metody.
        //Wskazówka: W celu sprawdzenia, że string jest liczbą możesz użyć wyrażenia regularne:
        //str.matches("-?\\d+(\\.\\d+)?")

    }
}