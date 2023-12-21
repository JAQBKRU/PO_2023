public class SensorTest {
    public static void main(String[] args) {
        Sensor s1 = new TemperatureSensor(10.53, false);
        Sensor s2 = new PressureSensor(18.22, true);
        System.out.println("Status s1: " + s1.getStatus());
        System.out.println("Status s2: " + s2.getStatus());
        System.out.println("Value s1: " + s1.readValue());
        System.out.println("Value s2: " + s2.readValue());
        s1.reset();
        System.out.println("Status s1: " + s1.getStatus());
        s2.reset();
    }
}
