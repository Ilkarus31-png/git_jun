class Syntax_4 {
    public static void main(String[] args) {
        for(int i = 1; i < 9; i++) {
            System.out.printf("Квадрат числа %d равен %d\n", i, i*i);
        }
        System.out.println();
        int i = 0;
        for (; i < 9;) {
            System.out.printf("Квадрат числа %d равен %d\n", i, i*i);
            i++;
        }
        System.out.println();
        int n = 10;
        for(int m = 0, j = n - 1; m < j; m++, j--) {
            System.out.println(m*j);
        }
        System.out.println();
        for(int k = 1; k <= 9; k++) {
            for(int l = 1; l <= 9; l++) {
            System.out.print(k * l);
            System.out.print("\t");
            }
        System.out.println();
        }
        System.out.println();
        int h = 7;
        do{
            System.out.println(h);
            h--;
        } while (h > 0);
        System.out.println();
        int t = 6;
        while(t > 0) {
            System.out.println(t*t);
            t--;
        }
    }
}
