package last;

public class Test {
    public static void main(String[] args) {
        Employee p = new Professors(
            1,
            "Magnus",
            "Carlsen",
            32,
            "CHESS3000",
            true
        );
        p.display();

        Employee a = new Advisors(
            2,
            "Emil",
            "Jacobsen",
            28,
            "Tull"
        );
        a.display();
    }
}
