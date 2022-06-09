package com.codurance.base;

import java.util.Arrays;

public class StringCalculator {

    public int add(String s) {
        if (s.isEmpty())
            return 0;

        return Arrays.stream(s.split(","))
                .mapToInt(Integer::valueOf)
                .sum();
    }
}
