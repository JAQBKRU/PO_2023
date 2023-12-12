public class Student2 implements Comparable<Student2>{
    String imie;
    double averageGrade;
    int yearOfBirth;

    public Student2(String imie, double averageGrade, int yearOfBirth) {
        this.imie = imie;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "" + averageGrade + " " + yearOfBirth;
    }

    @Override
    public int compareTo(Student2 o) {
        if(o.averageGrade > this.averageGrade) return 1;
        else if(o.averageGrade < this.averageGrade) return -1;

        return (int)Math.signum(this.yearOfBirth - o.yearOfBirth);
    }
}
