package zohoset14;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        PermutationOfString permutationOfString=new PermutationOfString();
        permutationOfString.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String str=input.next();
        permutation(str,0,"");
    }
    private void permutation(String s, int k, String res){
     if (s.length()==0){
         System.out.println(res);
     }
     else{
         for (int i = 0; i < s.length(); i++) {
             permutation(s.substring(0,i),i+1,res+=s.substring(0,i));
         }
     }
    }
}
