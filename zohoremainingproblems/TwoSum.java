package zohoremainingproblems;

import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        new TwoSum().init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no of element:");
        int n=input.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter values");
        for (int i = 0; i < n; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter target");
        int t=input.nextInt();
        if(checkSum(arr,t)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
//    private boolean checkSum(int[] a,int ans){
//        int i=0,j=0,k=0,n=a.length,sum=ans;
//        while (i<n){
//            sum=sum-a[k++];
//            if(sum==0)return true;
//            if(sum<0){
//              sum=ans;
//              i++;
//              k=i;
//            }
//        }
//        return false;
//    }
    private boolean checkSum(int[] a,int ans){
        HashSet<Integer>set=new HashSet<>();
        for (int j : a) {
            int sum = ans - j;
            if (set.contains(sum)) {
                return true;
            }
            set.add(j);
        }
        return false;
    }

}
