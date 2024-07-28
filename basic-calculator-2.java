class Solution {
    public int calculate(String s) {
         Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }

            if (c == '+' || c == '-' || c == '*' || c == '/' || i == n - 1) {
                if (c != ' ' && !Character.isDigit(c) || i == n - 1) {
                    if (operation == '+') {
                        stack.push(currentNumber);
                    } else if (operation == '-') {
                        stack.push(-currentNumber);
                    } else if (operation == '*') {
                        stack.push(stack.pop() * currentNumber);
                    } else if (operation == '/') {
                        stack.push(stack.pop() / currentNumber);
                    }

                    operation = c;
                    currentNumber = 0;
                }
            }
        }

        // Sum up all numbers in the stack
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}