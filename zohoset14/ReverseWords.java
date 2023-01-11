package zohoset14;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords reverseWords=new ReverseWords();
        reverseWords.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String rev=input.nextLine();
        int n=rev.length();
        reverse(rev,"",0,n);
    }
    private void reverse(String s,String res,int i,int n){
        if (i==n){
            System.out.print(res+" ");
        }
        else if (s.charAt(i) == ' '){
            reverse(s,"",i+1,n);
            System.out.print(res+" ");
        }
        else{
            reverse(s,res+s.charAt(i),i+1,n);
        }
    }
}
