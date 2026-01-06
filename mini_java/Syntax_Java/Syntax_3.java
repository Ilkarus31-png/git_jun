import java.lang.Math;

public class Syntax_3 {
    public static void main(String[] args) {
        double a = 56.9898;
        int b = (int)Math.round(a);
        System.out.println(b);

        byte c = 5;
        short d = 9;
        byte e = (byte)(c+d);
        System.out.println(e);

        int k = 9;
        int l = k + 'm';
        System.out.println(l);

        int y = 31;
        int x = 31;
        if(y > x) {
            System.out.printf("Число %d больше числа %d\n", y, x);
        }
        else if(y < x) {
            System.out.printf("Число %d меньше числа %d\n", y, x);
        }
        else{
            System.out.printf("Число %d равно числу %d\n", y, x);
        int h = 3;
        int g = 5;
        int z = (h>g) ? (h-g) : (h+g);
        System.out.println(z);
        }
    }
}
