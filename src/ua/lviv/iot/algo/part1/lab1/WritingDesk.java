package src.ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString
public class WritingDesk extends Desk {

    private int numberOfDrawers;
    private boolean hasKeyboardTray;
    private int maxWeightCapacity;
    private int maxHeight;

    @Builder
    public WritingDesk(int height, int width, int length, int numberOfDrawers, boolean hasKeyboardTray, int maxWeightCapacity, int maxHeight) {
        super(height, width, length);
        this.numberOfDrawers = numberOfDrawers;
        this.hasKeyboardTray = hasKeyboardTray;
        this.maxWeightCapacity = maxWeightCapacity;
        this.maxHeight = maxHeight;
    }

    @Override
    public int adjustHeight(int centimeters) {
        height += centimeters;

        if (height > maxHeight) {
            height = maxHeight;
        }
        return maxHeight;
    }

    @Override
    public int moveDown(int centimeters) {
        int newHeight = height - centimeters;
        if (newHeight >= 0) {
            height = newHeight;
        }
        return height;
    }
}

