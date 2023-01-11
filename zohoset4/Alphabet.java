package zohoset4;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner input=new Scanner(
                System.in
        );
        int n=input.nextInt();
        alpha(n);
    }
    public static void alpha(int n){
        String str="",res=" ";
        while (n>0){
            n--;
            int r=n%26;
             n=n/26;
             str+=(char)('A'+r);
        }
        for (int i = str.length()-1;i>=0; i--) {
             res+=str.charAt(i);
        }
        System.out.println(res);
    }
}
