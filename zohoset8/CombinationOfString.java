package zohoset8;

import java.util.Scanner;

public class CombinationOfString {
    public static void main(String[] args) {
        CombinationOfString combinationOfString=new CombinationOfString();
        combinationOfString.init();
    }
    public void init(){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        perMutate(s,"");
    }
    private void perMutate(String s, String res){
        boolean[] alpha=new boolean[26];
        if (s.length()==0){
            System.out.println(res);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            String ros=s.substring(0,i)+s.substring(i+1);
            if (!alpha[ch - 'a'])
                perMutate(ros,res+ch);
            alpha[ch-'a']=true;
        }
    }
}
