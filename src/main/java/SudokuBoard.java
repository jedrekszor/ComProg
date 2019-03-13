import static java.lang.StrictMath.sqrt;

public class SudokuBoard {
    public int[][] board;

    public void prefill() {
        //puts values to make actual sudoku
        board = new int[][]{
                {2, 9, 0, 0, 0, 0, 0, 8, 0},
                {0, 0, 0, 3, 8, 6, 5, 0, 2},
                {0, 0, 0, 0, 0, 1, 3, 0, 0},

                {0, 4, 0, 0, 9, 5, 2, 0, 3},
                {0, 0, 0, 4, 0, 0, 0, 0, 5},
                {3, 1, 0, 0, 0, 2, 6, 4, 0},

                {0, 2, 1, 0, 0, 0, 4, 0, 6},
                {0, 8, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 0, 1, 0, 0}};
    }

    public boolean areThereZeros() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if (board[x][y] == 0) return true;
            }
        }
        return false;
    }

    public boolean fillSudoku() {
        if (!areThereZeros()) return true;

        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {



                for (int i = 1; i < 10; i++) {
                    if (check(i, x, y)) {
                        board[x][y] = i;
                        return fillSudoku();
                    }
                }

                board[x][y] = 0;

                if (y == 0) board[x-1][8]++;
                else board[x][y-1]++;

                return fillSudoku();





            }
        }

        return false;
    }


    public void display() {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                System.out.print(board[x][y] + " ");
                if (y % 3 == 2 && y != 8) System.out.print("| ");
            }
            System.out.println();
            if (x % 3 == 2 && x != 8) System.out.println("- - - - - - - - - - -");
        }
    }

    public boolean check(int num, int row, int column) {
        if (num == 0) return false;
        for (int i = 0; i < board.length; i++) {
            if ((board[row][i] == num && i != column) || (board[i][column] == num && i != row)) return false;
        }
        int newRow = (row / 3) * 3;
        int newColumn = (column / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((board[newRow + i][newColumn + j] == num) && newRow + i != row && newColumn + j != column)
                    return false;
            }
        }
        return true;
    }
}
