package oppgave3;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int result;

        result = m.firstMultiple(2, 8);
        System.out.println(result);

        result = m.firstMultiple(3, 5);
        System.out.println(result);

        result = m.firstMultiple(6, 4);
        System.out.println(result);
    }

    public int firstMultiple(int a, int b) {
        int i = 1;
        while (a * i <= b) {
            i++;
        }
        return a * i;
    }
}
