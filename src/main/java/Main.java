import static java.lang.StrictMath.sqrt;

public class Main {
    public static void main(String[] args) {
        SudokuBoard sudoku = new SudokuBoard();
        sudoku.prefill();
        sudoku.display();

        //public void fillBoard(int arr[][], int row, int column) {
        for(int i=0; i<sqrt(sudoku.board.length); i++) {
            for(int j=0; j<sqrt(sudoku.board.length); j++) {
                i = 7;
                i = i/3;
            }
        }
    }
}
