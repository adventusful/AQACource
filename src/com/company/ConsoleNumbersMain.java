package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.ConsoleNumbers.minMax;
import static com.company.ConsoleNumbers.div3Or9;
import static com.company.ConsoleNumbers.oddNums;
import static com.company.ConsoleNumbers.evenNums;
import static com.company.ConsoleNumbers.div5And7;
import static com.company.ConsoleNumbers.happy;


/**
 * Created by Daniil Kornienko on 01.04.2016.
 */
public class ConsoleNumbersMain {
    public static void main(String[] args) {
        int sum = 0;
        int Muiltip = 1;
        int k = 0;
        int ns;
        Scanner scan = new Scanner(System.in);

        String strScan = scan.nextLine();
        String[] strAr = strScan.split(" ");


        int[] array = new int[strAr.length];
        for (int i = 0; i < strAr.length; i++) array[i] = Integer.parseInt(strAr[i]);

        happy(array);
        minMax(array);
        div3Or9(array);
        div5And7(array);
        evenNums(array);
        oddNums(array);


    }
}
