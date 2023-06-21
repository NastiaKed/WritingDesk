package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BilliardTableTest {
    @Test
    void testAdjustHeight1() {
        BilliardTable billiardTable = new BilliardTable(180, 60, 120, 3, 16);
        billiardTable.toString();
        billiardTable.adjustHeight(10);
        assertEquals(190, billiardTable.getHeight());
    }

    @Test
    public void testMoveDown1() {
        BilliardTable desk = new BilliardTable(180, 60, 120, 3, 16);
        desk.moveDown(5);
        assertEquals(175, desk.getHeight());
    }

    @Test
    void testAdjustHeight2() {
        BilliardTable billiardTable = new BilliardTable(80, 70, 160, 5, 16);
        billiardTable.toString();
        billiardTable.adjustHeight(10);
        assertEquals(90, billiardTable.getHeight());
    }

    @Test
    public void testMoveDown2() {
        BilliardTable desk = new BilliardTable(80, 70, 160, 5, 16);
        desk.moveDown(5);
        assertEquals(75, desk.getHeight());
    }

}