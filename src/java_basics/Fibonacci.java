package java_basics;

import java.util.Scanner;

public class Fibonacci
{
    static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int first = 0 , sec = 1;
        System.out.print("Enter Range : ");
        int range = s1.nextInt();

        System.out.print(first + " " + sec + " ");

        for(int i=2 ; i<=range ; i++)
        {
            int next = first + sec;
            System.out.print(next + " ");
            first = sec;
            sec = next;
        }
    }
}
