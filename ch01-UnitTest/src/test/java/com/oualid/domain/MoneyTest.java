package com.oualid.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {

    @Test
    void constructorShouldSetAmountAndCurrency(){
        Money money = new Money(10,"USD");

       assertThat(money.getAmount()).isEqualTo(10);
       assertThat(money.getCurrency()).isEqualTo("USD");
    }

}
