package zohoremainingproblems;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfPairs {
    public static void main(String[] args) {
        new SumOfPairs().init();
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
        checkSum(arr,t);
    }
    private  void checkSum(int[] a,int t){
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            sum=t-a[i];
            if (map.containsKey(sum)){
                System.out.println(a[map.get(sum)]+" "+","+a[i]);
            }
            map.put(a[i],i);
        }
    }
}
