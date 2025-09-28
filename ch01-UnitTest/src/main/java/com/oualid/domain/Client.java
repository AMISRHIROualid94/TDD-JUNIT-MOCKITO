package com.oualid.domain;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private Long id;
    List<Address> addresses = new ArrayList<>();

    public Client(){

    }

    public Client(Long id, List<Address> addresses) {
        this.id = id;
        this.addresses = addresses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    public int getAddressesSize(){
        return this.getAddresses().size();
    }
}
