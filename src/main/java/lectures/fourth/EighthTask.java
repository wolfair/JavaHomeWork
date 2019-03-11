package lectures.fourth;

import java.util.HashMap;
import java.util.Map;

public class EighthTask {

    public EighthTask() {

        System.out.println("\n---------------------");
        System.out.println("Eighth task solution:\n");
    }

    public static void main(String[] args) {

        HashMap<String, String> result = new HashMap<>();

        result.putAll(Map.of(
                "watermelon", "berry",
                "banana", "fruit",
                "pineapple", "fruit",
                "melon", "vegetable",
                "cranberry", "berry",
                "apple", "fruit",
                "iris", "flower",
                "potato", "vegetable",
                "carrot", "vegetable"));

        System.out.println("List of all vegetables in Map");
        for(String key : result.keySet()){

            if(result.get(key).equals("vegetable")){

                System.out.println(key);
            }
        }
    }
}
