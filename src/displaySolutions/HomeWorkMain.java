package displaySolutions;

import lectures.first.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkMain {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lecture's number(1 - 8) or 0 to exit: ");
            String lectureNumber = userInput.nextLine();
            switch (lectureNumber) {
                case "0":
                    System.out.println("Terminating of the program...");
                    return;
                case "1":
                    System.out.println("First task solution:");
                    FirstTask.main(null);
                    break;
                case "2":
                    System.out.println("Second task solution:");
                    SecondTask.main(null);
                    break;
                case "3":
                    System.out.println("Third task solution:");
                    ThirdTask.main(null);
                    break;
                case "4":
                    System.out.println("Forth task solution:");
                    FourthTask.main(null);
                    break;
                case "5":
                    System.out.println("Fifth task solution:");
                    FifthTask.main(null);
                    break;
                case "6":
                    System.out.println("Sixth task solution:");
                    SixthTask.main(null);
                    break;
                case "7":
                    System.out.println("Seventh task solution:");
                    SeventhTask.main(null);
                    break;
                case "8":
                    System.out.println("Eighth task solution:");
                    EighthTask.main(null);
                    break;
                default:
                    System.out.println("Invalid task number.");
            }
        }
    }
}
