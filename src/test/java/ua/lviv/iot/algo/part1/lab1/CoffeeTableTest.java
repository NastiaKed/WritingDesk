package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeTableTest {
    @Test
    void testAdjustHeight1() {
        CoffeeTable coffeeTable = new CoffeeTable(100, 50, 60, 5, 4);
        coffeeTable.toString();
        coffeeTable.adjustHeight(10);
        assertEquals(10, coffeeTable.getHeight());
    }

    @Test
    public void testMoveDown1() {
        CoffeeTable desk = new CoffeeTable(100, 50, 60, 5, 4);
        desk.moveDown(5);
        assertEquals(5, desk.getHeight());
    }

}