package longestPalindrome;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String test1 = "babad";
        String test2 = "cbbd";

        System.out.println(solution.longestPalindrome(test1));
        System.out.println(solution.longestPalindrome(test2));
    }
}
