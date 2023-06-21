package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputerDeskTest {
    @Test
    void testAdjustHeight1() {
        ComputerDesk computerDesk = new ComputerDesk(120, 80, 100, 3, 8, true);
        computerDesk.toString();
        computerDesk.adjustHeight(10);
        assertEquals(10, computerDesk.getHeight());
    }

    @Test
    public void testMoveDown1() {
        ComputerDesk desk = new ComputerDesk(120, 80, 100, 3, 8, true);
        desk.moveDown(5);
        assertEquals(5, desk.getHeight());
    }

    @Test
    void testAdjustHeight2() {
        ComputerDesk computerDesk = new ComputerDesk(115, 90, 140, 6, 12, false);
        computerDesk.toString();
        computerDesk.adjustHeight(10);
        assertEquals(10, computerDesk.getHeight());
    }

    @Test
    public void testMoveDown2() {
        ComputerDesk desk = new ComputerDesk(115, 90, 140, 6, 12, false);
        desk.moveDown(5);
        assertEquals(5, desk.getHeight());
    }

}