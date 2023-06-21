package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BilliardTable extends Desk {
    private int numberOfPlayers;
    private int numberOfBalls;

    public BilliardTable(int height, int width, int length, int numberOfPlayers, int numberOfBalls ) {
        super(height, width, length);
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfBalls = numberOfBalls;
    }
    @Override
    public void adjustHeight(int centimeters){ height += centimeters; }

    @Override
    public void moveDown(int centimeters) { height -= centimeters; }
}