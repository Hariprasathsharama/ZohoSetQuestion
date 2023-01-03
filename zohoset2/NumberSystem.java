package zohoset2;

import java.util.Scanner;

public class NumberSystem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[100];
        a[0]=3;
        a[1]=4;
        int c=2;
        for (int i = 0; i < n; i++) {
            a[i+c]=a[i]*10+3;
            c++;
            a[i+c]=a[i]*10+4;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
