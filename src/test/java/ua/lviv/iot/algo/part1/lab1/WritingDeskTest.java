package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WritingDeskTest {
    @Test
    void testAdjustHeight() {
        WritingDesk writingDesk = new WritingDesk(100, 50, 60, 2, true, 180, 120);
        writingDesk.toString();
        writingDesk.adjustHeight(10);
        assertEquals(110, writingDesk.getHeight());
    }

    @Test
    void testAdjustHeightIfHeightIsBiggerThanMaxHeight() {
        WritingDesk writingDesk = new WritingDesk(100, 50, 60, 2, true, 180, 120);
        writingDesk.adjustHeight(30);
        assertEquals(120, writingDesk.getHeight());
    }


    @Test
    public void testMoveDown() {
        WritingDesk desk = new WritingDesk(100, 50, 60, 2, true, 180, 120);

        desk.moveDown(5);
        assertEquals(95, desk.getHeight());

    }

}