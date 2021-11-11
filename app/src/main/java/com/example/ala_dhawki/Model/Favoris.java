package com.example.ala_dhawki.Model;


import android.graphics.Bitmap;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "favoris")
public class Favoris {

    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }

    @ColumnInfo(name = "price")
    private String price;

    @ColumnInfo(name = "category")
    private String category;

    @ColumnInfo(name = "picture")
    private int picture;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "name")
    private String name;



    public void setId(int id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Favoris()
    {
    }

    public Favoris(int id, String price, String category, int picture, String description, String name) {
        this.id = id;
        this.price = price;
        this.category = category;
        this.picture = picture;
        this.description = description;
        this.name = name;
    }

    public Favoris(int id, String price, int picture, String description, String name) {
        this.id = id;
        this.price = price;
        this.picture = picture;
        this.description = description;
        this.name = name;
    }

    public Favoris(String price,  String description, String name) {

        this.price = price;
        this.description = description;
        this.name = name;
    }

    public Favoris(String price ,String name) {

        this.price = price;
        this.name = name;
    }

    public Favoris( String price, int picture, String description, String name) {

        this.price = price;
        this.picture = picture;
        this.description = description;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", category='" + category + '\'' +
                ", picture='" + picture + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
