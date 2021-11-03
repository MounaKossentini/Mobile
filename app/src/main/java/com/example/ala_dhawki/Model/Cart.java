package com.example.ala_dhawki.Model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "cart")
public class Cart {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "totalprice")
    private float totalprice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    public Cart(){}

    public Cart(int id, float totalprice) {
        this.id = id;
        this.totalprice = totalprice;
    }
}
