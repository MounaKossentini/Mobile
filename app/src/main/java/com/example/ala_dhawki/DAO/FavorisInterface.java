package com.example.ala_dhawki.DAO;

import androidx.room.Query;

import com.example.ala_dhawki.Model.Favoris;

public interface FavorisInterface {

    @Query("SELECT * FROM favoris WHERE id = :id")
    Favoris getFavorisByID(int id);
}
