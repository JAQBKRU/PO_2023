public class Ksiazka {
    public String tytul;
    public String autor;
    public int rokWydania;

    //constructor - default param
    public Ksiazka(){
        tytul = "default";
        autor = "default";
        rokWydania = 2023;
    }

    public Ksiazka(String tytul, String autor, int rokWydania){
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }
}
