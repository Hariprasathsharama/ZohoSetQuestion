package zohoset1;

import java.util.Scanner;

public class SortWeight {

    private   int sqrt(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i==0 && i*i==n)return i;
        }
        return 0;
    }
    private   int  Weight(int[] a){
        int len=a.length;
        int[] weight=new int[len+1];
        int k=0;
        for (int i = 0; i < len; i++) {
            int sum=0;
            if(sqrt(a[i])!=0){
                sum+=5;
            }
            if(a[i]%4==0 && a[i]%6==0){
                sum+=4;
            }
            if(a[i]%2==0){
                sum+=3;
            }
            weight[k++]=sum;
        }
        new SortWeight().sort(weight,len,a);
        return 0;
    }
    private void sort(int[] w,int n,int[] arr){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (w[i] > w[j]) {
                    int temp = w[i];
                    w[i] = w[j];
                    w[j] = temp;

                    int temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
                System.out.println(arr[i]+" "+w[i]);
            }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=input.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        new SortWeight().Weight(arr);

    }
}

