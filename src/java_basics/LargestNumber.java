// Largest Number from three values

package java_basics;
import java.util.Scanner;

public class LargestNumber {
    public static void main() {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int num1 = s1.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = s1.nextInt();
        System.out.print("Enter Number 3 : ");
        int num3 = s1.nextInt();

        if (num1 < 0 || num2 < 0 || num3 < 0)
        {
            System.out.println("Negative values is not Allowed");
        }
        else
        {
            if (num1 > num2 && num1 > num3)
            {
                System.out.println(num1 + " is the Largest");
            }
            else if (num2 > num1 && num2 > num3)
            {
                System.out.println(num2 + " is the Largest");
            }
            else
            {
                System.out.println(num3 + " is the Largest");
            }
        }
    }
}
