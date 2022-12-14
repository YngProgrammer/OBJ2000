package oppgave6;

public class Professors extends Employees {
    private String course;
    private boolean active;

    public Professors(
        int number,
        String firstName,
        String lastName,
        String course,
        boolean active) {
        super(number, firstName, lastName);
        this.course = course;
        this.active = active;
    }

    public Professors(
        int number,
        String firstName,
        String lastName,
        int age,
        String course,
        boolean active) {
        super(number, firstName, lastName, age);
        this.course = course;
        this.active = active;
    }

    public String getCourse() {
        return this.course;
    }

    public boolean isActive() {
        return this.active;
    }

    @Override
    public void print() {
        super.print();

        System.out.println("Employee number: " + getEmployeeNumber());

        System.out.println("Course: " + course);
        System.out.println("Active? " + active);
    }
}
