package com.example.ala_dhawki.DAO;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.ala_dhawki.Model.Checkout;
import com.example.ala_dhawki.Model.Favoris;

@Dao
public interface ChechoutInterface {

    @Insert
    void addCheckout(Checkout c);
}
