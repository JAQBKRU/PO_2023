public class TestDataProcessor {
    public static void main(String[] args) {
        DataProcessor d1 = new TextProcessor();
        DataProcessor d2 = new NumberProcessor();
        System.out.println(d1.processData("dane"));
        System.out.println(d1.isValid("dane123"));
        System.out.println(d2.processData("dane"));
        System.out.println(d2.isValid("12 d"));
    }
}
