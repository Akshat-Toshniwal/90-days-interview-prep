package java_basics;
import java.util.Scanner;
public class Armstrong {

    static boolean checkarm(int val){
        int sum = 0;
        int check = val;

        while(val != 0){
            int digit = val % 10;
            sum += digit*digit*digit;
            val /= 10;
        }

        return sum == check;
    }

    static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s1.nextInt();

        if(checkarm(num))
        {
            System.out.println("ArmStrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}
