package lectures.first;

public class SeventhTask {

    static String[] result = {
            "public class Education {",
            "\tpublic static void main(String[] args) {",
            "\t\tint a = 10;",
            "\t\tint b = 15;",
            "\t\tdouble c = b + 38;",
            "\t\t//int d = a + 12;",
            "\t\t//double e = 12.3;",
            "\t\tString s = \"s\" + a;",
            "\t\tString s1 = a + \"b\";",
            "\t\t//String s2 = \"a\";",
            "\t\tString s3 = s1 + \"a\";",
            "\t\tString s4 = s3 + \"b\";",
            "\t\tSystem.out.println(c + s4 + s);",
            "\t}",
            "}"
    };

    public SeventhTask() {

        System.out.println("\n---------------------");
        System.out.println("Seventh task solution:\n");

    }

    public static void main(String[] args) {

        for (String s : result) System.out.println(s);

        System.out.println("\nObligatory code check:");
        int a = 10;
        int b = 15;
        double c = b + 38;
        //int d = a + 12;
        //double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        //String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
    }
}
