package com.company;

import static com.company.ReversArgumentInConsole.invertArg;


public class Main {

    public static void main(String[] args) {
        int k = 0;
        invertArg(args);
        for (String i : args) {

            System.out.print(Integer.parseInt(args[k]) + "|");
            k++;
        }
    }
}
