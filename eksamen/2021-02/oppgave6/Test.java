package oppgave6;

public class Test {
    public static void main(String[] args) {
        Advisors a = new Advisors(
            27,
            "Ola",
            "Nordmann",
            56,
            "ABC2000",
            "Abcdelogy"
        );

        System.out.println("--- Advisors ---");
        a.printAdvisor();
        
        System.out.println("--- Advisors (more detailed) ---");
        a.printFullAdvisor();

        Professors p = new Professors(
            506,
            "Magnus",
            "Magnussen",
            34,
            "CHS3000",
            true
        );

        System.out.println("--- Professors ---");
        p.print();
    }
}
