package lectures.fourth;

import java.util.HashMap;
import java.util.Map;

public class ThirdTask {

    public ThirdTask() {

        System.out.println("\n---------------------");
        System.out.println("Third task solution:\n");
    }

    public static void main(String[] args) {

        Map vehicles = new HashMap();
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 4);
        vehicles.put("Ford", 3);
        vehicles.put("Ferrari", 2);
        vehicles.put("Porsche", 1);

        System.out.println(vehicles.keySet());
    }


}
