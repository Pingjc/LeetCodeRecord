package intToRoman;

public class Solution {
    public String intToRoman(int num) {
        int[] numArray = new int[4];

        for (int i = 0; i < 4; i++) {
            numArray[i] = num % 10;
            num /= 10;
        }

        char[] char1 = {'I', 'X', 'C', 'M'};
        char[] char5 = {'V', 'L', 'D', ' '};
        StringBuffer tmp = new StringBuffer();

        for (int i = 3; i >= 0; i--) {
            switch (numArray[i]) {
                case 1:
                case 2:
                case 3:
                    for (int j = 0; j < numArray[i]; j++) {
                        tmp.append(char1[i]);
                    }
                    break;
                case 4:
                    tmp.append(char1[i]);
                    tmp.append(char5[i]);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    tmp.append(char5[i]);
                    for (int j = 0; j < numArray[i] - 5; j++) {
                        tmp.append(char1[i]);
                    }
                    break;
                case 9:
                    tmp.append(char1[i]);
                    tmp.append(char1[i + 1]);
                    break;
            }
        }

        return tmp.toString();
    }
}
