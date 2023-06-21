package ua.lviv.iot.algo.part1.lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DeskWriter {
    public void writeToFile(List<Desk> desks) {
        PrintWriter out = null;
        try {
            File csvFile = new File("Desk3.csv");
            out = new PrintWriter(new FileWriter(csvFile));
            Map<Class<? extends Desk>, String> headersMap = new HashMap<>();
            for (Desk desk : desks) {
                Class<? extends Desk> deskClass = desk.getClass();
                String headers = headersMap.get(deskClass);
                if (headers == null) {
                    headers = desk.getHeaders();
                    headersMap.put(deskClass, headers);
                    out.println(headers);
                }
                out.println(desk.toCSV());
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
