
package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TicTacToeCellTest {
    @Test
    public void testInitialMarker() {
        TicTacToeCell cell = new TicTacToeCell(0, 0, 0);
        assertEquals(' ', cell.getMarker());
        assertEquals(" ", cell.getText());
    }

    @Test
    public void testSetMarker() {
        TicTacToeCell cell = new TicTacToeCell(1, 1, 0);
        cell.setMarker("X");
        assertEquals('X', cell.getMarker());
        assertEquals("X", cell.getText());
        assertFalse(cell.isEnabled());
    }

    @Test
    public void testCoordinates() {
        TicTacToeCell cell = new TicTacToeCell(2, 2, 1);
        assertEquals(2, cell.getNum());
        assertEquals(2, cell.getCol());
        assertEquals(1, cell.getRow());
    }
}

