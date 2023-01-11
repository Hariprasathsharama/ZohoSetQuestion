package zohoset5;

import java.util.Scanner;

public class LargePrimeNumber {
    public static void main(String[] args) {
        LargePrimeNumber largePrimeNumber=new LargePrimeNumber();
        largePrimeNumber.init();
    }
    private void init(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(largePrimeNo(n));
    }
    private int largePrimeNo(int numDigits){
          // Number of digits in the desired prime number

// Start with the largest possible number with the given number of digits
        int num = (int)Math.pow(10, numDigits) - 1;

// Decrement the number until we find a prime number
        while (true) {
            // Check if the current number is prime
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, print it and break out of the loop
            if (isPrime) {
               return num;
            }

            // Decrement the number and continue the loop
            num--;
        }

    }
}
