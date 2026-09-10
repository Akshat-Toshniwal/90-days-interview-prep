package java_basics;

import java.util.Scanner;

public class NumberOccurrences
{
    static void main()
    {
        int find , count = 0 ;
        long check ,  num = 5546876154634123L ;
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter Number to Find : ");
        find = s1.nextInt();

        while (num != 0)
        {
            check = num % 10;
            if(check == find)
            {
                count++;
            }
            num = num / 10;
        }
        System.out.println(find + " Occurred " + count + " times.");
    }
}
