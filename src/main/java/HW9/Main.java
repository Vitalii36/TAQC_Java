package HW9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {
        List<Plants> PlantList = new ArrayList<>();
        PlantList.add(new Plants(1,"RED", "TRIANGULAR"));
        PlantList.add(new Plants(2,"GREEN", "SQUARE"));
        PlantList.add(new Plants(3,"WHITE", "RECTANGULAR"));
        System.out.println("Everything OK");
        try {
            PlantList.add(new Plants(4,"WHITE", "LINE"));
        }
        catch (Exception e) {
            System.out.println("Exception - " + e);
        }

        try {
            PlantList.add(new Plants(5,"BROWN", "RECTANGULAR"));
        }
        catch (Exception e) {
            System.out.println("Exception - " + e);
        }

    }

}
