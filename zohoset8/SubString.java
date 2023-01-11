package zohoset8;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        SubString subString=new SubString();
        subString.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String s=input.next();
        subStr(s);
    }
    private void subStr(String s){
     StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }
}
