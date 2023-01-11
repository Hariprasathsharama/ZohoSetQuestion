package zohoset18;

import java.util.Scanner;

public class SumFromUnsortedArray {
    public static void main(String[] args) {
    SumFromUnsortedArray sum=new SumFromUnsortedArray();
    sum.init();
    }
    private void  init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a =new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        int n2=input.nextInt();
        Sum(a,n2);
    }
    private void Sum(int[] arr,int target){
        int  sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=target-arr[i];
            if(sum>0) {
                for (int j = i + 1; j < arr.length; j++) {
                  sum-=arr[j];
                    if (sum == 0){
                        System.out.println("{" + arr[i] +" "+arr[j]+ "}");
                        break;
                    }
                    if (sum<0)break;
                }
            }
            if (sum == 0) System.out.println("{" + arr[i] + "}");

        }
    }
}
