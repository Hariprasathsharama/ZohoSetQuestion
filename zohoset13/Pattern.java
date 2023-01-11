package zohoset13;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
     Pattern pattern=new Pattern();
     pattern.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        pattern(n);
    }
    private void pattern(int n){
        int c=0;
        for (int i = 1; i <= n; i++) {
            if(i<=n/2) {
                c = i;
            }
            else {c=2*n-i;}
            for (int j = 1; j < c; j++) {
                System.out.print(n-j+1);
            }
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(n-c+1);
            }
            for (int j = c; j >1; j--) {
                System.out.print(n-j+2);
            }
            System.out.println();
        }
    }
}
