package zohoset3;

import java.util.Scanner;

public class PrintAlphabet {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        new PrintAlphabet().print(s);
    }
    public void print(String s){
        char[] c=s.toCharArray();
        char temp=' ';
        int num=0;
        for (int i = 0; i < s.length(); i++) {
            if (c[i]>= '0' && c[i]<= '9'){
               temp=c[i-1];

                while (c[i]>='0' && c[i]<= '9'){
                    num=(num*10)+(c[i]-48) ;
                    i++;
                    if (i==s.length()){
                        break;
                    }
                }
                for (int j = 0; j < num; j++) {
                    System.out.print(temp);
                }
            }
            num=0;
        }

    }
}
