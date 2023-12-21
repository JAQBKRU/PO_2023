public interface Sensor {
    public abstract double readValue();
    public abstract String getStatus();
    public abstract void reset();
}

class TemperatureSensor implements Sensor{
    private double value;
    private boolean status;

    public TemperatureSensor(double value, boolean status) {
        this.value = value;
        this.status = status;
    }

    @Override
    public double readValue() {
        return this.value;
    }

    @Override
    public String getStatus() {
        return this.status ? "on" : "off";
    }

    @Override
    public void reset() {
        this.value = 12.5;
        this.status = true;

        System.out.println("Restarting temperature sensor");
    }
}

class PressureSensor implements Sensor{
    private double value;
    private boolean status;

    public PressureSensor(double value, boolean status) {
        this.value = value;
        this.status = status;
    }

    @Override
    public double readValue() {
        return this.value;
    }

    @Override
    public String getStatus() {
        return this.status ? "on" : "off";
    }

    @Override
    public void reset() {
        this.value = 32.5;
        this.status = true;

        System.out.println("Restarting pressure sensor");
    }
}
