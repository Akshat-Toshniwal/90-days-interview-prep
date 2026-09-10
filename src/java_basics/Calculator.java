package java_basics;

import java.util.Scanner;

public class Calculator
{
    static void main(String[] args)
    {
        int num1 , num2;
        char ch , check ;
        Scanner s1 = new Scanner(System.in);

        while(true)
        {
                System.out.print("Enter Number 1 : ");
                num1 = s1.nextInt();
                System.out.print("Enter Number 2 : ");
                num2 = s1.nextInt();

                System.out.print("Enter Operator : ");
                ch = s1.next().charAt(0);

                if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
                {
                    if(ch == '+')
                    {
                        System.out.println("The Addition is "+(num1 + num2) + "\n");
                    }
                    else if(ch == '-')
                    {
                        System.out.println("The Subtraction is "+(num1 - num2) + "\n");
                    }
                    else if(ch == '*')
                    {
                        System.out.println("The Multiplication is "+(num1 * num2) + "\n");
                    }
                    else
                    {
                        if(num1 != 0 && num2 != 0 && num1 > num2)
                        {
                            System.out.println("The Division is "+(num1 / num2) + "\n");
                        }
                        else
                        {
                            System.out.println("Invalid Value\n");
                        }
                    }
                }
                else
                {
                    System.out.println("Invaild Operator ( + , - , * , / )\n");
                }

            System.out.print("For Exit = x or X\nOr press any Key to Continue\nContinue Or Exit : ");
            check = s1.next().charAt(0);
            System.out.println();
            if(check == 'x' || check == 'X')
            {
                break;
            }
        }
    }
}
