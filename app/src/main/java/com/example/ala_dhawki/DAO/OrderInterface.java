package com.example.ala_dhawki.DAO;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.ala_dhawki.Model.Order;

@Dao
public interface OrderInterface {

    @Insert
    void addOrder(Order o);

    @Update
    void updateOrder(Order o);

    @Query("SELECT * FROM orderr WHERE id = :id")
    Order getOrderByID(int id);
}
