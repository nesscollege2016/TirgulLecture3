package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //init the scanner:
        Scanner scanner = new Scanner(System.in);

        //input num1:
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        //input num2:
        System.out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();

        //input num3:
        System.out.println("Enter the 3rd number:");
        int num3 = scanner.nextInt();

        //Test increasing order, Decreasing order, or no order
        if ((num3>num2) &&(num2 > num1))
            System.out.println("Increasing Order");
        else if ((num3<num2)&&(num2<num1))
            System.out.println("Decreasing Order");
        else
            System.out.println("Not Ordered");
    }
}
