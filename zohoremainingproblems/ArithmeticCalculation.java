package zohoremainingproblems;

import java.util.Scanner;

public class ArithmeticCalculation {
    public static void main(String[] args) {
            new ArithmeticCalculation().init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        new ArithmeticCalculation().calculate(str);
    }
    private void calculate(String s){
        if(valid(s)){
            int operatorStart=s.length()/2+1;
            int temp=operatorStart;
            int numStart=0;
            int value1=s.charAt(numStart++)-'0';
            int value2=s.charAt(numStart)-'0';
            while (numStart<temp && operatorStart<s.length()){
                try{
                    value1=find(value1,value2,s.charAt(operatorStart++));
                    value2=s.charAt(++numStart)-'0';
                }
                catch (ArithmeticException e){
                    System.out.println("Cannot divide by 0");
                }
                catch (Exception e){
                    System.out.println("Invalid Input");
                }
            }
            System.out.println(value1);
        }
        else {
            System.out.println("String is invalid");
        }
    }
    private int find(int v1,int v2,char op){
        switch (op) {
            case '+' -> {
                return v1 + v2;
            }
            case '-' -> {
                return v1 - v2;
            }
            case '*' -> {
                return v1 * v2;
            }
            case '/' -> {
                if (v2 == 0) {
                    throw new ArithmeticException();
                }
                return v1 / v2;
            }
            case '%' -> {
                return v1 % v2;
            }
        }
        return 0;
    }
    private boolean valid(String s){
        if(s.length()==1 || s.length()%2==0){
            return false;
        }
        int len=s.length()/2;
        return s.charAt(len + 1) == '+' || s.charAt(len + 1) == '-' || s.charAt(len + 1) == '*' || s.charAt(len + 1) == '%';
    }
}
