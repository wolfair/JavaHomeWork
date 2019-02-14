package displaySolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkMain {

    ArrayList<String> numbers = new ArrayList<>(Arrays.asList("first", "one", "1"));
    String lectureNumber;

    public HomeWorkMain() {

        System.out.println("Enter lecture's number:\n");
        Scanner userInput = new Scanner(System.in);
        lectureNumber = userInput.nextLine();

        while (numbers.contains(lectureNumber)) {

            if (Arrays.asList("first", "one", "1").contains(lectureNumber)) {
                System.out.println("\n---------------------");
                System.out.println("First task solution:\n");
                new lectures.first.FirstTask();
                System.out.println("\nHit return to continue...");
                userInput.nextLine();

                System.out.println("\n---------------------");
                System.out.println("Second task solution:\n");
                new lectures.first.SecondTask();
                System.out.println("\nHit return to continue...");
                userInput.nextLine();

                System.out.println("\n---------------------");
                System.out.println("Third task solution:\n");
                new lectures.first.ThirdTask();
                System.out.println("\nHit return to continue...");
                userInput.nextLine();

                System.out.println("\n---------------------");
                System.out.println("Fourth task solution:\n");
                new lectures.first.FourthTask();
                System.out.println("\nHit return to continue...");
                userInput.nextLine();

                System.out.println("\n---------------------");
                System.out.println("Fifth task solution:\n");
                new lectures.first.FifthTask();
                System.out.println("\nHit return to continue...");
                userInput.nextLine();

                System.out.println("\n---------------------");
                System.out.println("Sixth task solution:\n");
                new lectures.first.SixthTask();
                System.out.println("\nHit return to continue...");
                userInput.nextLine();

                System.out.println("\n---------------------");
                System.out.println("Seventh task solution:\n");
                new lectures.first.SeventhTask();
                System.out.println("\nHit return to continue...");
                userInput.nextLine();

                System.out.println("\n---------------------");
                System.out.println("Eighth task solution:\n");
                new lectures.first.EighthTask();
                System.out.println("\nHit return to continue...");
                userInput.nextLine();

                System.out.println("Enter lecture's number to repeat or hit Return to exit.");
                lectureNumber = userInput.nextLine();
            }
        }
    }

    public static void main(String[] args) {

        new HomeWorkMain();

    }
}
