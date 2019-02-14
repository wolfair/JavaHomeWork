package lectures.first;

public class ThirdTask {

    private static int a;
    private static int b;

    public static void main(String[] args) {
        a = 33;
        b = 47;

        int squareOfRectangle = a * b;
        System.out. println(String.format("Square for rectangle with sides %d and %d equals:", a, b));
        System.out.println(squareOfRectangle);
    }
}
