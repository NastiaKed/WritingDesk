package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class DeskManager {
    private final List<Desk> desks = new LinkedList<>();

    public void addDesk(final Desk desk) {
        desks.add(desk);
    }

    public List<Desk> findAllWithHeightGreaterThan(int centimeters) {
        return desks.stream().filter(desk -> desk.getHeight() > centimeters).
                collect(Collectors.toList());
    }

    public List<Desk> findAllWithAreaGreaterThan(int squareCentimeters) {
        return desks.stream().filter(desk -> desk.getLength() * desk.getWidth() > squareCentimeters).
                collect(Collectors.toList());
    }
}