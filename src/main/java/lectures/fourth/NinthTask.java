package lectures.fourth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NinthTask {

    public NinthTask() {

        System.out.println("\n---------------------");
        System.out.println("Ninth task solution:\n");
    }

    public static void main(String[] args) {

        List<Integer> initialList = new ArrayList<>();
        HashSet<Integer> result = new HashSet<>();

        for(int i = 0; i < 100; i++) {
            //generating only values from 1 to 100, so that resulting Set could be somewhat easily distinguished from initial ArrayList
            initialList.add((int) (Math.random() * 100 + 1));
        }

        result.addAll(initialList);

        System.out.println(String.format("\nPrinting initial ArrayList of random integers for result check (it's length is %s):", initialList.size()));
        System.out.println(initialList);

        System.out.println(String.format("\nPrinting out resulting Set of unique elements from ArrayList (it's length is %s):", result.size()));
        System.out.println(result);
    }
}
