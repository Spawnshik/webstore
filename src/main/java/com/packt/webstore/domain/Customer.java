package com.packt.webstore.domain;

public class Customer {
    private String name;
    private String address;
    private String customerId;
    private int noOfOrdersMade = 0;

    public Customer() {
        super();
    }

    public Customer(String name, String address, String customerId) {

        this.name = name;
        this.address = address;
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setNoOfOrdersMade(int noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getNoOfOrdersMade() {
        return noOfOrdersMade;
    }


}
