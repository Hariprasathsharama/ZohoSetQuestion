package zohoset14;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
     RomanToInteger romanToInteger=new RomanToInteger();
     romanToInteger.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int res=romanToInteger(str);
        System.out.println(res);
    }
    private int romanToInteger(String s){
        int ans=0,t=0;
        for(int i=s.length()-1;i>=0;i--){
            if (n(s.charAt(i))>=t){
                ans+=n(s.charAt(i));
            }
            else{
                ans-=n(s.charAt(i));
            }
            t=n(s.charAt(i));
        }
        return ans;
    }
    private int n(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
