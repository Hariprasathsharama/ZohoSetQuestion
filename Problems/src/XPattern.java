import java.util.Scanner;

public class XPattern {
    public void pattern(String str){
        int len=0;
        char[] s=str.toCharArray();
        for(char c:s)len++;
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print(s[i]);
//            for (int j = len-i-1; j >0 ; j--) {
//                System.out.print(" ");
//            }
//            System.out.print(s[j]);
//        }
//
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(i==j || j==len-i-1){
                    System.out.print(s[j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        new XPattern().pattern(str);
    }
}
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