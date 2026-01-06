import java.util.Scanner;

public class Syntax{
    public static void main (String args[]) {
        int x;
        x = 10;
        long chislo = 0x800000001L;
        double flka = 3.15f;
        var y = 35;
        final double PI = 3.14;
        System.out.println("Hello, World! " + x + "x " + y + " Круто!");
        System.out.println("\nЗначение числа pi: " + PI);
        System.out.println("\nВещественные литералы:\n" + 0b11);
        System.out.println(0b1011);
        System.out.println(0b11111);
        System.out.println(0x0A);
        System.out.println(0XFF);
        System.out.println(013);
        System.out.println(123_456);
        System.out.println(3.14);
        System.out.println(3.14e3);
        System.out.println('И');
        System.out.println('\u0418');
        System.out.println(chislo);
        System.out.println(flka);
        System.out.printf("x=%d; y=%d\n", x, y);

        String name = "Kirill";
        int age = 35;
        float height = 1.73f;
        System.out.printf("Name: %s;\nAge: %d;\nHeight: %f\n", name, age, height);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();
    }
}
