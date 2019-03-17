package ex1;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;


public class SudokuBoardTest {



    SudokuBoardTest() {

    }

    @org.junit.jupiter.api.Test
    void testIfFillBoardGeneratesCorrectDigitsLayout() {

    }

    @org.junit.jupiter.api.Test
    void testIfTwoSubsequentCallOfFillBoardGeneratesDifferentDigitsLayout() {
        SudokuBoard sudoku = new SudokuBoard();
        sudoku.fillSudoku();
        int[][] board1 = sudoku.getBoard();
        sudoku.fillSudoku();
        int[][] board2 = sudoku.getBoard();

        StringBuilder boardstring1 = new StringBuilder();
        StringBuilder boardstring2 = new StringBuilder();

        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                boardstring1.append(board1[x][y]);
                boardstring2.append(board2[x][y]);
            }
        }
        assertEquals(boardstring1.toString(), boardstring2.toString());

    }


    /*
    * fillBoard generates correct digits layout (check all rows, columns and boxes)
two subsequent calls of fillBoard generates different digits layout on the board
*/
}
