package isValid;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            switch (tmp){
                case '(':
                case '[':
                case '{':
                    stack.push(tmp);
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.empty()) {
                        return false;
                    }
                    if (!match((Character) stack.pop(), tmp)) {
                        return false;
                    }
                    break;
            }
        }

        return stack.empty();
    }

    private boolean match(char ch1, char ch2) {
        if ((ch2 == ')') && (ch1 == '(')) {
            return true;
        }
        if ((ch2 == ']') && (ch1 == '[')) {
            return true;
        }
        if ((ch2 == '}') && (ch1 == '{')) {
            return true;
        }
        return false;
    }
}
