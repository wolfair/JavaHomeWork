package lectures.third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FourthTask {

    public FourthTask() {

        System.out.println("\n---------------------");
        System.out.println("Fourth task solution:\n");
    }

    public static void main(String[] args) {

        int[] arrayOfIntegers = new int[10];
        int sumOfElementsInArray = 0;
        Scanner userInput = new Scanner(System.in);

        while(true) {

            for(int i = 0; i < arrayOfIntegers.length; i++) {

                try {
                    System.out.println("Enter element of array #" + (i + 1) + " : ");
                    arrayOfIntegers[i] = userInput.nextInt();
                }

                catch (InputMismatchException ima) {

                    userInput.nextLine();
                    System.out.println("Wrong Input, please enter only integer: ");
                    continue;
                }
            }

            break;
        }

        for (int i = 0; i < arrayOfIntegers.length; i++) {

            if( i != 0 && i != arrayOfIntegers.length - 1) {

                sumOfElementsInArray = sumOfElementsInArray + arrayOfIntegers[i];
            }
        }

        System.out.println("Resulting sum of all elements from provided array except for the first and the last one is: ");
        System.out.println(sumOfElementsInArray);
    }
}
