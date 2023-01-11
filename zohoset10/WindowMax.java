package zohoset10;

import java.util.Arrays;
import java.util.Scanner;

public class WindowMax {
    public static void main(String[] args) {
        WindowMax windowMax=new WindowMax();
        windowMax.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n");
        int n=input.nextInt();
        int [] a=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++)a[i]=input.nextInt();
        System.out.println("Enter k");
        int k=input.nextInt();
        Max(a,k);
    }
    private void Max(int[] a,int k){
        int[] res=new int[a.length-k+1];
        int max=0,i=0,count=0,j=0,l=0;
        while (i<=a.length-k){
            if (count==k){
                res[l++]=max;
                count=0;
                max=0;
                i++;
                j=i;
            }
            else{
                count++;
                if (max<a[j])max=a[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
