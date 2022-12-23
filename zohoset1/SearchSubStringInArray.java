package zohoset1;

import java.util.Scanner;

public class SearchSubStringInArray{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s1=input.next();
        String s2=input.next();
        int count=0,flag=0;
        int n=(int)Math.sqrt(s1.length())+1;
        int m=s2.length();
        int a=0;
        char[][] c=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a<s1.length()){
                    c[i][j]=s1.charAt(a);
                    a++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n-m; j++) {
                count=1;
                if(c[i][j]==s2.charAt(0)){
                    for (int k = 1; k < m; k++) {
                        if(c[i][k]==s2.charAt(k)){
                            count++;
                        }
                        else{
                            break;
                        }
                    }
                    if (count==m){
                        flag=1;
                        System.out.println("Start index:"+"<"+i+","+j+">");
                        System.out.println("Start index:"+"<"+i+","+(j+m)+">");
                    }
                }
            }
        }
        if(flag==0){
            for (int j = 0; j < n; j++) {
                for (int i = 0; i <= n-m; i++) {
                    count=1;
                    if(c[i][j]==s2.charAt(0)){
                        for (int k = 1; k < m; k++) {
                            if(c[i+k][j]==s2.charAt(k)){
                                count++;
                            }
                            else {
                                break;
                            }
                        }
                        if(count==m){
                            System.out.println("Start index:"+"<"+(i)+","+j+">");
                            System.out.println("Start index:"+"<"+(i+m-1)+","+j+">");
                        }
                    }
                }
            }
        }
    }
}