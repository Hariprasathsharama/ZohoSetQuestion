package zohoset5;

import java.util.Scanner;

public class SumOfTwoArray {
    public static void calcSum(int[] a, int n, int[] b, int m) {
        int temp=0,l=0,o=0,carry=0;
        if (n>m){
            temp=n;
        }
        else {
            temp=m;
        }
        int[] res=new int[temp+1];
        for (int i = temp; i >=0 ; i--) {
            if (n-1>=0){
                l=a[n-1];
                n--;
            }
            else {
                l=0;
            }
            if (m-1>=0){
                o=b[m-1];
                m--;
            }
            else {
                o=0;
            }
            res[i]=(l+o+carry)%10;
            carry=(l+o+carry)/10;
            
        }
        if (res[0]!=0){
            System.out.print(res[0]+",");
        }
        for (int i = 1; i <temp+1 ; i++) {
            System.out.print(res[i]+",");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n1");
        int n1=in.nextInt();
        System.out.println("Enter n2");
        int n2=in.nextInt();
        int[] a=new int[n1];
        int[] b=new int[n2];
        System.out.println("Enter n1 one by one");
        for (int i = 0; i < n1; i++) {
            a[i]=in.nextInt();
        }
        System.out.println("Enter n2 one by one");
        for (int i = 0; i < n2; i++) {
            b[i]=in.nextInt();
        }
        calcSum(a,n1,b,n2);
    }
    }

