package zohoset14;

import java.util.Scanner;

public class CombinationOfPermutation {
    public static void main(String[] args) {
        CombinationOfPermutation combinationOfPermutation=new CombinationOfPermutation();
        combinationOfPermutation.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        String str=input.next();
        for (int range = 1; range <= str.length(); range++) {
            findAllCombination(str.toCharArray(),"",0,0,range);
        }
    }
    private void findAllCombination(char[] ch,String ans,int start,int index,int range){
        int n=ch.length;
        if (index==range){
          permutation(ans.toCharArray(),0);
        }
        String value="";
        for (int i = start; i < n; i++) {
            value=ans+ch[i];
            findAllCombination(ch,value,i+1,index+1,range);
        }
    }
    private void permutation(char[] c,int index){
        int n=c.length;
        if (index==n){
            printArray(c);
            return;
        }
        for (int i = index; i < n; i++) {
            swap(c,i,index);
            permutation(c,index+1);
            swap(c,i,index);

        }
    }
    private void swap(char[] c,int start,int end){
        char temp=c[start];
        c[start]=c[end];
        c[end]=temp;
    }
    private void printArray(char[] c){
        for(char i:c) {
            System.out.print(i);
        }
        System.out.println();
    }

}
