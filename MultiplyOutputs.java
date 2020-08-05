package com.codewithjeff;
import java.util.Scanner;


public class MultiplyOutputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = in.nextInt();

        System.out.println("Enter a second number");
        int num2 = in.nextInt();

        System.out.println("The product of your 2 numbers is " + (num1 * num2));

//        int a = fetch.nextInt();
//        System.out.println("You entered number " + a);
//        int b = fetch.nextInt();
//        System.out.println("You entered a second number of " + b);
//        int result = ( a * b);
//        System.out.println("The product of these 2 numbers is " + result);


    }
}
