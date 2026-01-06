class Syntax_2 {
    public static void main(String[] args) {
        int val_1 = 1;
        int val_2 = 2;
        int val_3 = 3;
        int res = 0b00000000;

        res = res | val_1;
        res = res << 2;
        res = res | val_2;
        res = res << 2;
        res = res | val_3;

        System.out.println("Result: " + res);
        System.out.println("Result bin: " + String.format("%6s", Integer.toBinaryString(res)).replace(' ', '0') + "\n");

        int newval_3 = res & 0b000_0011;
        res = res >> 2;
        int newval_2 = res & 0b000_0011;
        res = res >> 2;
        int newval_1 = res & 0b000_0011;
        System.out.println("Result 1: " + newval_1);
        System.out.println("Result 1 bin: " +
                           String.format("%6s", Integer.toBinaryString(newval_1)).replace(' ', '0') + "\n");

        System.out.println("Result 2: " + newval_2);
        System.out.println("Result 2 bin: " +
                           String.format("%6s", Integer.toBinaryString(newval_2)).replace(' ', '0') + "\n");

        System.out.println("Result 3: " + newval_3);
        System.out.println("Result 3 bin: " +
                           String.format("%6s", Integer.toBinaryString(newval_3)).replace(' ', '0') + "\n");

        long a = 31;
        int b = (int)a;
        short c = (short)b;
        byte d = (byte)c;
        System.out.println(d);

        byte k = 5;
        short l = k;
        int m = l;
        long o = m;
        System.out.println(o);

        byte i = 3;
        long n = i;
        System.out.println(n);
    }
}

