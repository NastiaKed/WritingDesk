package src.ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;


public class DeskManager {
    public static void main(String[] args) {
        List<Desk> desks = new ArrayList<>();

        WritingDesk writingDesk = WritingDesk.builder()
                .height(100)
                .width(50)
                .length(60)
                .maxHeight(120)
                .hasKeyboardTray(true)
                .numberOfDrawers(2)
                .maxWeightCapacity(180)
                .build();
        CoffeeTable coffeeTable = CoffeeTable.builder()
                .height(100)
                .width(50)
                .length(60)
                .maxNumberOfGuests(4)
                .numberOfShelves(5)
                .build();

        desks.add(writingDesk);
        desks.add(coffeeTable);

        writingDesk.moveDown(20);
        writingDesk.adjustHeight(5);

        for (Desk desk : desks) {
            System.out.println(desk);
        }
    }

}