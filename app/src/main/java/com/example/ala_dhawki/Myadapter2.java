package com.example.ala_dhawki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ala_dhawki.Model.Favoris;
import com.example.ala_dhawki.Model.Product;

import java.util.List;

public class Myadapter2 extends RecyclerView.Adapter<Myadapter2.MyViewHolder>  {
    private List<Favoris> favorises;
    private Context myContext;

    Myadapter2(Context myContext, List<Favoris> favorises){
        this.myContext= myContext;
        this.favorises= favorises;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myItemView = LayoutInflater
                .from(myContext)
                .inflate(R.layout.fa,parent,false);
        return new Myadapter2.MyViewHolder(myItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Favoris p = favorises.get(position);

        holder.name.setText(p.getName());
        holder.price.setText(p.getPrice());
        holder.picture.setBackgroundResource(p.getPicture());
    }

    @Override
    public int getItemCount() {
        return favorises.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView picture;
        TextView name;
        TextView price;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.picture);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);


        }
    }
}
