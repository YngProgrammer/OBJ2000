package oppgave6;

public class Reports extends Docs {
    private int department;
    private boolean confidential;

    public Reports(
        int number, 
        String title,
        int department, 
        boolean confidential) {
        super(number, title);
        this.department = department;
        this.confidential = confidential;
    }
    
    public Reports(
        int number, 
        String title,
        String subtitle,
        int department, 
        boolean confidential) {
        super(number, title, subtitle);
        this.department = department;
        this.confidential = confidential;
    }

    public int getDepartment() {
        return this.department;
    }

    public boolean isConfidential() {
        return this.confidential;
    }
}
