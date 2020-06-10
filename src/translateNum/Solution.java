package translateNum;

public class Solution {
    public int translateNum(int num) {
        if (num == 0) {
            return 1;
        }

        int tmp = num % 100;
        if ((tmp >= 10) && (tmp <= 25)) {
            return translateNum(num / 10) + translateNum(num / 100);
        } else {
            return translateNum(num / 10);
        }
    }
}
