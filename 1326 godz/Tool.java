public class Tool {
    protected String nazwa;
    protected Tool(String nazwa){
        this.nazwa = nazwa;
    }
}

class Hammer extends Tool{
    protected Hammer(String nazwa) {
        super(nazwa);
    }
}