package randompractice;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        new ReverseWords().init();
    }

    private void init() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = str.length();
        reverseWord(str, "", 0, n);

    }

    private void reverseWord(String s, String res, int i, int n) {
        if (i == n) {
            System.out.print(res + " ");
        } else if (s.charAt(i) == ' ') {
            reverseWord(s, "", i + 1, n);
            System.out.print(res+" ");
        } else reverseWord(s, res + s.charAt(i), i + 1, n);
    }
}

