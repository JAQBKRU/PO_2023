import java.awt.print.Book;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Person person = new Person("Carl", -15);
        Person person2 = new Person("Carl", 30);

        System.out.println(person);
        System.out.println(person2.equals(person2));
        person.greet();*/

        //Zad 1
        //Stwórz rekord BookDTO, który reprezentuje książkę w sklepie internetowym. Powinien zawierać takie informacje jak title, author, price i yearOfPublication. Następnie stwórz kilka instancji tego rekordu, reprezentujących różne książki.
        BookDTO book1 = new BookDTO("title1", "author1", 14, 2013);
        BookDTO book2 = new BookDTO("title2", "author2", 32, 2018);
        BookDTO book3 = new BookDTO("title3", "author2", 87, 2023);

        //Zad 2
        //Utwórz rekord Address, który zawiera street, houseNumber, postalCode i city. Następnie, stwórz rekord Person, który oprócz podstawowych informacji o osobie (np. firstName, lastName) zawiera również pole typu Address. Stwórz przypadek testowy.
        Address address1 = new Address("Polna", 11, "16-432", "Torben");
        Person2 person1 = new Person2("Carl", "Vent", address1);

        //Zad 3
        //Stwórz rekord Student, który reprezentuje imię, nazwisko i listę ocen ucznia. Wprowadź metodę averageGrades(), która oblicza średnią ocen ucznia. Stwórz przypadek testowy.
        ArrayList<Integer> oceny1 = new ArrayList<>();
        oceny1.add(1);
        oceny1.add(4);
        oceny1.add(4);
        oceny1.add(6);
        Student student1 = new Student("Carl", "Addey", oceny1);
        student1.averageGrades();

        //Zad 4
        //Stwórz rekord Order, który zawiera listę produktów oraz ich cen. Każdy produkt reprezentowany jest przez rekord Product z nazwą i ceną. W rekordzie Order dodaj metodę totalValue(), która oblicza łączną wartość zamówienia na podstawie cen produktów. Stwórz przypadek testowy.
        Product produkt1 = new Product("p1", 3);
        Product produkt2 = new Product("p2", 4);
        Product produkt3 = new Product("p3", 4);
        Product produkt4 = new Product("p4", 6);
        ArrayList<Product> produkty = new ArrayList<>();
        produkty.add(produkt1);
        produkty.add(produkt2);
        produkty.add(produkt3);
        produkty.add(produkt4);

        Order zamowienie = new Order(produkty);
        zamowienie.totalValue();
    }
}
