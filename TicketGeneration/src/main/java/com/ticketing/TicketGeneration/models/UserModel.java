package com.ticketing.TicketGeneration.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserModel {
    private String name;

    private String email;

    @NotEmpty(message = "Mobile number is mandatory")
    private String mobileNo;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
