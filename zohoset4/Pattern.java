package zohoset4;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        String row="1";
        for (int i = 0; i < n; i++) {
            String nextRow="";
            int j=0;
            while (j<row.length()){
                char c=row.charAt(j);
                int count=1;
                if (j+1<row.length() && row.charAt(j+1)==c ){
                    count++;
                    j++;
                }
                nextRow+=count+""+c;
                j++;
            }
            System.out.println(row);
            row=nextRow;
        }
    }
}
