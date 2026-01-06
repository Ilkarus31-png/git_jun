public class Syntax_5 {
    public static void main(String[] args) {
        int nums[] = new int[] {1, 2, 3, 4, 5};
        int length = nums.length;
        int last = nums[nums.length-1];
        System.out.println(nums[1]);
        System.out.println(length);
        System.out.println(last);

        int nums_2[][] = { {0, 1, 2,}, {3, 4, 5} };
        System.out.println(nums_2[1][1]);

        int nums_3[][] = new int[3][];
        nums_3[0] = new int [2];
        nums_3[1] = new int [3];
        nums_3[2] = new int [4];
        for(int i = 0; i < nums_3.length; i++) {
            for(int j = 0; j < nums_3[i].length; j++) {
                System.out.printf("%d", nums_3[i][j]);
            }
        System.out.println();
        }
    }
}
