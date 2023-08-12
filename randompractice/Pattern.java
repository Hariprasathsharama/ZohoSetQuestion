package randompractice;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        new Pattern().init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String  s=input.nextLine();
        int n=s.length();
        pattern(s,n);
    }
    private void pattern(String s,int n){
        String res="";int c=0,k=n/2;
        for (int i = 0; i < s.length(); i++) {
            if(i<=k)c=k+i;
            else c=i-k-1;
            for(int j=s.length()-1;j>i;j--){
                System.out.print("  ");
            }
                res += s.charAt(c);
                System.out.print(res);
            System.out.println();
        }
    }
}
