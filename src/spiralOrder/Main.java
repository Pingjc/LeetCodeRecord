package spiralOrder;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] test1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printArray(solution.spiralOrder(test1));

        int[][] test2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        printArray(solution.spiralOrder(test2));
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
