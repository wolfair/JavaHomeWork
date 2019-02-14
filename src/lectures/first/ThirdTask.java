package lectures.first;

public class ThirdTask {

    int a;
    int b;

    public ThirdTask() {

        this.a = 33;
        this.b = 47;

        int squareOfRectangle = a * b;
        System.out. println(String.format("Square for rectangle with sides %d and %d equals:", this.a, this.b));
        System.out.println(squareOfRectangle);
    }

    public void main(String[] args) {

        new ThirdTask();

    }
}
