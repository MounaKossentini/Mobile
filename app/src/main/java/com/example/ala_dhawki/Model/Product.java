package com.example.ala_dhawki.Model;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "product")
public class Product {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "price")
    private float price;

    @ColumnInfo(name = "category")
    private String category;

    @ColumnInfo(name = "picture")
    private String picture;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
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

    public Product()
    {
    }

    public Product(int id, float price, String category, String picture, String description, String name) {
        this.id = id;
        this.price = price;
        this.category = category;
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
