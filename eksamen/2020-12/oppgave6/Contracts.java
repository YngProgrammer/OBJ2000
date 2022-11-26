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
}
