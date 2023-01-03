package zohoset2;

import java.util.Scanner;

public class AlternateSorting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        new AlternateSorting().alterSort(a);
    }
    public  void alterSort(int[] a){
        sort(a);
        int[] result=new int[a.length];
        int left=0;
        int right=a.length-1;
        for (int i = 0; i < a.length; i++) {
            if(i%2==0){
                result[i]=a[right--];
            }
            else {
                result[i]=a[left++];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                    if(a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
            }
        }
        return a;
    }

}
