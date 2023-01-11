package zohoset18;

import java.util.Scanner;

public class CheckTwoSum {
    public static void main(String[] args) {
        CheckTwoSum checkTwoSum=new CheckTwoSum();
        checkTwoSum.init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        int n2=input.nextInt();
        if (twoSum(a,n2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    private boolean twoSum(int[]a ,int target){
        int i=0,sum=a[0],j=0,k=0;
        while (i<a.length){
            if(k<a.length) {
                sum = target - a[k++];
            }
                if (sum == 0) {
                    return true;
                }
                if (sum < 0) {
                    j++;
                    sum = 0;
                    i=j-i;
                }
            i++;
            }
        return false;
    }
}
