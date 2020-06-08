package threeSum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] test = {-1, 0, 1, 2, -1, -4};
        print(solution.threeSum(test));

        int[] test1 = {0, 0, 0};
        print(solution.threeSum(test1));
    }

    private static void print(List<List<Integer>> Lists) {
        System.out.println('[');
        for (List<Integer> tmp : Lists) {
            System.out.print('[');
            for (int num : tmp) {
                System.out.print(num + ", ");
            }
            System.out.println(']');
        }
        System.out.println(']');
    }
}
