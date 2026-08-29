/*Valid Expression / Valid Parentheses:
Check whether all brackets are correctly opened,
closed, matched, and ordered.
Use a Stack:
1. Opening bracket (, [, { → PUSH into stack.
2. Closing bracket ), ], } → Check the TOP.
3. If the top matches the closing bracket → POP.
4. If it does not match → Invalid.
5. At the end, if the stack is empty → Valid.
   Otherwise → Invalid.
*/
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidExpression {
    boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                // Check if stack is empty before pop
                if (stack.isEmpty()) {
                    return false;
                }
                char temp = stack.pop();
                if (temp == '{' && ch == '}' ||
                        temp == '[' && ch == ']' ||
                        temp == '(' && ch == ')') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        // Check after checking the complete expression
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String str = scan.nextLine();
        ValidExpression valid = new ValidExpression();
        System.out.println(valid.isValid(str));
    }
}