package zohoset14;

import java.util.Scanner;

public class MonoDigitNumber {
    public static void main(String[] args) {
        MonoDigitNumber monoDigitNumber=new MonoDigitNumber();
        monoDigitNumber.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        convertMono(s.toCharArray());
    }
    private void convertMono(char[] ch){
        int value=ch[0]-'0';
        int num=0;
        boolean flag=false;
        for (int i = 1; i < ch.length; i++) {
            flag=false;
            if (ch[i]==value){
                num=num*10+value;
                flag=true;
            }
            else if(i+1<ch.length){
                if(operation(ch[i]-'0',ch[i+1]-'0','+')==value){
                    num=num*10+value;
                    flag=true;
                    i++;
                }
                if(operation(ch[i]-'0',ch[i+1]-'0','-')==value){
                    num=num*10+value;
                    flag=true;
                    i++;
                }

            }

        }
        if (flag) System.out.println("MonoDigit number");
        else System.out.println("Not a mono digit number");

    }
    private int operation(int a,int b,char op){
        int total=0;
      switch (op){
          case '+': total=a + b;
                    break;
          case '-':total=a-b;
          break;
      }
      total= (total<0) ? -1*total:total;
      return total;
    }

}
