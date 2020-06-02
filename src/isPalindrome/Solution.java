package isPalindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int ans = 0;
        int tmp = x;

        while (tmp > 0) {
            ans = ans * 10 + tmp % 10;
            tmp /= 10;
        }

        return x == ans;
    }
}
