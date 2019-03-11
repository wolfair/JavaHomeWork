package lectures.fourth;

import java.util.HashMap;
import java.util.Map;

public class SeventhTask {

    public SeventhTask() {

        System.out.println("\n---------------------");
        System.out.println("Seventh task solution:\n");
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

        for(String key : result.keySet()){

            System.out.println(key + " - " + result.get(key));
        }
    }
}
