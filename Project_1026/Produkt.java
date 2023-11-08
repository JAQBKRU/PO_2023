public class Produkt {
	public static final int MAX_PRODUKTOW = 2;
	
	public static int liczbaProduktow = 0;
	
	private String nazwa;
	
	public Produkt(String nazwa) {
		this.nazwa = nazwa;
		liczbaProduktow++;
	}
}