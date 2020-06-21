package findBestValue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] test1 = {4, 9, 3};
        System.out.println(solution.findBestValue(test1, 10));


        int[] test2 = {2, 3, 5};
        System.out.println(solution.findBestValue(test2, 10));


        int[] test3 = {60864, 25176, 27249, 21296, 20204};
        System.out.println(solution.findBestValue(test3, 56803));

        int[] test4 = {40091, 2502, 74024, 53101, 60555, 33732, 23467, 40560, 32693, 13013};
        System.out.println(solution.findBestValue(test4, 78666));

        int[] test5 = {1547,83230,57084,93444,70879};
        System.out.println(solution.findBestValue(test5, 71237));
    }
}
