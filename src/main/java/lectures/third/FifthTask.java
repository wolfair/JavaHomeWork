package lectures.third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FifthTask {

    public FifthTask() {

        System.out.println("\n---------------------");
        System.out.println("Fifth task solution:\n");
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int[] values = new int[4];
        int i = 0;

        while(i < 4) {

            try {
                System.out.println("Input argument #" + (i + 1) + ":");
                values[i] = userInput.nextInt();
            }

            catch (InputMismatchException ima) {

                userInput.nextLine();
                System.out.println("Wrong Input, please enter only integer: ");
                continue;
            }

            i++;
        }

        int result = min(values[0], values[1], values[2], values[3]);
        System.out.println("The minimum value between provided is:");
        System.out.println(result);

    }

    public static int min(int a, int b, int c, int d) {

        int firstArg = min(a, b);
        int secondArg = min(c, d);

        if(firstArg < secondArg){

            return(firstArg);
        }

        else if(secondArg < firstArg){

            return(secondArg);
        }

        else{

            System.out.println(String.format("Resulting arguments are equal, returning one of them (%s).", firstArg));
            return(firstArg);
        }
    }

    public static int min(int a, int b) {

        if(a < b){

            return(a);
        }

        else if(b < a){

            return(b);
        }

        else{

            System.out.println(String.format("Both arguments from the passed pair of values are equal, returning one of them (%s).", a));
            return(a);
        }
    }
}
