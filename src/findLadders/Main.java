package findLadders;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<String> test1 = new ArrayList<>();
        test1.add("hot");
        test1.add("dot");
        test1.add("dog");
        test1.add("lot");
        test1.add("log");
        test1.add("cog");
        print(solution.findLadders("hit", "cog", test1));

        List<String> test2 = new ArrayList<>();
        test2.add("hot");
        test2.add("dot");
        test2.add("dog");
        test2.add("lot");
        test2.add("log");
        print(solution.findLadders("hit", "cog", test2));
    }

    private static void print(List<List<String>> ans) {
        System.out.println('[');
        for (List<String> tmpList : ans) {
            System.out.print('[');
            for (String tmp : tmpList) {
                System.out.print(tmp + ", ");
            }
            System.out.println(']');
        }
        System.out.println(']');
    }
}
