package com.oualid.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MoneyIAETest {

    private final static String VALID_CURRENCY = "USD";

    @ParameterizedTest
    @ValueSource(ints = { -12387, -5, -1 })
    void constructorShouldThrowIAEForInvalidAmount(int invalidAmount){
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            new Money(invalidAmount,VALID_CURRENCY);
        });
    }
}
