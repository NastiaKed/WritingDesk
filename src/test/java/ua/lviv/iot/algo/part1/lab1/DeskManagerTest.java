package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeskManagerTest {

    DeskManager plateManager = DeskManager.create();
    DeskWriter plateWriter = new DeskWriter();
    BilliardTable billiardTable1 = new BilliardTable(80, 70, 160, 5, 16);
    ComputerDesk computerDesk1 = new ComputerDesk(115, 90, 140, 6, 12, false);
    private DeskManager deskManager;

    @BeforeEach
    void setUp() {
        this.deskManager = new DeskManager();
        this.deskManager.addDesk(new WritingDesk(100, 50, 60, 2, true, 180, 120));
        this.deskManager.addDesk(new CoffeeTable(100, 50, 60, 5, 4));
        this.deskManager.addDesk(new BilliardTable(180, 60, 120, 3, 16));
        this.deskManager.addDesk(new BilliardTable(80, 70, 160, 5, 16));
        this.deskManager.addDesk(new ComputerDesk(120, 80, 100, 3, 8, true));
        this.deskManager.addDesk(new ComputerDesk(115, 90, 140, 6, 12, false));
    }

    @Test
    void testFindAllWithHeightGreaterThan() {
        List<Desk> desk = deskManager.findAllWithHeightGreaterThan(105);
        assertEquals(3, desk.size());
        assertNotEquals(5, desk.size());
        assertTrue(desk.stream().allMatch(desk1 -> desk1.getHeight() > 105));
        assertFalse(desk.stream().allMatch(desk1 -> desk1.getHeight() < 105));

    }

    @Test
    void testFindAllWithAreaGreaterThan() {
        List<Desk> deskAreaGreaterThen5000 = deskManager.findAllWithAreaGreaterThan(5000);
        assertEquals(4, deskAreaGreaterThen5000.size());
        assertNotEquals(5, deskAreaGreaterThen5000.size());
        assertTrue(deskAreaGreaterThen5000.stream().allMatch(desk -> desk.getLength() * desk.getWidth() > 5000));
        assertFalse(deskAreaGreaterThen5000.stream().allMatch(desk -> desk.getLength() * desk.getWidth() < 5000));
    }

    @Test
    void checkObjectsTest() throws IOException {
        List<Desk> finalList = new ArrayList<>();
        finalList.add(billiardTable1);
        finalList.add(computerDesk1);
        plateWriter.writeToFile(finalList);
        List<String> finalLines = Files.readAllLines(Paths.get("Desk3.csv"));
        List<String> expectedLines = Files.readAllLines(Paths.get("Desk3.csv"));
        assertEquals(expectedLines, finalLines);
    }
}