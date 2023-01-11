package zohoset17;
import  java.util.*;
public class StringPattern {
    public static void main(String args[]){
        StringPattern pattern=new StringPattern();
        pattern.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        pattern(s);
    }
    private void pattern(String s){
        int k=s.length()/2;int c=0;
        int n=s.length();
        String res="";
        for(int i=0;i<s.length();i++){
            if(i<=k)c=k+i;
            else c=i-k-1;
            for(int j=s.length()-1;j>i;j--){
                System.out.print("  ");
            }
            for (int j = 1; j <=1 ; j++) {
                res+=s.charAt(c);
                System.out.print(res);
            }
            System.out.println();
        }
    }
}
