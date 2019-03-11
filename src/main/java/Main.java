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

//        for(int i=0; i<sudoku.board.length; i++) {
//            for(int j=0; j<sudoku.board.length; j++) {
//                for(int num=1; num<=9; num++) {
//                    sudoku.check(sudoku.board, num, i, j);
//                }
//            }
//        }
        if (!sudoku.check(sudoku.board, 6, 4, 0)) System.out.print("nie da rady cycu :/");
        else System.out.print("da rade na czilku mordo :D");
    }
}
