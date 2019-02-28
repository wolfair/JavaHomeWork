package lectures.fourth;

import java.util.ArrayList;
import java.util.Random;

public class FourthTask {

    public FourthTask() {

        System.out.println("\n---------------------");
        System.out.println("Fourth task solution:\n");
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayOfRandomIntegers = new ArrayList<>();
        Random random = new Random();
        int numberOfEvenElements = 0;

        for(int i = 0; i < 15; i++) {

            arrayOfRandomIntegers.add(random.nextInt(9));
        }

        System.out.println("Displaying created Array of random integers:");
        System.out.println(arrayOfRandomIntegers);

        for(int x : arrayOfRandomIntegers) {

            if(x % 2 == 0) {

                numberOfEvenElements++;
            }
        }

        System.out.println(String.format("\nNumber of even elements in generated array is: %s", numberOfEvenElements));
    }
}
