public class Animal {
    public String nazwa;
    public Animal(){}

    public Animal(String nazwa){
        this.nazwa = nazwa;
    }
    @Override
    public String toString(){
        return nazwa;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Animal o){
            return this.nazwa.equals(o.nazwa);
        }else{
            return false;
        }
    }

    public void dajGlos(){
        System.out.println("Odglos zwierzecia");
    }
}

class Cat extends Animal{
    public Cat(){

    }
    public Cat(String nazwa) {
        super(nazwa);
    }

    @Override
    public void dajGlos(){
        System.out.println("Miau Miau");
    }
}
