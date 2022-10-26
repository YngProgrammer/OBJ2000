package last;

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

    public Employees(int number, String firstName, String lastName, int age) {
        this.employeeNumber = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void display() {
        System.out.println(lastName + ", " + firstName + " (" + age + " years old)");
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
    
    public void setEmployeeNumber(int pEmployeeNumber) {
        employeeNumber = pEmployeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String pFirstName) {
        firstName = pFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String pLastName) {
        lastName = pLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int pAge) {
        age = pAge;
    }
}
