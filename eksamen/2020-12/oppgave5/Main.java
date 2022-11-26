package oppgave5;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        String result;

        result = m.specialConcatenate("Hello", "There");
        System.out.println(result);

        result = m.specialConcatenate("java", "code");
        System.out.println(result);

        result = m.specialConcatenate("shotl", "java");
        System.out.println(result);
    }

    public String specialConcatenate(String str1, String str2) {
        String first = str1.substring(1, str1.length());
        String second = str2.substring(1, str2.length());
        return first + second;
    }
}
