package oppgave6;

public class Advisors extends Employees {
    public String department;

    public void printAdvisor() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
    }

    public void printFullAdvisor() {
        printAdvisor();

        System.out.println("Employee number: " + getEmployeeNumber());
        System.out.println("Age: " + getAge());

        System.out.println("Department: " + department);
    }
}
