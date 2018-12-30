package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import production.Board;

public class BoardTest {
    Board board;

    @Before
    public void setup(){
        board = new Board();
    }

    @Test
    public void testInitialization(){
        Assert.assertTrue(board.getBoard().length == 10 && board.getBoard()[0].length==10);
    }

    @Test
    public void testGetToken(){
        Assert.assertTrue(board.getToken()=='t');
    }

    @Test
    public void testSetToken(){
        board.setToken('s');
        Assert.assertTrue(board.getToken()=='s');
    }

}
