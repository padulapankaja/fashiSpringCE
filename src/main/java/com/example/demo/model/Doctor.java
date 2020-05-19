package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "doctoruser")
public class Doctor {
    @Id
    private String id;
    private String name;
    private String email;
    private String contact;
    private String password;
    private String salt;
    private String image;
    private String create_at ;



    public Doctor(String name, String email, String contact, String password, String salt, String create_at) {

        this.name = name;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.salt = salt;
        this.create_at = create_at;
    }

//    public Doctor(String id, String name, String email, String contact, String password, String salt, String create_at) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.contact = contact;
//        this.password = password;
//        this.salt = salt;
//        this.create_at = create_at;
//    }
//    public Doctor( String name, String email, String contact, String password, String salt, String create_at) {
//        this.name = name;
//        this.email = email;
//        this.contact = contact;
//        this.password = password;
//        this.salt = salt;
//        this.create_at = create_at;
//    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public String getImage() {
        return image;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }
}
