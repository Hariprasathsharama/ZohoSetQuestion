package zohoset12;

import java.util.Scanner;

public class ArrayAndThreshold {
    public static void main(String[] args) {
    ArrayAndThreshold arrayAndThreshold=new ArrayAndThreshold();
    arrayAndThreshold.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n");
        int n=input.nextInt();
        System.out.println("Enter k");
        int k=input.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        System.out.println(totalValue(a,k));
    }
    private int totalValue(int[]a,int t){
        int i=0,sum=0;
        while (i<a.length){
            int n=a[i];
            int count=0;
            while (n>0){
                count++;
                n=n-t;
            }
            sum+=count;
            i++;
        }
        return sum;
    }
}
