package zohoremainingproblems;

import java.util.HashMap;
import java.util.Scanner;

public class NextGreaterMinimumElements {
    public static void main(String[] args) {
        new NextGreaterMinimumElements().init();
    }

    private void init() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        nextElements(a, n);
    }

    private void nextElements(int[] a, int n) {
        int max = Integer.MAX_VALUE, sum = 0,k=0;
        for (int i = 0; i < n; i++) {
                     max=a[i];
            for (int j = 0; j < n; j++) {
                    sum=a[j]-max;
                    if(sum>0 && i<n-1){
                        max=Math.min(sum,max);

                    }
            }
            System.out.println(a[i]+" > "+(a[i]+max));
        }

    }
}
