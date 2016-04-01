package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Daniil Kornienko on 29.03.2016.
 */
public class SumMultipOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int Muiltip = 1;
        int k = 0;

        Scanner scan = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();

        while (scan.hasNext()) {
            nums.add(Integer.parseInt(scan.next()));


            int j = nums.get(k);
            sum += j;
            Muiltip *= j;
            k++;
            System.out.println("Your summation: " + sum);
            System.out.println("Your Multiplication: " + Muiltip);
        }
    }
}

