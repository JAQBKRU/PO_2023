public record Person(String name, int age) {
    public Person{
        if(name.isBlank() || name == null){
            name = "unknown";
        }

        if(age < 0){
            age = 0;
        }
    }

    Person(String name){
        this(name, 0);
    }

    public void greet(){
        System.out.println("Czesc");
    }
}
