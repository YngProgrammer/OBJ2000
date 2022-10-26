

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        int c;

        c = 0;
        assert celsiusToFahrenheit(c) == 32;

        c = 10;
        assert celsiusToFahrenheit(c) == 50;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return 9 * celsius / 5 + 32;
    }
}
