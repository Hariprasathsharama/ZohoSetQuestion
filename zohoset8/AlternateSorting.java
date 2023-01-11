package zohoset8;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateSorting {
    public static void main(String[] args) {
        AlternateSorting alternateSorting = new AlternateSorting();
        alternateSorting.init();
    }

    private void init() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(sort(a)));
    }

    private int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i % 2 == 0 && arr[i] < arr[j]) {
                    arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
                } else if (i % 2 == 1 && arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j] - (arr[j] = arr[i]);
                }
            }
        }
        return arr;
    }
}
