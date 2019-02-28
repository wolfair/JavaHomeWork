package lectures.fourth;

public class SecondTask {

    enum MagicColors {

        W("White"), U("Blue"), B("Black"), R("Red"), G("Green");

        MagicColors(String FullName) {

            System.out.println(FullName);
        }
    }

    public SecondTask() {

        System.out.println("\n---------------------");
        System.out.println("Second task solution:\n");
    }

    public static void main(String[] args) {

        MagicColors.W.toString();
        MagicColors.U.toString();
        MagicColors.B.toString();
        MagicColors.R.toString();
        MagicColors.G.toString();

    }
}
