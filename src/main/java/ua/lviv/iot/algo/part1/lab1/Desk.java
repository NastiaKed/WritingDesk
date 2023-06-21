package ua.lviv.iot.algo.part1.lab1;

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

    public abstract void adjustHeight(int centimeters);

    public abstract void moveDown(int centimeters);
    public String getHeaders(){
        return "height, width, length";
    }
    public String toCSV(){
        return height + ", " + width + ", " + length;
    }
}
