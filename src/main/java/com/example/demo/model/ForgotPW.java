package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class ForgotPW {
    @Id
    private String id;
    private String name;
    private String address;
    private Double salary;

    public ForgotPW(String name, String address, Double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}
