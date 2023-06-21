package src.ua.lviv.iot.algo.part1.lab1;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class Desk {
    protected int height;
    protected int width;
    protected int length;

    public int adjustHeight(int centimeters) {
        return 0;
    }

    public int moveDown(int centimeters) {
        return 0;
    }

}

