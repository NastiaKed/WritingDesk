package src.ua.lviv.iot.algo.part1.lab1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CoffeeTable extends Desk {
    private int numberOfShelves;
    private int maxNumberOfGuests;

    @Builder
    public CoffeeTable(int height, int width, int length, int numberOfShelves, int maxNumberOfGuests) {
        super(height, width, length);
        this.maxNumberOfGuests = maxNumberOfGuests;
        this.numberOfShelves = numberOfShelves;
    }

}
