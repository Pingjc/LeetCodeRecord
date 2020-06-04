package productExceptSelf;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] test = {1, 2, 3, 4};
        printArray(solution.productExceptSelf(test));
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
