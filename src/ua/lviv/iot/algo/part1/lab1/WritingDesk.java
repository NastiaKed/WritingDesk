package src.ua.lviv.iot.algo.part1.lab1;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class WritingDesk {

    private static WritingDesk instance = new WritingDesk(2, true, 50, 80, 120);
    private int numberOfDrawers;
    private boolean hasKeyboardTray;
    private int maxWeightCapacity;
    private int currentHeight;
    private int maxHeight;

    public static WritingDesk getInstance() {
        return instance;
    }

    public int adjustHeight(int centimeters) {
        currentHeight += centimeters;

        if (currentHeight > maxHeight) {
            currentHeight = maxHeight;
        }
        return maxHeight;
    }

    public int moveDown(int centimeters) {
        int newHeight = currentHeight - centimeters;
        if (newHeight >= 0) {
            currentHeight = newHeight;
        }
        return currentHeight;
    }
}
