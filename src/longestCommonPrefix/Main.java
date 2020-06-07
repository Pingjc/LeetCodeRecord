package longestCommonPrefix;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] test1 = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(test1));

        String[] test2 = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(test2));
    }
}
