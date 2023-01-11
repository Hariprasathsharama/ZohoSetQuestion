package zohoset12;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateSorting {
    public static void main(String[] args) {
        AlternateSorting alternateSorting=new AlternateSorting();
        alternateSorting.init();
    }
    private void  init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            a[i]= input.nextInt();
        }
        int[] res=sort(a);
        System.out.println(Arrays.toString(res));
    }
    private int[] sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (i%2==0 && a[i] <a[j]){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
                if (i%2==1 && a[i]>a[j]){
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                }
            }
        }
        return a;
    }
}
