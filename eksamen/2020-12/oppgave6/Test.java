package oppgave6;

public class Test {
    public static void main(String[] args) {
        Reports r = new Reports(
            58,
            "Secret OBJ2000 Exam Report",
            4,
            true
        );

        System.out.println("--- Reports ---");
        r.print();

        Contracts c = new Contracts(
            206,
            "Revolutionary Partnership Deal",
            "Ola Nordmann"
        );

        System.out.println("--- Contracts ---");
        c.printContract();
        
        System.out.println("--- Contracts (more detailed) ---");
        c.printFullContract();
    }
}
