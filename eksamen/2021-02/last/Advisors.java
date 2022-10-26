package last;

public class Advisors extends Employees {
    private String department;

    public Advisors(int number, String firstName, String lastName, String department) {
        super(number, firstName, lastName);
        this.department = department;
    }

    public Advisors(int number, String firstName, String lastName, int age, String department) {
        super(number, firstName, lastName, age);
        this.department = department;
    }

    @Override
    public void display() {
        System.out.println(getLastName() + ", " + getFirstName() + " | Advisor");
    }

    /*
    @Override
    public void display() {
        System.out.println(getLastName() + ", " + getFirstName() + "(" + getAge() + " years old) | Advisor | Department " + department);
    }
    */
}
