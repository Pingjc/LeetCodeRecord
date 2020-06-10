package threeSumClosest;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] test = {-1, 2, 1, -4};
        System.out.println(solution.threeSumClosest(test, 1));

        int[] test1 = {0,2,1,-3};
        System.out.println(solution.threeSumClosest(test1, 1));
    }
}
