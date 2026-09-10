package java_basics;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class NestedSwitch {
    static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Value = ");
        int num = s1.nextInt();
        System.out.print("Department = ");
        int department = s1.nextInt();

        switch(num)
        {
            case 1 -> System.out.println("Akshat Toshniwal");
            case 2 -> System.out.println("Akshat");
            case 3 -> System.out.println("Toshniwal");

            case 4 ->
            {
                System.out.println("New data");
                    switch (department) {
                case 1 -> System.out.println("New Employee");
                case 2 -> System.out.println("Not good");
                default -> System.out.println("Invalid Department");
            }
            }

            default -> System.out.println("Invalid value");
        }
    }
}