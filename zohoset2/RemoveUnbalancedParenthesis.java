package zohoset2;

import java.util.Scanner;

public class RemoveUnbalancedParenthesis {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String s=input.next();
        System.out.print(removeUnbalancedParentheses(s));
    }
    public static String removeUnbalancedParentheses(String expression) {
        int openCount = 0;
        int closeCount = 0;

        // Count the number of open and close parentheses
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                closeCount++;
            }
        }

        // If the parentheses are balanced, return the original expression
        if (openCount == closeCount) {
            return expression;
        }

        // If there are more open parentheses than close parentheses, remove some of the open parentheses
        if (openCount > closeCount) {
            StringBuilder sb = new StringBuilder();
            openCount = 0;
            for (char c : expression.toCharArray()) {
                if (c == '(') {
                    openCount++;
                    if (openCount <= closeCount) {
                        sb.append(c);
                    }
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

        // If there are more close parentheses than open parentheses, remove some of the close parentheses
        if (closeCount > openCount) {
            StringBuilder sb = new StringBuilder();
            closeCount = 0;
            for (char c : expression.toCharArray()) {
                if (c == ')') {
                    closeCount++;
                    if (closeCount <= openCount) {
                        sb.append(c);
                    }
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

        return expression;
    }

}