package lectures.first;

public class SeventhTask {

    public static void main(String[] args) {
        String[] result = {
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
        for (String s : result) System.out.println(s);
    }
}
