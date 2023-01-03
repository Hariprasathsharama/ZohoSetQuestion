package zohoset5;

import java.util.Scanner;

public class GroupNumbers {
        public static void main(String args[])
        {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the array size: ");
            int size = in.nextInt();

            int[] array = new int[size];
            int[] arrayb = new int[size];

            System.out.println("Enter the array elements :");
            for(int i=0; i<size; i++)
                array[i] = in.nextInt();

            System.out.println("Enter the x value :");
            int x = in.nextInt();

            int powerset_size = (int)Math.pow(2,size);
            int groups = 0;

            for(int counter = 0; counter < powerset_size; counter++)
            {
                int sum = 0,k = 0;
                for(int i=0; i < size; i++)
                {
                    int num =  counter & (1 << i);
                    if(num >= 1)
                    {
                        sum = sum + array[i];
                        arrayb[k] = array[i];
                        k++;
                    }
                }

                if(sum % x == 0)
                    if((k > 1) && (k <= (x)))
                    {
                        groups++;
                        for(int i=0; i<k; i++)
                            if(arrayb[i] != 0)
                                System.out.print(arrayb[i]+",");
                        System.out.println();
                    }
            }
            System.out.println("Number of groups in that array: "+groups);
        }
    }

