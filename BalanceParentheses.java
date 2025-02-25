import java.util.Stack;
import java.util.Scanner;

public class BalanceParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        System.out.println(isBalanced(expr) ? "Balanced" : "Not Balanced");
        sc.close();    
    }

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if ("({[".indexOf(ch) != -1) stack.push(ch);
            else if (")}]".indexOf(ch) != -1) {
                if (stack.isEmpty() || "({[".indexOf(stack.pop()) != ") }]".indexOf(ch)) return false;
            }
        }
        return stack.isEmpty();
    }
}
