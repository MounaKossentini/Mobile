package com.example.ala_dhawki.DAO;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.ala_dhawki.Model.Product;

import java.util.List;

@Dao
public interface ProductInterface {


    @Query("SELECT * FROM product")
    List<Product> getAllProduct();
}
