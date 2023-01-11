package zohoset15;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringExceptSpecialCharacters {
    public static void main(String[] args) {
        ReverseStringExceptSpecialCharacters specialCharacters=new ReverseStringExceptSpecialCharacters();
        specialCharacters.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        reverse(str.toCharArray());
    }
    private void reverse(char[] ch){
        int i=0,j=ch.length-1;
        while (i<j){
            if (!isAlpha(ch[i])){
                i++;
            }
            else if (!isAlpha(ch[j])){
                j--;
            }
            else{
               char temp=ch[i];
               ch[i]=ch[j];
               ch[j]=temp;
                i++;
                j--;
            }
        }
        String rev=new String(ch);
        System.out.println(rev);
    }
    private boolean isAlpha(char c){
        if (c>='a' && c<='z' || c>='A' && c<='Z' || c>='1' && c<='9'){
            return true;
        }
        return false;
    }

}
