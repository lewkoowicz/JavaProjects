public class Student extends Person {

    public String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void work() {
        System.out.println("Studies at " + university);
    }
}
