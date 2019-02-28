package lectures.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdTask {

    public ThirdTask() {

        System.out.println("\n---------------------");
        System.out.println("Third task solution:\n");

    }

    public static void main(String[] args) {

        List<Integer> resultArray = new ArrayList<>();

        for(int i = 100; i >= 0; i--) {

            resultArray.add(i);
        }

        System.out.println("\n" + resultArray);
    }

    private static void forFun() {

        int[] alternativeResultArray = new int[101];

        for(int i = 100; i >= 0; i--) {

            alternativeResultArray[100 - i] = i;
        }

        System.out.println("\n" + Arrays.toString(alternativeResultArray));
    }
}
