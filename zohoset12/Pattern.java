package zohoset12;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.init();
    }

    private void init() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern(n);
    }

    private void pattern(int n) {
        int k = 0, value = 1, temp = 0;
        for (int i = 0; i < n; i++) {
            k=value++;
            temp=n;
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(k+" ");
                k+=temp;
                temp--;
            }
            System.out.println();
        }
    }
}
