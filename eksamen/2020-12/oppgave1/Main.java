package oppgave1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numRight, totalQuestions;

        System.out.print("How many questions in total : ");
        totalQuestions = s.nextInt();

        System.out.print("How many right answers : ");
        numRight = s.nextInt();

        double percentageRight = (double) 100 * numRight / totalQuestions;
        
        // See https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Format-double-Java-printf-example
        System.out.printf("%,.1f%%\n", percentageRight);
    }
}
