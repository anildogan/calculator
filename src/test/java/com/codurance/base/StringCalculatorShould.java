package com.codurance.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StringCalculatorShould {

    @Test
    void return_0_if_string_is_empty() {
        final StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("");
        assertEquals(0, result);
    }
}
