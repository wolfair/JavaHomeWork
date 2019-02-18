package lectures.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EighthTask {

    static List<Integer> output = new ArrayList<>(Arrays.asList(72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100));

    public static void showSolution() {
        System.out.println("\n---------------------");
        System.out.println("Eighth task solution:\n");

        for (int symbol : output) {
            printList(transformIntToChar(symbol));
        }
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }
}
