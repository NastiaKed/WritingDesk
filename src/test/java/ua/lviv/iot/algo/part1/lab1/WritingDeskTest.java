package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class WritingDeskTest {
    private WritingDesk writingDesk;
    @BeforeEach
    void setUp() {
        this.writingDesk = new WritingDesk(100, 50, 60, 2, true, 180, 120);
    }
    @Test
    void testAdjustHeight() {
        this.writingDesk.adjustHeight(10);
        assertEquals(110, this.writingDesk.getHeight());
        assertNotEquals(120, this.writingDesk.getHeight());
    }

    @Test
    void testAdjustHeightIfHeightIsBiggerThanMaxHeight() {
        this.writingDesk.adjustHeight(30);
        assertEquals(120, this.writingDesk.getHeight());
        assertNotEquals(130, this.writingDesk.getHeight());
    }

    @Test
    public void testMoveDown() {
        this.writingDesk.moveDown(5);
        assertEquals(95, this.writingDesk.getHeight());
        assertNotEquals(130, this.writingDesk.getHeight());
    }
    @Test
    void getHeadersTest(){
        String expectedString = "height, width, length, numberOfDrawers, hasKeyboardTray, maxWeightCapacity, maxHeight";
        assertEquals(expectedString,writingDesk.getHeaders());
    }

    @Test
    void toCSVTest(){
        String expectedString = "100, 50, 60, 2, true, 180, 120";
        assertEquals(expectedString, writingDesk.toCSV());
    }
}