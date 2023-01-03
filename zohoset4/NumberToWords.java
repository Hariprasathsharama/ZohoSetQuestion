package zohoset4;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(numberToWords(n));
    }
    public static String  numberToWords(int n){
        String[] ones={"","one","two","three","four","five","six","seven","eight","nine"};
        String[] teens={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};

        String result="";
        int number=n/100;
        if (number>0){
            result+=ones[number]+" "+"hundred"+" "+"and"+" ";
        }
        number=n%100;
        if(number<20){
            result+=teens[number-10];
        }
        else {
            result+=tens[number/10]+" "+ones[number%10];
        }
        return result;
    }
}
