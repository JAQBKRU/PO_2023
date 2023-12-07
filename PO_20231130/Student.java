import java.util.ArrayList;

public record Student(String imie, String nazwisko, ArrayList<Integer> oceny) {
    public void averageGrades(){
        double suma = 0;
        for(int i = 0; i < oceny.size(); i++){
            suma += oceny.get(i);
        }

        System.out.println(imie + " " + nazwisko + " ma srednia " + suma/oceny.size());
    }
}
