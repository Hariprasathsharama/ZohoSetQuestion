package zohoset14;

import java.util.Scanner;

public class NumberToAlphabet {
    public static void main(String[] args) {
        NumberToAlphabet number=new NumberToAlphabet();
        number.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String c=convert(n);
        System.out.print(c);
    }
    private String convert(int n){
        String res="",rev="";
        while (n>0){
            n--;
            int r=n%26;
            n=n/26;
            res+=(char)('A'+r);
        }
        for (int i = res.length()-1; i >=0; i--) {
            rev+=res.charAt(i);
        }
        return rev;
    }
}
