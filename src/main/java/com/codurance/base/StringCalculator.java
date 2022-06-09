package com.codurance.base;

public class StringCalculator {

    public int add(String s) {
        if (s.isEmpty())
            return 0;

        if(s.equals("1"))
            return 1;

        if(s.equals("2"))
            return 2;

        return -1;
    }
}
