package com.example.ala_dhawki.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.ala_dhawki.Model.User;

import java.util.List;

@Dao
public interface UserInterface {

    @Insert
    void addUser(User u);

    @Update
    void updateUser(User u);

    @Query("SELECT * FROM user")
    List<User> getAllUser();

    @Query("SELECT * FROM user WHERE id = :id")
    User getUserByID(int id);


}
