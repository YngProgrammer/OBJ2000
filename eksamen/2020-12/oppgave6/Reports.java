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

    @Override
    public void print() {
        super.print();
        
        // Data fields that were not printed in the parent's print() method
        System.out.println("Archive number\t|\t" + getArchiveNumber());
        System.out.println("Year\t|\t" + getYear());

        // Additional data fields that are specific to this subclass
        System.out.println("FBI Department Number\t|\t" + department);
        System.out.println("Confidential?\t|\t" + confidential);
    }
}
