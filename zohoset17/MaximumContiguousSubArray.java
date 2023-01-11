package zohoset17;

import java.util.Scanner;

public class MaximumContiguousSubArray {
    public static void main(String[] args) {
        MaximumContiguousSubArray subArray1=new MaximumContiguousSubArray();
        subArray1.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        subArray(a);
    }
    private void subArray(int[] arr){
        int sum=arr[0];int max=Integer.MIN_VALUE;int ans=0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if(sum<0) sum = 0;
            max = Math.max(sum,max);

        }
        System.out.println(max);
    }


}
