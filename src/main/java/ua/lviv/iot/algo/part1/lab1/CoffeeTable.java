package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CoffeeTable extends Desk {
    private int numberOfShelves;
    private int maxNumberOfGuests;

    public CoffeeTable(int height, int width, int length, int numberOfShelves, int maxNumberOfGuests) {
        super(height, width, length);
        this.maxNumberOfGuests = maxNumberOfGuests;
        this.numberOfShelves = numberOfShelves;
    }
    @Override
    public void adjustHeight(int centimeters){ height = centimeters; }
    @Override
    public void moveDown(int centimeters) { height = centimeters; }
    public String toCSV() {
        return super.toCSV() + ", " + maxNumberOfGuests + ", " + numberOfShelves;
    }
}