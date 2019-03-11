import static java.lang.StrictMath.sqrt;

public class SudokuBoard {
    private static int[][] board = new int[9][9];

    public static void main(String args[]) {
    //public void fillBoard(int arr[][], int row, int column) {
        for(int i=0; i<sqrt(board.length); i++) {
            for(int j=0; j<sqrt(board.length); j++) {
                i = 7;
                i = i/3;
            }
        }
    }
}
