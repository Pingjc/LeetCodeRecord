package convert;

public class Solution {
    public String convert(String s, int numRows) {
        if (s.equals("")) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

        if (numRows == 1) {
            return s;
        }

        StringBuffer tmp = new StringBuffer();

        for (int i = 0; i < Integer.min(numRows, s.length()); i++) {
            int before = (numRows - 1 - i) * 2;
            int after = 2 * i;

            int location = i;
            boolean j = true;
            if (before == 0) {
                j = false;
            }
            do {
                tmp.append(s.charAt(location));
                if (j) {
                    location += before;
                    if (after == 0) {
                        j = !j;
                    }
                } else {
                    location += after;
                    if (before == 0) {
                        j = !j;
                    }
                }
                j = !j;
            } while (location < s.length());
        }

        return tmp.toString();
    }
}
