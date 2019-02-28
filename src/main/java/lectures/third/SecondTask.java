package lectures.third;

public class SecondTask {

    public SecondTask() {

        System.out.println("\n---------------------");
        System.out.println("Second task solution:\n");

    }

    public static void main(String[] args) {

        int i = 1;
        while(i < 101) {

            if(i % 3 == 0) {

                System.out.println(i);

            }

            i++;
        }
    }
}
