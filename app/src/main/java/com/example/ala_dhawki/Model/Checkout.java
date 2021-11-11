package com.example.ala_dhawki.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "checkout")
public class Checkout {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "telephone")
    private int telephone;

    @ColumnInfo(name = "card")
    private int card;

    @ColumnInfo(name = "date")
    private String date;

    @ColumnInfo(name = "city")
    private String city;

    @ColumnInfo(name = "code")
    private int code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Checkout() {
    }

    public Checkout(int id, String email, int telephone, int card, String date, String city, int code) {
        this.id = id;
        this.email = email;
        this.telephone = telephone;
        this.card = card;
        this.date = date;
        this.city = city;
        this.code = code;
    }

    public Checkout(String email, int telephone, int card, String date, String city, int code) {
        this.email = email;
        this.telephone = telephone;
        this.card = card;
        this.date = date;
        this.city = city;
        this.code = code;
    }

    public Checkout(String email, int telephone, int card,  String city, int code) {
        this.email = email;
        this.telephone = telephone;
        this.card = card;
        this.city = city;
        this.code = code;
    }
}
