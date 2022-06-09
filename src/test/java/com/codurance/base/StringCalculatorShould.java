package com.codurance.base;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    @Test
    void return_0_if_string_is_empty() {
        final StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("");
        assertEquals(0, result);
    }

    @Test
    void return_1_if_string_exist_1() {
        final StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("1");
        assertEquals(1, result);
    }

    @Test
    void return_2_if_string_exist_2() {
        final StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("2");
        assertEquals(2, result);
    }

    @Test
    void return_3_if_string_exist_1_and_2() {
        final StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("1,2");
        assertEquals(3, result);
    }
}
