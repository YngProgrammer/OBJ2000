

public class NumbersOfDigitsAndLetters {
    public static void main(String[] args) {
        NumbersOfDigitsAndLetters foo = new NumbersOfDigitsAndLetters();
        
        String input = "I am 25 years old";
        foo.printNumberOfDigitsAndLetters(input);
    }

    public void printNumberOfDigitsAndLetters(String input) {
        int amountDigits = 0, amountLetters = 0;
        for(char c : input.toCharArray()) {
            if(Character.isLetter(c)) {
                amountLetters++;
            } else if(Character.isDigit(c)) {
                amountDigits++;
            }
        }
        System.out.println("The line contains " + amountDigits + " digits and " + amountLetters + " letters!");
    }
}
