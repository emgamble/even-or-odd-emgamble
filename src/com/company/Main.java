package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner numReader = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int a = numReader.nextInt();
        if (a % 2 == 0)
            System.out.println("The Integer " + a + " is even");
        else
            System.out.println("The Integer " + a + " is odd");





    }
}
