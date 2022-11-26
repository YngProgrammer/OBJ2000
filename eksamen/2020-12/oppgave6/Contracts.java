package oppgave6;

public class Contracts extends Docs{
    private String partner;

    public Contracts(
        int number, 
        String title,
        String partner) {
        super(number, title);
        this.partner = partner;
    }
    
    public Contracts(
        int number, 
        String title,
        String subtitle,
        String partner) {
        super(number, title, subtitle);
        this.partner = partner;
    }

    public void printContract() {
        System.out.println("Archive number\t|\t" + getArchiveNumber());
        System.out.println("Title\t|\t" + getTitle());
        System.out.println("Year\t|\t" + getYear());
    }

    public void printFullContract() {
        printContract();
        System.out.println("Subtitle\t|\t" + getSubtitle());
        System.out.println("Partner\t|\t" + partner);
    }
}
