package src.ua.lviv.iot.algo.part1.lab1;

public class Main {
    public static void main(String[] args) {
        var writingDesks = new WritingDesk[4];
        writingDesks[0] = WritingDesk.getInstance();
        writingDesks[1] = WritingDesk.getInstance();
        writingDesks[2] = new WritingDesk(2, true, 50, 80, 120);
        writingDesks[3] = new WritingDesk();

        for (var writingDesk : writingDesks) {
            System.out.println(writingDesk.toString());
        }
        System.out.println("The height of the table after its increase is " + writingDesks[1].adjustHeight(10));
        System.out.println("After decreasing the height its height is " + writingDesks[1].moveDown(5));
    }
}