package com.example.ala_dhawki.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.ala_dhawki.Model.Favoris;
import com.example.ala_dhawki.Model.User;

import java.util.List;

@Dao
public interface FavorisInterface {

    @Insert
    void addFavoris(Favoris f);

    @Query("SELECT * FROM favoris")
    List<Favoris> getAllfavoris();

    @Query("SELECT * FROM favoris WHERE id = :id")
    Favoris getFavorisByID(int id);
}
