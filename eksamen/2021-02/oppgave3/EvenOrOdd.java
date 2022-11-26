package oppgave3;

public class EvenOrOdd {
    public static void main(String[] args) {
        displayForOddOrEven(6);
        displayForOddOrEven(7);
    }

    public static void displayForOddOrEven(int n) {
        if(n % 2 == 0) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(n + i * 2);
                if(i < 5) {
                    System.out.print(",");
                }
            }
        } else {
            System.out.print(n * 25);
        }
        System.out.println();
    }
}
