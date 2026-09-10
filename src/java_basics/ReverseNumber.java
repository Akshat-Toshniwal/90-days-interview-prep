package java_basics;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        int rev = 0;

        System.out.print("Enter Number : ");
        int num = s1.nextInt();

        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("The Reverse is " + rev);
    }

}
