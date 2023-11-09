public class Person {
    private String firstName;
    protected String lastName;

    public String getFirstName(){
            return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}

class Employee extends Person{
    public Employee(){}

    public Employee(String firstName, String lastName){
//        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayData(){
        System.out.println(getFirstName() + " " + getLastName());
    }
}