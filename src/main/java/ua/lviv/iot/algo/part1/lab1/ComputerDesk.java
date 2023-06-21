package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ComputerDesk extends Desk{
    private int numberOfSocket;
    private int numberOfHoles;
    private boolean hasLamp;

    public ComputerDesk(int height, int width, int length, int numberOfSocket, int numberOfHoles, boolean hasLamp) {
        super(height, width, length);
        this.numberOfSocket = numberOfSocket;
        this.numberOfHoles = numberOfHoles;
        this.hasLamp = hasLamp;
    }
    @Override
    public void adjustHeight(int centimeters){ height = centimeters; }
    @Override
    public void moveDown(int centimeters) { height = centimeters; }
    public String toCSV() {
        return super.toCSV() + ", " + numberOfSocket + ", " + numberOfHoles + ", " + hasLamp;
    }
}