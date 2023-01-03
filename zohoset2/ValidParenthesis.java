package zohoset2;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        ValidParenthesis obj=new ValidParenthesis();
        if(obj.validParenthesis(s)){
            System.out.println("Valid");
        }
        else {
            System.out.println("Not Valid");
        }
    }
    public boolean validParenthesis(String s){
        Stack<Character>stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c== '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())return false;
                if (c == ')') {
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                    else return false;
                }
                if (c=='}'){
                    if (stack.peek()=='{'){
                        stack.pop();
                    }
                    else return false;
                }
                if (c==']'){
                    if (stack.peek()=='['){
                        stack.pop();
                    }
                    else return false;
                }
            }
        }
        if (stack.size()==0)return true;
        return false;
    }
}
