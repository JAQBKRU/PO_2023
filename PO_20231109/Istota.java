public class Istota {
    public Istota(){
        System.out.println("Instancja istoty");
    }
}

class Czlowiek extends Istota{
    public Czlowiek(){
        System.out.println("Instancja czlowieka");
    }
}

class Programista extends Czlowiek{
    public Programista(){
        System.out.println("Instancja programisty");
    }
}
