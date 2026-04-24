class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if ("/".equals(token)) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            } else if ("-".equals(token)) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if ("+".equals(token)) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first + second);
            } else if ("*".equals(token)) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first * second);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
