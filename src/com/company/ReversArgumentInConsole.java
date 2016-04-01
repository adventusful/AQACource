package com.company;

/**
 * Created by Daniil Kornienko on 29.03.2016.
 */
public class ReversArgumentInConsole {
    public static void invertArg(String[] args) {
        int k = 0;
        String tmp;
        for (int i = 0; i < args.length; i++) {
            if (i >= args.length / 2) continue;
            tmp = args[k];
            args[k] = args[args.length - 1 - k];
            args[args.length - 1 - k] = tmp;
            k++;
        }

    }
}
