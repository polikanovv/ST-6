
package com.mycompany.app;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TicTacToePanelTest {
    @Test
    public void testActionPerformed() {
        TicTacToePanel panel = new TicTacToePanel(new GridLayout(3, 3));
        TicTacToeCell cell = getCell(panel, 0);
        cell.doClick();
        assertNotEquals(" ", cell.getText());
    }

    private TicTacToeCell getCell(TicTacToePanel panel, int index) {
        try {
            java.lang.reflect.Field field = TicTacToePanel.class.getDeclaredField("cells");
            field.setAccessible(true);
            TicTacToeCell[] cells = (TicTacToeCell[]) field.get(panel);
            return cells[index];
        } catch(Exception e) {
            fail(e.getMessage());
        }
        return null;
    }
}

