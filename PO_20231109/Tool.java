public class Tool {
    public String nazwa;

    protected Tool(String nazwa){
        this.nazwa = nazwa;
    }
}

class Hammer extends Tool{
    public Hammer(String nazwa) {
        super(nazwa);
    }
}