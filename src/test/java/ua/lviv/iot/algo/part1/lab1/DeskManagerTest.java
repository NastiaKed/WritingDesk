package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DeskManagerTest {

        @Test
        void testFindAllWithHeightGreaterThan() {
            DeskManager deskManager = new DeskManager();
            deskManager.addDesk(new WritingDesk(100, 50, 60, 2, true, 180, 120));
            deskManager.addDesk(new CoffeeTable(100, 50, 60, 5, 4));
            deskManager.addDesk(new BilliardTable(180, 60, 120, 3, 16));
            deskManager.addDesk(new BilliardTable(80, 70, 160, 5, 16));
            deskManager.addDesk(new ComputerDesk(120, 80, 100, 3, 8, true));
            deskManager.addDesk(new ComputerDesk(115, 90, 140, 6, 12, false));

            List<Desk> desk = deskManager.findAllWithHeightGreaterThan(105);

            assertEquals(3, desk.size());
            assertTrue(desk.stream().allMatch(desk1 -> desk1.getHeight() > 105));

        }
        @Test
        void testFindAllWithAreaGreaterThan() {
            DeskManager deskManager = new DeskManager();
            deskManager.addDesk(new WritingDesk(100, 50, 60, 2, true, 180, 120));
            deskManager.addDesk(new CoffeeTable(100, 50, 60, 5, 4));
            deskManager.addDesk(new BilliardTable(180, 60, 120, 3, 16));
            deskManager.addDesk(new BilliardTable(80, 70, 160, 5, 16));
            deskManager.addDesk(new ComputerDesk(120, 80, 100, 3, 8, true));
            deskManager.addDesk(new ComputerDesk(115, 90, 140, 6, 12, false));

            List<Desk> deskAreaGreaterThen5000 = deskManager.findAllWithAreaGreaterThan(5000);

            assertEquals(4, deskAreaGreaterThen5000.size());
                assertTrue(deskAreaGreaterThen5000.stream().allMatch(desk -> desk.getLength() * desk.getWidth()  > 5000));
        }
}