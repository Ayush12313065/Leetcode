import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack();
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.empty() && st.peek() == '(') {
                    st.pop();
                } else {
                    ans = false;
                    break;
                }
            } else if (ch == '}') {
                if (!st.empty() && st.peek() == '{') {
                    st.pop();
                } else {
                    ans = false;
                    break;
                }
            } else if (ch == ']') {
                if (!st.empty() && st.peek() == '[') {
                    st.pop();
                } else {
                    ans = false;
                    break;
                }
            }
        }
        if (!st.empty()) {
            return false;
        }
        return ans; 
    }

    public static void main(String[] args) {
        String sentence = "({[]})";
        Solution solution = new Solution(); 
        if (solution.isValid(sentence)) {
            System.out.print("Valid");
        } else {
            System.out.print("Non Valid");
        }
    }
}