package zohoset21;

import java.util.Scanner;

public class ObtainPalindrome {
    public static void main(String[] args) {
        ObtainPalindrome palindrome=new ObtainPalindrome();
        palindrome.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(obtainPalindrome(n)){
            System.out.println("Palindrome ");
        }
        else System.out.println("Not a palindrome");
    }
    private boolean obtainPalindrome(int n){
        int sum=n+rev(n);
        for (int i = 0; i < 5 ; i++) {
            if (isPalindrome(sum)){
                System.out.println(sum);
             return true;
            }
            sum+=rev(sum);
        }
        return false;
    }
    private int rev(int n){
        int rev=0;
        while (n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    private boolean isPalindrome(int n){
        int temp=n,rev=0;
        while (n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if (temp==rev)return true;
        return false;
    }
}
