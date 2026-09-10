package java_basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumberFunction {

    static void PrimeFun(int val)
    {
        int check = 0;
        if(val > 0)
        {
            for(int i=2 ; i<val ; i++)
            {
                if(val % i == 0)
                {
                    check++;
                }
            }
        }

        if(check == 0){ System.out.println("Prime Number"); } else { System.out.println("Not a prime number");}
    }

    static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Value : ");
        int num = s1.nextInt();
        PrimeNumberFunction.PrimeFun(num);
    }
}
