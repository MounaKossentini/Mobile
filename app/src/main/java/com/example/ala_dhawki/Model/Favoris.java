package com.example.ala_dhawki.Model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "favoris")
public class Favoris {

    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Favoris(){}

    @Override
    public String toString() {
        return "Favoris{" +
                "id=" + id +
                '}';
    }
}
