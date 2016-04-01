package com.company;

import java.util.Arrays;

/**
 * Created by Daniil Kornienko on 29.03.2016.
 */
public class ConsoleNumbers {
    public static void evenNums(int[] args) {

        for (int i = 0; i < args.length; i++) {
            int k = args[i];
            if (k % 2 == 0) System.out.println(args[i] + " Четное число ");

        }
    }

    public static void oddNums(int[] args) {
        for (int i = 0; i < args.length; i++) {
            int k = args[i];
            if (k % 2 == 0) continue;
            System.out.println(args[i] + " Нечетное число  ");

        }
    }

    public static void minMax(int[] args) {
        Arrays.sort(args);
        System.out.println("Min" + args[0]);
        System.out.println("Max" + args[args.length - 1]);
    }

    public static void div3Or9(int[] args) {
        for (int i = 0; i < args.length; i++) {
            int k = args[i];
            if (k % 3 == 0 | k % 9 == 0)
                System.out.println(args[i] + " Число делется на 3 или 9 ");

        }
    }

    public static void div5And7(int[] args) {
        for (int i = 0; i < args.length; i++) {
            int k = args[i];
            if (k % 5 == 0 & k % 7 == 0)
                System.out.print(args[i] + " Делятся на 5 и на 7 ");

        }
    }

   /* public static void thrNumsNoDuplicate(String[] args) {
          int[] nums = new int[] {123,543,789};
            Arrays.sort(nums);
    } */

    public static void happy(int[] args) {

        int k = args.length / 2;

        int tmp = 0;

        for (int i = 0; i < args.length; i++) {
            int s1 = 0;
            int s2 = 0;

            for (int j = 0; j < k; j++) {
                s1 += args[j];

            }
            for (int n = (args.length / 2); n < args.length; n++) {
                s2 += args[n];

            }
            if (s1 == s2) System.out.println(Arrays.toString(args));
            else {
                tmp = args[i];
                args[i] = args[args.length / 2];
                args[args.length / 2] = tmp;
            }

        }
    }


}

