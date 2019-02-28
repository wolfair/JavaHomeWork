package lectures.third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SixthTask {

    public SixthTask() {

        System.out.println("\n---------------------");
        System.out.println("Sixth task solution:\n");
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int usersNumber;

        while(true) {

            try {
                System.out.println("Input your Integer number to get sum of even digits in it:");
                usersNumber = userInput.nextInt();
            }

            catch (InputMismatchException ima) {

                userInput.nextLine();
                System.out.println("Wrong Input, please enter only integer: ");
                continue;
            }

            break;
        }

        int evenDigitSum = getEvenDigitSum(usersNumber);

        if(evenDigitSum == 0){

            System.out.println("There are no even digits in provided number.");
        }

        else if(evenDigitSum > 0){

            System.out.println(String.format("Sum of even digits from provided number is: %s", evenDigitSum));
        }

        else{

            System.out.println("You provided negative number, no sum for you.");
        }
    }

    private static int getEvenDigitSum (int a) {

        String aString = String.valueOf(a);
        int evenDigitSum = 0;

        if(a < 0){

            return -1;
        }

        else {
            for(int i = 0; i < aString.length(); i++) {

                int x = Character.getNumericValue(aString.charAt(i));

                if(x % 2 == 0){

                    evenDigitSum += x;
                }
            }

            return evenDigitSum;
        }
    }
}
