import static java.lang.StrictMath.sqrt;

public class SudokuBoard {
    public int[][] board;

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

    public boolean check(int arr[][], int num, int row, int column) {
        for(int i=0; i<arr.length; i++) {
            if((arr[row][i] == num && i != column) || (arr[i][column] == num && i != row)) return false;
        }
        int newRow = (row/3)*3;
        int newColumn = (column/3)*3;

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if((arr[newRow + i][newColumn + j] == num) && newRow+i != row && newColumn+j != column) return false;
            }
        }
        return true;
    }
}
