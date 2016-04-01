package com.company;

import java.util.Scanner;

/**
 * Created by Daniil Kornienko on 29.03.2016.
 */
public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Write your name and press <Enter>");

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hi " + name);

    }

}
