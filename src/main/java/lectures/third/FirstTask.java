package lectures.third;

import static java.util.stream.IntStream.rangeClosed;

public class FirstTask {

    public FirstTask() {

        System.out.println("\n---------------------");
        System.out.println("First task solution:\n");

    }

    public static void main(String[] args) {

        int i = 10;

        System.out.println("WHILE cycle:");
        while(i <= 20) {

            System.out.println(i);
            i += 1;
        }

        i = 10;
        System.out.println("\nDO WHILE cycle:");
        do {

            System.out.println(i);
            i += 1;
        } while (i < 20);

        System.out.println("\nFOR Loop:");
        for(i = 10; i <= 20; i++) {

            System.out.println(i);
        }

        System.out.println("\nFOREACH Loop:");
        for(int index : rangeClosed(10, 20).toArray()) {

            System.out.println(index);
        }
    }
}
