package zohoset6;

import java.util.Arrays;

public class SortDates2 {
    public static void main(String[] args) {
            SortDates2 sortDates=new SortDates2();
            sortDates.init();
    }
    public void init(){
        int[][] arr={{19,3,2001},{18,3,2001},{30,5,2097}};
        int  n=arr.length;
        sort(arr,n);
        System.out.println(Arrays.deepToString(arr));
    }
    private void sort(int[][] dates,int n){
        for (int i = 0; i < n - 1; i++) {
            int mark=i;
            int[] min=dates[i];
            for (int j = i+1; j < n; j++) {
                if (min[2]>=dates[j][2]){
                    if (min[2]==dates[j][2]){
                        if (min[1]>=dates[j][1]){
                            if (min[i]==dates[j][1]){
                                if (min[0]>dates[j][0]){
                                    min=dates[j];
                                    mark=j;
                                }
                            }
                            else {
                                min=dates[j];
                                mark=j;
                            }
                        }
                    }
                    else {
                        min=dates[j];
                        mark=j;
                    }
                }
            }
            dates[mark]=dates[i];
            dates[i]=min;
        }
    }
    private void split(){

    }
}
