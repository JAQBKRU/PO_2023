public interface LoudAnimal {
    public abstract void makeNoise();
}

class Dog implements LoudAnimal{
    @Override
    public void makeNoise() {
        System.out.println("Hau hau");
    }
}

class Cat implements LoudAnimal{
    @Override
    public void makeNoise() {
        System.out.println("Miau miau");
    }
}
