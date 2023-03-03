public class OOP {

    public static void main(String[] args) {

        Employee empl1 = new Employee("John", 30, "Apple");
        empl1.work();
        System.out.println(empl1.getCompany());

        Student stu1 = new Student("Michael", 20, "Stanford");
        stu1.work();
        System.out.println(stu1.university);
    }
}
