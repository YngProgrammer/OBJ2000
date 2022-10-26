package last;

public class Professors extends Employees {
    private String course;
    private boolean active;

    public Professors(int number, String firstName, String lastName, String course, boolean active) {
        super(number, firstName, lastName);
        this.course = course;
        this.active = active;
    }

    public Professors(int number, String firstName, String lastName, int age, String course, boolean active) {
        super(number, firstName, lastName, age);
        this.course = course;
        this.active = active;
    }

    @Override
    public void display() {
        String msgActive = (active) ? "active" : "inactive";
        System.out.println(getLastName() + ", " + getFirstName() + "(" + getAge() + " years old) | Professor | Course " + course + " (" + msgActive + ")");
    }

    public String getCourse() {
        return course;
    }

    public boolean active() {
        return active;
    }
}
