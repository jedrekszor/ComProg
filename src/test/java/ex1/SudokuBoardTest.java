package ex1;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;


public class SudokuBoardTest {



    SudokuBoardTest() {

    }

    @org.junit.jupiter.api.Test
    void testIfFillBoardGeneratesCorrectDigitsLayout() {
        SudokuBoard sudoku = new SudokuBoard();

        sudoku.fillSudoku();

        boolean test = false;

        for(int x = 0; x < sudoku.getBoard().length; x++)
        {
            for(int y = 0; y < sudoku.getBoard().length; y++)
            {
                for (int i = 0; i < sudoku.getBoard().length; i++) {
                    if ((sudoku.getBoard()[x][i] == sudoku.getBoard()[x][y] && i != y) || (sudoku.getBoard()[i][y] == sudoku.getBoard()[x][y] && i != x)) test = false;
                }
                int newRow = (x / 3) * 3;
                int newColumn = (y / 3) * 3;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if ((sudoku.getBoard()[newRow + i][newColumn + j] == sudoku.getBoard()[x][y]) && newRow + i != x && newColumn + j != y)
                            test =  false;
                    }
                }
                test =  true;
            }
        }
        assertTrue(test);
    }

    @org.junit.jupiter.api.Test
    void testIfTwoSubsequentCallOfFillBoardGeneratesDifferentDigitsLayout() {
        SudokuBoard sudoku = new SudokuBoard();
    }


    /*
    * fillBoard generates correct digits layout (check all rows, columns and boxes)
two subsequent calls of fillBoard generates different digits layout on the board
*/
}
