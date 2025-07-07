package com.oualid.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MoneyOneParamAnnotationTest {

    @ParameterizedTest
    @ValueSource(ints = {10,15,90})
    void constructorShouldSetAmountAndCurrency(int amount){
        Money money = new Money(amount,"USD");

        Assertions.assertThat(money.getAmount()).isEqualTo(amount);
    }
}
