package com.oualid.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ClientTest {
    private Address firstAddress = new Address("address 1");
    private Address secondAddress = new Address("address 2");
    private final int EMPTY_LIST_SIZE = 0;
    private final int UNIQUE_ELEMENT_SIZE = 1;
    private Client newClient;
    private int addressSize = 0;

    @BeforeEach
    void setUps(){
        newClient = new Client();
        newClient.setId(1L);
        System.out.println("init new client");
    }

    @Test
    void afterCreationShouldHaveNoAddress(){
        addressSize = newClient.getAddressesSize();
        Assertions.assertThat(addressSize).isEqualTo(EMPTY_LIST_SIZE);
        System.out.println("afterCreationShouldHaveNoAddress test");
    }

    @Test
    void shouldAllowToAddAddress(){
        newClient.getAddresses().add(firstAddress);
        addressSize = newClient.getAddressesSize();
        Assertions.assertThat(addressSize).isEqualTo(UNIQUE_ELEMENT_SIZE);
        System.out.println("shouldAllowToAddAddress test");
    }
    @Test
    void shouldAllowToAddManyAddresses(){
        newClient.getAddresses().addAll(Arrays.asList(firstAddress,secondAddress));
        addressSize = newClient.getAddressesSize();
        Assertions.assertThat(addressSize).isGreaterThan(UNIQUE_ELEMENT_SIZE);
        System.out.println("shouldAllowToAddManyAddresses test");
    }
}
