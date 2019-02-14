package lectures.first;

import java.util.ArrayList;
import java.util.Scanner;

public class EighthTask {

    // Переделать
    public static void main(String[] args) {
        System.out.println("To be done...");
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
