package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class CoffeeTableTest {
    private CoffeeTable coffeeTable;

    @BeforeEach
    void setUp() {
        this.coffeeTable = new CoffeeTable(100, 50, 60, 5, 4);
    }

    @Test
    void testAdjustHeight1() {
        this.coffeeTable.adjustHeight(10);
        assertEquals(10, this.coffeeTable.getHeight());
        assertNotEquals(20, this.coffeeTable.getHeight());
    }

    @Test
    public void testMoveDown1() {
        this.coffeeTable.moveDown(5);
        assertEquals(5, this.coffeeTable.getHeight());
        assertNotEquals(20, this.coffeeTable.getHeight());
    }
    @Test
    void getHeadersTest(){
        String expectedString = "height, width, length, numberOfShelves, maxNumberOfGuests";
        assertEquals(expectedString,coffeeTable.getHeaders());
    }

    @Test
    void toCSVTest(){
        String expectedString = "100, 50, 60, 5, 4";
        assertEquals(expectedString, coffeeTable.toCSV());
    }
}