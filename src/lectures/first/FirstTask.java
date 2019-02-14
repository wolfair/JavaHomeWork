package lectures.first;

public class FirstTask {

    public static void main(String[] args) {
        int i = 5;
        String someString = "Some string";
        while (i > 0) {
            System.out.println(someString);
            i -= 1;
        }
//          Через for будет чуть короче :)
//
//        String anotherString = "Another string";
//        for (int k = 0; k < 5; k++) {
//            System.out.println(anotherString);
//        }
    }
}