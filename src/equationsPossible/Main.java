package equationsPossible;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] test1 = {"a==b", "b!=a"};
        System.out.println(solution.equationsPossible(test1));
        String[] test2 = {"b==a", "a==b"};
        System.out.println(solution.equationsPossible(test2));
        String[] test3 = {"a==b", "b==c", "a==c"};
        System.out.println(solution.equationsPossible(test3));
        String[] test4 = {"a==b", "b!=c", "c==a"};
        System.out.println(solution.equationsPossible(test4));
        String[] test5 = {"c==c", "b==d", "x!=z"};
        System.out.println(solution.equationsPossible(test5));
    }
}
