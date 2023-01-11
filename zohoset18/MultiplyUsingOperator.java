package zohoset18;

import java.util.Scanner;

public class MultiplyUsingOperator {
    public static void main(String[] args) {
    MultiplyUsingOperator multiplyUsingOperator=new MultiplyUsingOperator();
    multiplyUsingOperator.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        System.out.println( multiply(a,b));
    }
    private int  multiply(int a,int b){
        if (a==0 || b==0) return 0;
        if (b>0){
            return a+multiply(a,--b);
        }
        else{
            a=-a;
            b=-b;
            return multiply(a,b);
        }
    }
}
