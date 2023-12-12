import java.util.Comparator;

public class Student implements Comparable<Student>, Cloneable{
    String name;
    int yearOfBirth;
    double averageGrade;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.averageGrade = averageGrade;
    }

    public Student(double averageGrade) {
        name = "default";
        yearOfBirth = 2000;
        this.averageGrade = averageGrade;
    }
    public Student(int yearOfBirth) {
        name = "default";
        this.yearOfBirth = yearOfBirth;
        this.averageGrade = 4.0;
    }

    @Override
    public String toString() {
        return "" + averageGrade;
    }

    @Override
    public int compareTo(Student o) {
        return (int)Math.signum(o.averageGrade - this.averageGrade);//Math.signum - zwraca znak
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class AverageGradeStudentComp implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return (int)Math.signum(o2.averageGrade - o1.averageGrade);
    }
}

class YearOfBirthStudentComp implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o2.yearOfBirth = o1.yearOfBirth;
    }
}