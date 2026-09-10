package java_basics;

import java.util.Scanner;

public class SwitchBasic {
    static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Fruit -> ");
        String s = s1.nextLine();

        switch(s)
        {
            case "Mango" -> System.out.println("The fruit is of Yellow color");
            case "Apple" -> System.out.println("The fruit is of Red color");
            case "Orange" -> System.out.println("The fruit is of Orange color");
            case "Grape" -> System.out.println("The fruit is of Green color");
            default -> System.out.println("Invalid Value.");
        }
    }
}
