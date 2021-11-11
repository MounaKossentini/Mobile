package com.example.ala_dhawki.DAO;

import android.content.Intent;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.ala_dhawki.Model.Favoris;

import java.util.List;

@Dao
public interface FavorisInterface {

    @Insert
    void addFavoris(Favoris f);

    @Query("SELECT * FROM favoris")
    List<Favoris> getAllfavoris();

    @Query("SELECT * FROM favoris WHERE id = :id")
    Favoris getFavorisByID(int id);

    @Delete
    void deleteFavoris(Favoris f);



}
