package lectures.first;

public class ThirdTask {

    static int a;
    static int b;

    public ThirdTask() {

        a = 33;
        b = 47;
        System.out.println("\n---------------------");
        System.out.println("Third task solution:\n");

    }

    public static void main(String[] args) {

        int squareOfRectangle = a * b;
        System.out. println(String.format("Square for rectangle with sides %d and %d equals:", a, b));
        System.out.println(squareOfRectangle);

    }
}
