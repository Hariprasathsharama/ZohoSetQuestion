package zohoset10;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class NumberFrequency {
    public static void main(String[] args) {
        NumberFrequency numberFrequency = new NumberFrequency();
        numberFrequency.init();
    }

    private void init() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] res = frequency(a);
        for (int i = 0; i < res.length; i++) {
            if (res[i]!=0) {
                System.out.println(a[i] + "-" + res[i]);
            }
        }
    }

    private int[] frequency(int[] a) {
        int length = a.length;
        int[] freqArr = new int[length];
        for (int i = 0; i < length; i++) {
            freqArr[i] = 1;
        }
        for (int i = 0; i < length; i++) {
            int count = 1;
            for (int j = i + 1; j < length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    freqArr[j] = 0;
                }
            }
            if (freqArr[i] != 0) {
                freqArr[i] = count;
            }
        }

        return freqArr;
    }
}
