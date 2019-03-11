package lectures.fourth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SixthTask {

    public SixthTask() {

        System.out.println("\n---------------------");
        System.out.println("Sixth task solution:\n");
    }

    public static void main(String[] args) {

        List<String> initialList = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        int a, b;

        for (int i = 0; i < 10; i++) {

            System.out.println(String.format("Please input element #%s for ArrayList: ", i + 1));
            initialList.add(userInput.next());
        }

        a = initialList.get(0).length();
        for(int i = 1; i < initialList.size() - 1; i++){

            b = initialList.get(i).length();
            a = (a > b ? a : b);
        }

        for(String elem : initialList) {

            if(elem.length() == a) {

                result.add(elem);
            }
        }

        System.out.println(String.format("\nElements with maximum length(%s):", a));
        for(String elem : result){

            System.out.println(elem);
        }

    }
}
