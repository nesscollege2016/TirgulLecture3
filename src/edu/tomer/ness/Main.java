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

        //if num1 > num2 swap
        if (num1 > num2){
            //need to swap
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        //if num2 > num3 swap
        if (num2 > num3){
            //need to swap
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        //if num1 > num2 swap
        if (num1 > num2){
            //need to swap
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println(num1 + ", " + num2 + ", " + num3);

    }
}
