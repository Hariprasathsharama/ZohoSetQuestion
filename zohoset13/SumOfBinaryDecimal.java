package zohoset13;
import  java.util.*;
public class SumOfBinaryDecimal {
    public static void main(String args[]){
        SumOfBinaryDecimal sob=new SumOfBinaryDecimal();
        sob.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int max=max(n);
        binary(max,n);
    }
    private int max(int n){
        int max=0;
        while(n>0){
            if(max<n%10){
                max=n%10;
            }
            n=n/10;
        }
        return max;
    }
    private void binary(int max,int number){
        int digit = 0, n = number, temp = 0, k = 1, answer = 0;
        while (max > 0) {
            temp = 0;
            k = 1;
            answer = 0;
            while (n > 0) {
                digit = n % 10;
                if (digit == 0) {
                    answer = digit * k + answer;
                } else if (digit > 0) {
                    answer = 1 * k + answer;
                    digit -= 1;
                }
                temp = digit * k + temp;
                k *= 10;
                n /= 10;
            }
            n = temp;
            System.out.println(answer);
            max--;
        }
    }

}
