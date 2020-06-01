package sumNums;

public class Solution {
    public int sumNums(int n) {
        int tmp = 0;
        boolean rec = (n > 0) && ((tmp = n + sumNums(n-1)) > 0);
        return tmp;
    }
}
