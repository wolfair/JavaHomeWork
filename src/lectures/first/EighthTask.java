package lectures.first;

import java.util.ArrayList;
import java.util.List;

public class EighthTask {

    static List<Integer> intCodeList = new ArrayList<>();
    static String predefinedString;


    public EighthTask() {

        predefinedString = "Hello World";
        System.out.println("\n---------------------");
        System.out.println("Eighth task solution:\n");

    }

    public static void main(String[] args) {

        //changing desired intCodeList to convertible type
        char[] temp = predefinedString.toCharArray();

        //converting char array to int array of ASCII codes
        for (char ch : temp) {

            intCodeList.add((int) ch);

        }

        //printing our input using predefined methods
        for (int symbol : intCodeList) {

            printList(transformIntToChar(symbol));

        }

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
