package isMatch;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "aa";
        String p1 = "a";
        System.out.println(solution.isMatch(s1, p1));

        String s2 = "aa";
        String p2 = "a*";
        System.out.println(solution.isMatch(s2, p2));

        String s3 = "ab";
        String p3 = ".*";
        System.out.println(solution.isMatch(s3, p3));

        String s4 = "aab";
        String p4 = "c*a*b";
        System.out.println(solution.isMatch(s4, p4));

        String s5 = "mississippi";
        String p5 = "mis*is*p*.";
        System.out.println(solution.isMatch(s1, p1));
    }
}
