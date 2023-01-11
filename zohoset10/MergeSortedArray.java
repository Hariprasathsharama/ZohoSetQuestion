package zohoset10;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray=new MergeSortedArray();
        mergeSortedArray.init();
    }
    private void  init(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i]=in.nextInt();
        }
        mergeSort(a,b);

    }
    private void mergeSort(int[]a, int[]b){
        int n=0;
        if (a.length>b.length){
            n=a.length;
        }
        else {
            n=b.length;
        }
        int res[]=new int[n];
        int k=0;
        for(int i:a){
            if (find(i,res)){
                res[k++]=i;
            }
        }
        for(int i:b){
            if (find(i,res)){
                res[k++]=i;
            }
        }
        System.out.println(Arrays.toString(res));

    }
    private boolean find(int a,int[] res ){
        for(int i:res){
            if (i==a)return false;
        }
        return true;
    }
}
