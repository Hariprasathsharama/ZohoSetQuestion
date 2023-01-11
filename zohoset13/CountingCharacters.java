package zohoset13;

import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        CountingCharacters countingCharacters=new CountingCharacters();
        countingCharacters.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(count(n));
    }
    private int count(int n){
        int count=0,divide=9,i=1;
        while(n>divide){
            n-=divide;
            count+=i*divide;
            divide*=10;
            i++;
        }
        count+=i*n;
        return count;
    }
}
