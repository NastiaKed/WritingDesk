package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BilliardTableTest {
    private BilliardTable billiardTable;

    @BeforeEach
    void setUp() {
        this.billiardTable = new BilliardTable(80, 70, 160, 5, 16);
    }

    @Test
    void testAdjustHeight2() {
        this.billiardTable.adjustHeight(10);
        assertEquals(10, this.billiardTable.getHeight());
        assertNotEquals(20, this.billiardTable.getHeight());
    }

    @Test
    public void testMoveDown2() {
        this.billiardTable.moveDown(5);
        assertEquals(5, this.billiardTable.getHeight());
        assertNotEquals(20, this.billiardTable.getHeight());
    }
    @Test
    void getHeadersTest(){
        String expectedString = "height, width, length, numberOfPlayers, numberOfBalls";
        assertEquals(expectedString,billiardTable.getHeaders());
    }

    @Test
    void toCSVTest(){
        String expectedString = "80, 70, 160, 5, 16";
        assertEquals(expectedString, billiardTable.toCSV());
    }

}