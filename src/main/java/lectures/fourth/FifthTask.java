package lectures.fourth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FifthTask {

    public FifthTask() {

        System.out.println("\n---------------------");
        System.out.println("Fifth task solution:\n");
    }

    public static void main(String[] args) {

        List<String> result = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);

        for(int i = 0; i < 10; i++){

            System.out.println(String.format("Please input element #%s for ArrayList: ", i + 1));
            result.add(userInput.next());
        }

        System.out.println("\nResulting list of elements:");
        for(String elem : result){

            System.out.println(elem);
        }
    }
}
