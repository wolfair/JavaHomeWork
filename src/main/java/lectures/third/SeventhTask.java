package lectures.third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SeventhTask {

    public SeventhTask() {

        System.out.println("\n---------------------");
        System.out.println("Seventh task solution:\n");
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int a, b;

        while(true) {

            System.out.println("Input two Integer numbers for greatest common divisor search, please use numbers greater then 10.");
            try {
                System.out.println("First:");
                a = userInput.nextInt();

                System.out.println("Second:");
                b = userInput.nextInt();
            }

            catch (InputMismatchException ima) {

                userInput.nextLine();
                System.out.println("Wrong Input, please enter only integer: ");
                continue;
            }

            break;
        }

        int greatestCommonDivisor = getGreatestCommonDivisor(a, b);

        if(greatestCommonDivisor < 0){

            System.out.println("Provided numbers were too small, no search for you.");
        }

        else{

            System.out.println(String.format("Greatest common divisor for %s and %s is: %s", a, b, greatestCommonDivisor));
        }
    }

    private static int getGreatestCommonDivisor(int a, int b) {

        if(a < 10 || b < 10){

            return(-1);
        }

        else {
            int greatestCommonDivisor = 0;

            for (int i = 1; i <= lectures.third.FifthTask.min(a, b); i++) {

                if (a % i == 0 && b % i == 0) {

                    greatestCommonDivisor = i;
                }
            }

            return greatestCommonDivisor;
        }
    }
}
