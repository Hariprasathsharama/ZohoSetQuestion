package zohoset8;

import java.util.Scanner;

public class MisMatchedArray {
    public static void main(String[] args) {
        MisMatchedArray misMatchedArray=new MisMatchedArray();
        misMatchedArray.init();
    }
    private void  init(){
        Scanner in=new Scanner(System.in);
        String s1= in.next();
        String s2=in.next();
        misMatch(s1,s2);
    }
    private void  misMatch(String s1,String s2){
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)!=s2.charAt(i)){
                System.out.println(s1.charAt(i)+" "+s2.charAt(i));
            }
        }
    }
}
