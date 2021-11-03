package com.example.ala_dhawki.DAO;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.ala_dhawki.Model.Cart;

@Dao
public interface CartInterface {

    @Query("SELECT * FROM cart WHERE id = :id")
    Cart getCartByID(int id);
}
