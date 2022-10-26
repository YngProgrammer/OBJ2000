

public class EvenOrOdd {
    public static void main(String[] args) {
        displayForOddOrEven(6);
        displayForOddOrEven(7);
    }

    public static void displayForOddOrEven(int n) {
        if(n % 2 == 0) {
            int i = 0;
            while (i < 5) {
                System.out.print(n + (i+1) * 2);
                if(i < 4) {
                    System.out.print(",");
                }
                i++;
            }
        } else {
            System.out.print(n * 25);
        }
        System.out.println();
    }
}
