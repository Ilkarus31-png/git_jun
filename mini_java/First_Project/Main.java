public class Main {
    public static void main(String[] args) {

        JSON_Parsing_Simple parser = new JSON_Parsing_Simple();
        Root root = parser.parse();

        System.out.println("Root " + root.toString());
    }
}
