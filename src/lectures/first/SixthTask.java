package lectures.first;

public class SixthTask {

    public SixthTask() {

        String[] result = {

            "public class Main {",
            "\tpublic static void main(String[] args) {",
            "\t\t//String s = \"Java\";",
            "\t\t//System.out.println(\"Happy\");",
            "\t\t//System.out.println(\"Java Learning\");",
            "\t\t//System.out.println(\"programming\");",
            "\t\tSystem.out.print(\"Happy Java\");",
            "\t\t//System.out.println(\"weekend\");",
            "\t\t//System.out.println(s);",
            "\t\t //System.out.print(\"Python\");",
            "\t\tSystem.out.print(\" \");",
            "\t\tSystem.out.println(\"Learning\");",
            "\t}",
            "}"
        };
        for (String s : result) System.out.println(s);
        System.out.println("\nObligatory code check:");
        new Main();

    }

    public void main(String[] args) {

        new SixthTask();
    }

    class Main {

        public Main() {

            //String s = "Java";
            //System.out.println("Happy");
            //System.out.println("Java Learning");
            //System.out.println("programming");
            System.out.print("Happy Java");
            //System.out.println("weekend");
            //System.out.println(s);
            //System.out.print("Python");
            System.out.print(" ");
            System.out.println("Learning");

        }
        public void main(String[] args) {

            new Main();

        }
    }
}
