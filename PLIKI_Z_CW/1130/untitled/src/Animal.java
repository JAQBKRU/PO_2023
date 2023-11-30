import java.util.Objects;

public class Animal {
    public int age;
    public double weight;
    public String name;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Animal animal = (Animal) object;
        return age == animal.age && Double.compare(weight, animal.weight) == 0 && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(age, weight, name);
        int result = 17;
        result = 31 * result + age;
        result = 31 * result + (int)(Double.doubleToLongBits(weight) ^ (Double.doubleToLongBits(weight) >>> 32));

        result = 31 * result + name.hashCode();

        return result;
    }
}
