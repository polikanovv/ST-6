
package com.mycompany.app;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    @Test
    public void testCheckStateXWin() {
        Game game = new Game();
        char[] board = { 'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' ' };
        game.symbol = 'X';
        assertEquals(State.XWIN, game.checkState(board));
    }

    @Test
    public void testCheckStateOWin() {
        Game game = new Game();
        char[] board = { 'O', 'O', 'O', ' ', ' ', ' ', ' ', ' ', ' ' };
        game.symbol = 'O';
        assertEquals(State.OWIN, game.checkState(board));
    }

    @Test
    public void testCheckStateDraw() {
        Game game = new Game();
        char[] board = { 'X', 'O', 'X', 'X', 'O', 'O', 'O', 'X', 'X' };
        game.symbol = 'X';
        assertEquals(State.DRAW, game.checkState(board));
    }

    @Test
    public void testGenerateMoves() {
        Game game = new Game();
        char[] board = { 'X', ' ', 'O', ' ', ' ', 'O', 'X', ' ', ' ' };
        ArrayList<Integer> moves = new ArrayList<>();
        game.generateMoves(board, moves);
        assertEquals(5, moves.size());
    }

    @Test
    public void testMiniMax() {
        Game game = new Game();
        game.player1.symbol = 'X';
        game.player2.symbol = 'O';
        game.cplayer = game.player1;
        char[] board = { 'X', 'O', 'X', ' ', 'O', ' ', ' ', ' ', ' ' };
        game.board = board;
        int move = game.MiniMax(board, game.player2);
        assertTrue(move >= 1 && move <= 9);
    }
}

