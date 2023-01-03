package zohoset3;

import java.util.Arrays;
import java.util.Scanner;

public class SortOddEvenPos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        new SortOddEvenPos().sort(a);
        System.out.println(Arrays.toString(a));
    }

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // Element at even position, sort in ascending order
                for (int j = i + 2; j < arr.length; j += 2) {
                    if (arr[j] > arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            } else {
                // Element at odd position, sort in descending order
                for (int j = i + 2; j < arr.length; j += 2) {
                    if (arr[j] < arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        }
    }
}


