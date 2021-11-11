package com.example.ala_dhawki.DAO;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.ala_dhawki.Model.Favoris;
import com.example.ala_dhawki.Model.Order;

import java.util.List;

@Dao
public interface OrderInterface {

    @Insert
    void addOrder(Order o);

    @Query("SELECT * FROM orderr")
    List<Order> getAllOrder();

    @Update
    void updateOrder(Order o);

    @Query("SELECT SUM(price) FROM orderr")
    int CalculTotale();

    @Query("SELECT * FROM orderr WHERE id = :id")
    Order getOrderByID(int id);

    @Delete
    void deleteOrder(Order o);
}
