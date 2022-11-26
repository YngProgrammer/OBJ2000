package oppgave6;

public class Employees {
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private int age;

    public Employees(int number, String firstName, String lastName) {
        this.employeeNumber = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employees(
        int number,
        String firstName,
        String lastName,
        int age) {
        this.employeeNumber = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(int number) {
        this.employeeNumber = number;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
    }
}
