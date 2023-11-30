import java.util.ArrayList;

public record Order(ArrayList<Product> produkty) {
    public void totalValue(){
        double suma = 0;
        for(var produkt: produkty){
            suma += produkt.cena();
        }

        System.out.println("Wartosc produktow " + suma);
    }
}
