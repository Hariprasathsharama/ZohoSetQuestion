package zohoset4;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class SortNumberUsingFactors {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        int[] res=sort(a);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sort(int[] a){
        int count=0,k=0,j=1;
        int arr[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            count=0;
            for (int l = 1; l <= a[i]/2; l++) {
                if (a[i]%l==0){
                    count++;
                }
            }
            arr[k++]=count;
        }
        for (int i = 0; i < a.length; i++) {
            for ( j = i+1; j < a.length; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                    int temp2=a[i];
                    a[i]=a[j];
                    a[j]=temp2;
                }
            }
        }
        return a;
    }
}
