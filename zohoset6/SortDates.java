package zohoset6;

import java.util.Scanner;

public class SortDates {
    public static void main(String[] args) {
        SortDates sortDates=new SortDates();
        sortDates.init();
    }
    private void init(){
        int[][] arr={{19,3,2001},{18,3,2001},{30,5,1997}};
        sort(arr,arr.length);
    }
    private void sort(int[][] arr,int n){
        sortUtil(arr,n,0);
        sortUtil(arr,n,1);
        sortUtil(arr,n,2);
    }
    private void sortUtil(int[][] arr,int n,int a){

    }
}
