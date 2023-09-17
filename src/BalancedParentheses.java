import java.util.Stack;

public class BalancedParentheses {

    public static boolean hasBalancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // Unmatched closing parenthesis
                }
            }
        }

        // If the stack is empty, all parentheses are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testString1 = "()()";
        String testString2 = "(())()";
        String testString3 = ")()((";

        System.out.println("Test String 1 is balanced: " + hasBalancedParentheses(testString1));
        System.out.println("Test String 2 is balanced: " + hasBalancedParentheses(testString2));
        System.out.println("Test String 3 is balanced: " + hasBalancedParentheses(testString3));
    }
}
