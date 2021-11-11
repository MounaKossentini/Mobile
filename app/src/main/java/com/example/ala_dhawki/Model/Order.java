package com.example.ala_dhawki.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "orderr")
public class Order {
    @PrimaryKey(autoGenerate = true)
    private int id;


    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "address")
    private String address;

    @ColumnInfo(name = "phone")
    private int phone;

    @ColumnInfo(name = "payment")
    private String payment;

    @ColumnInfo(name = "price")
    private int price;

    @ColumnInfo(name = "category")
    private String category;

    @ColumnInfo(name = "picture")
    private int picture;

    @ColumnInfo(name = "description")
    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPayment() {
        return payment;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Order(){}

    public Order( String name, String address, int phone, String payment) {

        this.name = name;
        this.address = address;
        this.phone = phone;
        this.payment = payment;
    }

    public Order( String name, int price, int picture, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.description = description;
    }

    public Order(String name, String address, int phone, String payment, int price, String category, int picture, String description) {

        this.name = name;
        this.address = address;
        this.phone = phone;
        this.payment = payment;
        this.price = price;
        this.category = category;
        this.picture = picture;
        this.description = description;
    }



}
