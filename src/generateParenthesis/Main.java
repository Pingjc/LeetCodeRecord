package generateParenthesis;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        print(solution.generateParenthesis(3));
    }

    private static void print(List<String> list) {
        System.out.println("[");
        for (String string : list) {
            System.out.println("[" + string + "],");
        }
        System.out.println("]");
    }
}
