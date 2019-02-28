package lectures.third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EighthToEleventhTask {

    public EighthToEleventhTask() {

        System.out.println("\n---------------------");
        System.out.println("Eighth to Eleventh tasks solution:\n");
    }

    public static void main(String[] args) {

        System.out.println("\nSimple square of * for Eighth task:");
        EighthTask();

        System.out.println("\nIncreasing number of * for Ninth task:");
        NinthTask();

        System.out.println("\nHollow square of * for Tenth task:");
        TenthTask();

        System.out.println("\nChristmas tree made of * for Tenth task:");
        EleventhTask();

        System.out.println("\nBonus Task given by Dmytro Latyshev (square with diagonals): ");
        BonusTask();
    }

    private static void EighthTask() {

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 11; j++){

                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void NinthTask() {

        for(int i = 1; i < 8; i++) {

            int j = i;

            while(j > 0) {

                System.out.print("*");
                j--;
            }
            System.out.println();
        }
    }

    private static void TenthTask() {

        int a = 5;
        int b = 10;

        for(int i = 0; i < a; i ++) {

            for (int j = 0; j < b; j++) {

                if (i == 0 || j == 0 || i == a - 1 || j == b - 1) {

                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    private static void EleventhTask() {

        Scanner userInput = new Scanner(System.in);
        int treeHeight = 6;
        System.out.println("Please enter desired Christmas Tree height: ");

        while(true) {

            try {

                treeHeight = userInput.nextInt();
            }

            catch (InputMismatchException ima) {

                userInput.nextLine();
                System.out.println("Wrong Input, please enter only integer: ");
                continue;
            }
            if (treeHeight > 0) {

                break;
            }

            else {

                userInput.nextLine();
                System.out.println("Height cannot be 0, try again: ");
                continue;
            }
        }
        
        int treeWidth = treeHeight * 2 - 1;
        for(int i = 1; i < treeHeight * 2; i += 2)     {

            for(int j = 1; j <= treeWidth; j++){

                if ((treeWidth / 2) - (i / 2) + 1 <= j && j <= (treeWidth  / 2) + (i / 2) + 1) {

                    System.out.print("*");
                }
                else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    private static void BonusTask() {

        int a = 20;
        int b = 40;

        for(int in = 1; in <= a; in ++) {

            double i = in;
            for(int jn = 1; jn <= b; jn++) {

                double j = jn;
                if(i == 1 || j == 1 || i == a || j == b) {

                    System.out.print("*");
                }

                else if(i <= a / 2 && j <= b / 2 && a / i == b / j){

                    System.out.print("*");
                }

                else if(i <= a / 2 && j >= b / 2 && a / i == b / (b - j + 1)){

                    System.out.print("*");
                }

                else if(i >= a / 2 && j <= b / 2 && a / (a - i + 1) == b / j){

                    System.out.print("*");
                }

                else if(i >= a / 2 && j >= b / 2 && a / (a - i + 1) == b / (b - j + 1)){

                    System.out.print("*");
                }

                else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

