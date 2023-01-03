package zohoset3;

import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        CrossPattern pattern=new CrossPattern();
        pattern.cross(s);
    }
    public void cross(String s){
        int n=s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i==j || j==n-i-1){
                    System.out.print(s.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
