public class SudokuBoard {
    private int[][] board;

    public void prefill(){
        //puts values to make actual sudoku
        board = new int[][] {   {0, 0, 0,   0, 0, 0,    0, 8, 0},
                                {0, 0, 0,   3, 8, 6,    5, 0, 2},
                                {0, 0, 0,   0, 0, 1,    3, 0, 0},

                                {0, 4, 0,   0, 9, 5,    2, 0, 3},
                                {0, 0, 0,   4, 0, 0,    0, 0, 5},
                                {3, 1, 0,   0, 0, 2,    6, 4, 0},

                                {0, 2, 1,   0, 0, 0,    4, 0, 6},
                                {0, 8, 0,   0, 0, 0,    0, 0, 0},
                                {0, 0, 3,   0, 0, 0,    1, 0, 0}};
    }

    public void fillSudoku(){
        //method to solve sudoku
    }

    public void validate(){

    }

    public void display(){
        for (int x = 0; x < 9; x++){
            for (int y = 0; y < 9; y++){
                System.out.print(board[x][y] + " ");
                if (y % 3 == 2 && y != 8 ) System.out.print("| ");
            }
            System.out.println();
            if (x % 3 == 2 && x != 8 ) System.out.println("- - - - - - - - - - -");
        }

    }
}
