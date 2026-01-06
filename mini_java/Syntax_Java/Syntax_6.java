public class Syntax_6 {
    public static void main(String[] args) {
        String name = "Tom";
        switch(name) {
            case "Bob" -> System.out.println("Тебя зовут Bob");
            case "Tom" -> {
                System.out.println("Тебя зовут Tom");
                System.out.println("Ты очень cool чел!");
            }
            case "Katya" -> System.out.println("Тебя зовут Katya");
        }
        int operations = 1;
        int result = 0;
        int a1 = 15; int b1 = 16;
        switch(operations) {
            case 1 -> result = a1 + b1;
            case 2 -> result = a1 - b1;
            case 3 -> result = a1 * b1;
            case 4 -> result = a1 / b1;
            default -> result = 0;
        }
        System.out.println(result);
        int operation = 1;
        int a = 15; int b = 16;
        int results = switch(operation) {
            case 1 -> {
                System.out.println("a + b");
                yield a + b;
            }
            case 2 -> {
                System.out.println("a - b");
                yield a - b;
            }
            case 3 -> {
                System.out.println("a * b");
                yield a * b;
            }
            case 4 -> {
                System.out.println("a / b");
                yield a / b;
            }
            default -> 0;
        };
        System.out.println(results);
    }
}
