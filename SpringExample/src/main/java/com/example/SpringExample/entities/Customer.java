package com.example.SpringExample.entities;

import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custid;
    private String companyname;

    private String address;
    private String city;

    public Customer(){}

    public Customer(int custid, String companyname, String addres, String city) {
        this.custid = custid;
        this.companyname = companyname;
        this.address = addres;
        this.city = city;
    }

    public int getCustid() {
        return custid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }
}
