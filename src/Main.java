import java.util.Arrays;
import java.util.Stack;


class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}

class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char curr : s.toCharArray()) {
            if (curr == '(' || curr == '[' || curr == '{') {
                stack.push(curr);
            } else if (!stack.isEmpty() && isMatchingPair(stack.peek(), curr)) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}