package zohoset3;

import java.util.Scanner;

public class SearchSubString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        String sub=input.next();
        System.out.println(new SearchSubString().search(s,sub));
        System.out.println(new SearchSubString().searchNew(s,sub));
    }
    public int search(String s,String str){
        int m=str.length();
        int flag=0;
        for (int i = 0; i < s.length(); i++) {
            int count=1;
            if (s.charAt(i)==str.charAt(0)){
                int k=i;
                for (int j = 1; j < m; j++) {
                    if (s.charAt(++k)==str.charAt(j) && k<s.length()-1){
                        count++;
                    }
                    else {
                        break;
                    }
                }
                if(count==m){
                    return i;
                }
            }
        }
        return -1;
    }
    public int searchNew(String s,String  s1){
        int n=s.length();
        int m=s1.length();
        int j=0;
        for (int i = 0; i < n-m; i++) {
            for ( j = 0; j < m; j++) {
                if (s.charAt(i+j)!=s1.charAt(j)){
                    break;
                }
            }
            if (j==m){
                return i;
            }
        }
        return -1;
    }
}
