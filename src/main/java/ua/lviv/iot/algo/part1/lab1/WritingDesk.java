package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WritingDesk extends Desk {

    private int numberOfDrawers;
    private boolean hasKeyboardTray;
    private int maxWeightCapacity;
    private int maxHeight;

    public WritingDesk(int height, int width, int length, int numberOfDrawers, boolean hasKeyboardTray, int maxWeightCapacity, int maxHeight) {
        super(height, width, length);
        this.numberOfDrawers = numberOfDrawers;
        this.hasKeyboardTray = hasKeyboardTray;
        this.maxWeightCapacity = maxWeightCapacity;
        this.maxHeight = maxHeight;
    }
    @Override
    public void adjustHeight(int centimeters) {
        height += centimeters;

        if (height > maxHeight) {
            height = maxHeight;
        }
    }

    @Override
    public void moveDown(int centimeters) {
        int newHeight = height - centimeters;
        if (newHeight >= 0) {
            height = newHeight;
        }
    }
    public String toCSV() {
        return super.toCSV() + ", " + numberOfDrawers + ", " + hasKeyboardTray + ", " + maxWeightCapacity + ", " + maxHeight;
    }
}
