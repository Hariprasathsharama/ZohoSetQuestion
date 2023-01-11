package zohoset12;

import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        BinaryAddition binaryAddition=new BinaryAddition();
        binaryAddition.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n1=input.nextInt();
        int n2=input.nextInt();
        int res=addBinaryNumber(n1,n2);
        System.out.print(res);
    }
    private int addBinaryNumber(int n1,int n2){
        int digit1=0,digit2=0,carry=0,sum=0,i=1,ans=0;
        while (n1>0 || n2>0){
            digit1=(n1>0)?n1%10:0;
            n1=n1/10;
            digit2=(n2>0)?n2%10:0;
            n2=n2/10;
            sum=digit1+digit2+carry;
            carry=sum/2;
            ans=(sum%2)*i+ans;
            i*=10;
        }
        digit2=(n1>0)?n1%10:0;
        digit2=(n2>0)?n2%10:0;
        sum=digit1+digit2+carry;
        ans=(sum%2)*i+ans;
        return ans;
    }

}
