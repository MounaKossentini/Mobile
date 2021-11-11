package com.example.ala_dhawki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ala_dhawki.Database.AppDatabase;
import com.example.ala_dhawki.Model.Favoris;
import com.example.ala_dhawki.Model.Order;

import java.util.List;

public class Myadapter3 extends RecyclerView.Adapter<Myadapter3.MyViewHolder> {
    private List<Order> orders;
    private Context myContext;
    private AppDatabase databasa;

    Myadapter3(Context myContext, List<Order> orders){
        this.myContext= myContext;
        this.orders= orders;
    }

    @NonNull
    @Override
    public Myadapter3.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myItemView = LayoutInflater
                .from(myContext)
                .inflate(R.layout.orderf,parent,false);
        return new Myadapter3.MyViewHolder(myItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter3.MyViewHolder holder, int position) {
        Order p = orders.get(position);
        databasa =AppDatabase.getAppDatabase(myContext);
        holder.name.setText(p.getName());
        holder.price.setText(String.valueOf(p.getPrice()));
        holder.picture.setBackgroundResource(R.drawable.plan_de_travail__31);
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView picture;
        TextView name;
        TextView price;
        ImageView delete;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.picture);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            delete = itemView.findViewById(R.id.delete);

            delete.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Order o = new Order();
            int id = orders.get(getAdapterPosition()).getId();

            o.setId(id);
            databasa.OrderInterface().deleteOrder(o);

            Toast.makeText(myContext,"product deleted", Toast.LENGTH_SHORT).show();
            myContext.getApplicationContext();
        }
    }
}
