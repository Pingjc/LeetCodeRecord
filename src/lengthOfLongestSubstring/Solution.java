package lengthOfLongestSubstring;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] alphabeta=new boolean[255];

        int i=0,j=0,maxLength=0;
        while (j<s.length()) {
            int diff=s.charAt(j);
            if (alphabeta[diff]) {
                while (s.charAt(i)!=s.charAt(j)) {
                    alphabeta[s.charAt(i)]=false;
                    i++;
                }
                i++;
                j++;
                if (j-i > maxLength) {
                    maxLength=j-i;
                }
            } else {
                alphabeta[diff]=true;
                j++;
                if (j-i > maxLength) {
                    maxLength=j-i;
                }
            }
        }
        return maxLength;
    }
}
