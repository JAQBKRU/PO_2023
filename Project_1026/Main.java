public class Main {
	public static void main(String[] args) {
		Produkt p1 = new Produkt("Produkt 1");
		System.out.println("Liczba produktów: " + Produkt.liczbaProduktow);
		Produkt p2 = new Produkt("Produkt 2");
		System.out.println("Liczba produktów: " + Produkt.liczbaProduktow);
		Produkt p3 = new Produkt("Produkt 3");
		System.out.println("Liczba produktów: " + Produkt.liczbaProduktow);
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if (singleton1 == singleton2) {
			System.out.println("ta sama referencja");
		} else {
			System.out.println("inna referencja");
		} 
	}
}