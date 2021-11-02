package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;
/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Arie van Deursen
 */
public class BoardTest {
    /**
     * Do we get the correct delta when moving north?
     */
    @Test
    void testboard() {
        Square[][] oneoneBoard = {
            { mock(BasicSquare.class) },
            { mock(BasicSquare.class) }
        };
        Board board = new Board(oneoneBoard);
        assertThat(board.invariant()).isEqualTo(true);
    }

//    @Test
//    void squareAt() {
//        Square[][] oneoneBoard = {
//            { null },
//            { mock(BasicSquare.class) }
//        };
//        Board board = new Board(oneoneBoard);
//        assertThat(board.invariant()).isEqualTo(true);
//    }

}
