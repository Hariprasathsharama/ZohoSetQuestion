package zohoset8;
import  java.util.*;
public class SpiralPrinting {
    public static void main(String[] args) {
        SpiralPrinting spiralPrinting=new SpiralPrinting();
        spiralPrinting.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        pattern(n);
    }
    private void pattern(int n){
        int c=0;
        for (int i = 1; i <= 2*n-1; i++) {
            if (i<=n)c=i;
            else c=2*n-i;
            for (int j = 1; j <c ; j++) {
                System.out.print(n-j+1);
            }
            for (int j = 1; j <= 2 * (n - c) + 1; j++) {
                System.out.print(n-c+1);
            }
            for (int j = c; j >1; j--) {
                System.out.print(n-j+2);
            }
            System.out.println();
        }
    }

}
