package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

/**
 * Board class test, simple one to test the class.
 */
public class BoardTest {

    /**
     * Is the board valid?
     */
    @Test
    void testValid() {
        Square[][] grid = {
            { mock(BasicSquare.class) },
            { mock(BasicSquare.class) }
        };
        Board board = new Board(grid);
        assertThat(board.invariant()).isEqualTo(true);
    }

    /**
     * Is the squareat?
     */
    @Test
    void testSquareAtNull() {
        Square[][] grid = {
            { mock(BasicSquare.class) },
            { null }
        };
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
        assertThat(board.squareAt(1, 0)).isNotEqualTo(grid[0][0]);
        assertThat(board.squareAt(0, 0)).isNotEqualTo(grid[1][0]);

    }
    /**
     * Is the squareat?
     */
    @Test
    void testSquareAt() {
        Square[][] grid = {
            { mock(BasicSquare.class) },
            { mock(BasicSquare.class) }
        };
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
        assertThat(board.squareAt(1, 0)).isNotEqualTo(grid[0][0]);
        assertThat(board.squareAt(0, 0)).isNotEqualTo(grid[1][0]);

    }


        @Test
        void test() {


            assertThrows(AssertionError.class, () -> {
                new Board(null);
            });

        }

    /**
     * Is square within the border?
     */
    @Test
    void testWithinBorders() {
        Square[][] grid = {
            { mock(BasicSquare.class) },
            { mock(BasicSquare.class) }
        };
        Board board = new Board(grid);
        // boundary getWidth() = 2 (x), getHeight() = 1 (y)
        assertThat(board.withinBorders(0, 0)).isTrue(); // x in range, y in range
        assertThat(board.withinBorders(15, 15)).isFalse(); // x > getWidth(), y > getHeight()
        assertThat(board.withinBorders(-1, -1)).isFalse(); // x < 0, y < 0
        assertThat(board.withinBorders(-1, 1)).isFalse(); // x < 0, y in range
        assertThat(board.withinBorders(0, -1)).isFalse(); // x in range, y < 0
        assertThat(board.withinBorders(0, 15)).isFalse(); // x in range, y > getHeight()
    }

    /**
     * Is square width of the board correct?
     */
    @Test
    void testGetWidth() {
        Square[][] grid = {
            { mock(BasicSquare.class) },
            { mock(BasicSquare.class) }
        };
        Board board = new Board(grid);
        assertThat(board.getWidth()).isEqualTo(2);
        assertThat(board.getWidth()).isNotEqualTo(0);
    }

    /**
     * Is square width of the board correct?
     */
    @Test
    void testGetHeight() {
        Square[][] grid = {
            { mock(BasicSquare.class) },
            { mock(BasicSquare.class) }
        };
        Board board = new Board(grid);
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getHeight()).isNotEqualTo(0);
    }



}
