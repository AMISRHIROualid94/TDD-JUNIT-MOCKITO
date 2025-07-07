package com.oualid.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyOneParamAnnotationTest {

    @ParameterizedTest
    @ValueSource(ints = {10,15,90})//single param
    void constructorShouldSetAmountAndCurrency(int amount){
        Money money = new Money(amount,"USD");
        assertThat(money.getAmount()).isEqualTo(amount);
    }

    @ParameterizedTest
    @CsvSource({
            "10, USD",
            "15, DH",
            "90, EUR"
    })
    void constructorShouldSetAmountAndCurrency(int amount,String concurrency){
        Money money = new Money(amount,concurrency);

        assertThat(money.getAmount()).isEqualTo(amount);
        assertThat(money.getCurrency()).isEqualTo(concurrency);
    }
}
