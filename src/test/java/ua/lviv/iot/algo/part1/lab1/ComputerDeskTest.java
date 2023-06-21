package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputerDeskTest {
    private ComputerDesk computerDesk;
    @BeforeEach
    void setUp() {
        this.computerDesk = new ComputerDesk(120, 80, 100, 3, 8, true);
    }
    @Test
    void testAdjustHeight1() {
        this.computerDesk.adjustHeight(10);
        assertEquals(10, this.computerDesk.getHeight());
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
        computerDesk.adjustHeight(10);
        assertEquals(10, computerDesk.getHeight());
    }

    @Test
    public void testMoveDown2() {
        ComputerDesk desk = new ComputerDesk(115, 90, 140, 6, 12, false);
        desk.moveDown(5);
        assertEquals(5, desk.getHeight());
    }
    @Test
    void getHeadersTest(){
        String expectedString = "height, width, length, numberOfSocket, numberOfHoles, hasLamp";
        assertEquals(expectedString, computerDesk.getHeaders());
    }

    @Test
    void toCSVTest(){
        String expectedString = "120, 80, 100, 3, 8, true";
        assertEquals(expectedString, computerDesk.toCSV());
    }

}