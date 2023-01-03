package zohoset6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Timing {
    public static void main(String[] args) {
        Timing obj=new Timing();
        obj.init();
    }
    public void init() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = input.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];
        int i;
        for (i = 0; i < size; i++) {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
        }
        System.out.print("Count="+" "+countPlatform(a,b));
    }

    public int countPlatform(int[] arr,int[] dep){
        int platform = 1;

        for (int i = 1; i < arr.length; i++) {
            int arrTime = arr[i];
            int count = platform;
            for (int j = i - 1; j >= 0; j--) {
                if (dep[j] > arrTime) count--;
                else if (count <= 0) {
                    platform++;
                    break;
                }
            }
        }
        return platform;
    }
}
