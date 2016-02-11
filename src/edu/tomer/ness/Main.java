package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //init the scanner:
        Scanner scanner = new Scanner(System.in);

        //input the radius:
        System.out.println("Enter the circle's radius:");
        double radius = scanner.nextDouble();

        //calculate and print the Area of the circle:
        double area = 3.14 * (radius * radius);
        System.out.println("The area is: " + area);

        if (area > 10)
            System.out.println("The area is Larger than 10");
    }
}
