package zohoset2;

import java.util.Scanner;

public class isValidExpression {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        char[] ch=s.toCharArray();
        if(new isValidExpression().isValid(ch)){
            System.out.println("Valid");
        }
        else {
            System.out.println("Not Valid");
        }
    }
    public boolean isValid(char[] c){
        int count=0;
        int flag=0;
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='('){
                count++;
            }
            if (c[i]==')'){
                count--;
            }
            if(c[i]=='+' || c[i]=='-' || c[i]=='*' || c[i]=='%' || c[i]=='=' || c[i]=='/'  ){
                if ((c[i-1]>='a' && c[i-1]<='z' ) && (c[i+1]>='a' && c[i+1]<='z')){
                    flag=1;
                }
            }
        }
        if(count==0 && flag==1)return true;
        return false;
    }
}