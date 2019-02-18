package displaySolutions;

import java.util.Scanner;

public class HomeWorkMain {

    static Scanner userInput = new Scanner(System.in);

    public HomeWorkMain() {


    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\nEnter lecture's number (1 to 20), enter 0 to exit the program:\n");
            String lectureNumber = userInput.nextLine();
            switch (lectureNumber) {
                case "0":
                    System.out.println("Have a nice day!");
                    return;

                case "1":
                    System.out.println("Displaying all solutions for the first lecture.\n");
                    new lectures.first.FirstTask();
                    lectures.first.FirstTask.main(null);

                    new lectures.first.SecondTask();
                    lectures.first.SecondTask.main(null);

                    new lectures.first.ThirdTask();
                    lectures.first.ThirdTask.main(null);


                    new lectures.first.FourthTask();
                    lectures.first.FourthTask.main(null);

                    new lectures.first.FifthTask();
                    lectures.first.FifthTask.main(null);

                    new lectures.first.SixthTask();
                    lectures.first.SixthTask.main(null);

                    new lectures.first.SeventhTask();
                    lectures.first.SeventhTask.main(null);

                    new lectures.first.EighthTask();
                    lectures.first.EighthTask.main(null);
                    break;

                case "2":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "3":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "4":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "5":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "6":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "7":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "8":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "9":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "10":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "11":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "12":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "13":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "14":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "15":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "16":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "17":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "18":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "19":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                case "20":
                    System.out.println("This lecture wasn't implemented yet.");
                    break;

                default:
                    System.out.println("Invalid lecture number!");
                    break;
            }
        }

    }
}
