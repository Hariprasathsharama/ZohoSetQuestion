package zohoset13;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterElement {
    public static void main(String[] args) {
     NextGreaterElement nextGreaterElement=new NextGreaterElement();
     nextGreaterElement.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        int[]res=nextGreater(a);
        System.out.println(Arrays.toString(res));
    }
    private int[] nextGreater(int[] a){
        int res[]=new int[a.length];
        int k=0;
        for (int i = 1; i < a.length; i++) {
            if (a[i]>a[i-1]){
                res[k++]=a[i];
            }
        }
        return res;
    }
}
