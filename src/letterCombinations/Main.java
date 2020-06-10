package letterCombinations;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        print(solution.letterCombinations("23"));
    }

    private static void print(List<String> list) {
        System.out.print('[');
        for (String str : list) {
            System.out.print(str + ", ");
        }
        System.out.println(']');
    }
}
