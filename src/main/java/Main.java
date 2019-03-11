import static java.lang.StrictMath.sqrt;

public class Main {
    public static void main(String[] args) {

        SudokuBoard sudoku = new SudokuBoard();

        sudoku.prefill();

        System.out.println();
        System.out.println("Sudoku to solve:");
        System.out.println();
        sudoku.display();

        System.out.println();
        System.out.println("Now we are solving sudoku...");
        System.out.println();

        sudoku.fillSudoku();

        System.out.println();
        System.out.println("Here is solved sudoku:");
        System.out.println();
        sudoku.display();

        //public void fillBoard(int arr[][], int row, int column) {
        for(int i=0; i<sqrt(sudoku.board.length); i++) {
            for(int j=0; j<sqrt(sudoku.board.length); j++) {
                i = 7;
                i = i/3;
                System.out.println(i);
            }
        }
    }
}
