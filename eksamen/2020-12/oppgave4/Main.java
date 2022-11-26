package oppgave4;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int result;

        result = m.gcd(8, 12, 16);
        System.out.println(result);

        result = m.gcd(11, 17, 10);
        System.out.println(result);

        // Note: value for b should be 24 in e.g. 3
        result = m.gcd(54, 24, 12);
        System.out.println(result);

        result = m.gcd(5, 10, 20);
        System.out.println(result);
    }

    public int gcd(int a, int b, int c) {
        // We select the lowest value among all 3,
        // since in the best case scenario, it will
        // be the biggest value that can divide all 3
        int d = Math.min(a, Math.min(b, c));

        boolean allDivisibleByD = (a % d == 0 && b % d == 0 && c % d == 0);
        
        // Decrement the value of d by 1 until it
        // can divide all 3 numbers, OR it reaches 1
        while (d > 1 && !allDivisibleByD) {
            d--;
            allDivisibleByD = (a % d == 0 && b % d == 0 && c % d == 0);
        }

        return d;
    }
}
