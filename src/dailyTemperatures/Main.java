package dailyTemperatures;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] test = {73, 74, 75, 71, 69, 72, 76, 73};
        print(solution.dailyTemperatures(test));
    }

    private static void print(int[] ans) {
        System.out.print('[');
        for (int i : ans) {
            System.out.print(i + ", ");
        }
        System.out.println(']');
    }
}
