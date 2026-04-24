class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (char ch: s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') stack.push(ch);

            else if (!stack.isEmpty()) {
                if (ch == '}' && stack.pop() != '{') {
                    return false;
                }
                if (ch == ')' && stack.pop() != '(') {
                    return false;
                }
                if (ch == ']' && stack.pop() != '[') {
                    return false;
                }
            }
            else return false;
        }

        return stack.isEmpty();
    }
}
