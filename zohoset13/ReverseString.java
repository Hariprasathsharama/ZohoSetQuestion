package zohoset13;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
    ReverseString reverseString=new ReverseString();
    reverseString.init();
    }
    private void  init(){
        Scanner input=new Scanner(System.in);
        String s=input.next();

        char[] res=(reverseString(s.toCharArray()));
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
    private char[]  reverseString(char[] c){
        int k=0;
        char ch[]=new char[c.length];
        for (int i = 0; i < c.length; i++) {
            if (c[i]>='a' && c[i]<='z'|| c[i]>='A' && c[i]<='Z' || c[i]==' '){
                ch[k++]=c[i];
            }
        }
        reverse(ch,0,k);
        k=0;
        for (int i = 0; i < c.length; i++) {
            if (c[i]>='a' && c[i]<='z'|| c[i]>='A' && c[i]<='Z'|| c[i]==' '){
                c[i]=ch[k++];
            }
        }
    return c;
    }
    private void reverse(char ch[],int i,int n){
        for (int j = i; j <n/2 ; j++) {
            char temp=ch[j];
            ch[j]=ch[n-j-1];
            ch[n-1-1]=temp;
        }
    }
}
