
/*
Valid Expression / Valid Parentheses:

Check whether all brackets are correctly opened,
closed, matched, and ordered.

Use a Stack:
1. Opening bracket (, [, { → PUSH into stack.
2. Closing bracket ), ], } → Check the TOP.
3. If the top matches the closing bracket → POP.
4. If it does not match → Invalid.
5. At the end, if the stack is empty → Valid.
   Otherwise → Invalid.

Examples:
"{[()]}" → Valid
"{[(])}" → Invalid
"()" → Valid
"(((" → Invalid

Why Stack?
Because brackets follow LIFO (Last In, First Out).
*/
package Stack;

import java.util.Scanner;

public class ValidExpression {
    public static void main(String[] args) {

    }
}
