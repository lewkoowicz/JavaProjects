public class Employee extends Person {

    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    public void work() {
        System.out.println("Working at " + company);
    }

    public String getCompany() {
        return this.company;
    }
}
