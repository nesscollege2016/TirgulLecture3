package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //init the scanner:
        Scanner scanner = new Scanner(System.in);
        float tipAmount;
        //input the bill amount:
        System.out.println("Enter the bill amount:");
        float billAmount = scanner.nextFloat();

        //input the tip percentage:
        System.out.println("Enter the tip Percentage:");
        float tipPercentage = scanner.nextFloat();

        if (billAmount > 200) {
            tipAmount = billAmount * (tipPercentage - 2) / 100;
            System.out.println("The Tip Amount is: " + tipAmount);
        }
        else if (billAmount > 100){
            tipAmount = billAmount * (tipPercentage - 1) / 100;
            System.out.println("The Tip Amount is: " + tipAmount);
        }
        else {
            tipAmount = billAmount * tipPercentage / 100;
            System.out.println("The Tip Amount is: " + tipAmount);
        }
    }
}
