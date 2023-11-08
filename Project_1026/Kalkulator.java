public class Kalkulator {
	public static int dodawanie(int a, int b) { return a + b; }
	
	public static int odejmowanie(int a, int b) { return a - b; }
	
	public static int mnozenie(int a, int b) { return a * b; }
	
	public static double dzielenie(double a, double b) {
		if (b != 0.0D)
			return a / b; 
		return a;
	}
}