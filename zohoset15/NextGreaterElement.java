package zohoset15;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        NextGreaterElement greaterElement=new NextGreaterElement();
        greaterElement.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
//        int[] a=new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i]= input.nextInt();
//        }
        int a[]={2, 3, 7, 1, 8, 5, 11};
        minimumOfNextElement(a);
    }
    private void minimumOfNextElement(int[] a){
        int[] temp=new int[a.length];
        int n=a.length;
        for (int i = 0; i < a.length; i++) {
            temp[i]=a[i];
        }
        Arrays.sort(temp);
        int[] ans=new int[n];
        for (int i = 0; i < a.length; i++) {
            if (a[i]==temp[n-1]){
                ans[i]=-1;
            }
            else{
                int l=0,r=n-1;
                while (l<=r){
                    int mid=(l+r)/2;
                    if (temp[mid]>a[i]){
                        r=mid-1;
                    }
                    if (temp[mid]<=a[i]){
                        l=mid+1;
                    }
                }
                ans[i]=temp[l];
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]+">"+ans[i]);
        }
    }

}
