package zohoset3;

import java.util.Scanner;

public class ReverseArrayUsingRecursion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        String temp = "";
        reverse(s,"",0,len);
    }
    public static void reverse(String s, String temp, int i, int len)
    {
        if(i==len)
        {
            System.out.print(temp+" ");
        }
        else if(s.charAt(i) == ' ')
        {
            reverse(s,"",i+1,len);
            System.out.print(temp+" ");
        }
        else
        {
            reverse(s,temp+s.charAt(i),i+1,len);
        }
    }
}
