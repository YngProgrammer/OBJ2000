

public class ChessBoard {
    public static void main(String[] args) {
        displayChessBoard();
    }

    public static void displayChessBoard() {
        int length = 8;
        char[] letters = {
            'A',
            'B',
            'C',
            'D',
            'E',
            'F',
            'G',
            'H'
        };
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < letters.length; j++) {
                System.out.print("" + letters[j] + (i+1));
                if(j < letters.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
