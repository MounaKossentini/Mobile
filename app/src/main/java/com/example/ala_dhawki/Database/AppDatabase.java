package com.example.ala_dhawki.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.ala_dhawki.DAO.FavorisInterface;
import com.example.ala_dhawki.DAO.UserInterface;
import com.example.ala_dhawki.Model.Cart;
import com.example.ala_dhawki.Model.Favoris;
import com.example.ala_dhawki.Model.Order;
import com.example.ala_dhawki.Model.Product;
import com.example.ala_dhawki.Model.User;

@Database(entities = {User.class, Product.class, Order.class, Cart.class, Favoris.class} , version=1,exportSchema = false )
public abstract class AppDatabase extends RoomDatabase {

    private static  AppDatabase instance;
    public abstract UserInterface UserInterface();
    public abstract FavorisInterface FavorisInterface();
    public static AppDatabase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "ALA_DHAWKI")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
