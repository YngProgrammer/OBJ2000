package oppgave4;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Celsius: ");
        celsius = s.nextDouble();

        fahrenheit = 9 * celsius / 5 + 32;
        System.out.printf("%,.1f °C ≈ %,.1f °F\n", celsius, fahrenheit);
    }
}
