public class Samochod {
    public String marka;
    public String model;
    public int rokProdukcji;

    public Samochod(){
        marka = "default";
        model = "default";
        rokProdukcji = 2023;
    }

    public Samochod(String marka, String model){
        this.marka = marka;
        this.model = model;
    }

    public Samochod(String marka, String model, int rokProdukcji){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }
}
