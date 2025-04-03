package demo.ranjith.simple;

import java.util.Stack;

public class StackProgramToValidateChatGPT {

    public static void main(String[] args) {
        String str = "{()}{[()()]}";
        usingMethod(str);
    }

    private static boolean isReserve(char top, char current) {
        if ((top == '(' && current == ')') || (top == '{' && current == '}') || (top == '[' && current == ']')) {
            return true;
        }
        return false;
    }

    private static void usingMethod(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (stack.isEmpty()) {
                stack.add(c);
            } else {
                if (isReserve(stack.peek(), c)) {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
