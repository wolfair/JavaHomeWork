package lectures.first;

import java.util.ArrayList;
import java.util.Scanner;

public class EighthTask {

    public EighthTask() {

        System.out.println("Enter int ASCII codes for Eighth Task:\n(enter invalid ASCII code to finish input process)\n");
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> variables = new ArrayList<>();
        while (userInput.hasNextInt()) {
            int variable = userInput.nextInt();
            variables.add(variable);
        }
        for (int variable : variables) {
            printList(transformIntToChar(variable));
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

         new EighthTask();

    }

    private static ArrayList<Character> transformIntToChar(int... values) {

        ArrayList<Character> buffer = new ArrayList<>();
        for(int i : values) {
            buffer.add(((char)i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {

        for(char c : characters) {
            System.out.print(c);
        }
    }
}
