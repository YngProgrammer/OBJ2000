package oppgave2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("K = ");
        int k = s.nextInt();

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += Math.pow(2*i + 1, 2);
        }

        System.out.println(sum);
    }
}
