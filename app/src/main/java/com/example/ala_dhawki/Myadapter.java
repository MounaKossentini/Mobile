package com.example.ala_dhawki;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ala_dhawki.Model.Product;

import java.util.List;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder> {
    private List<Product> products;
    private Context myContext;

    public Myadapter (Context myContext, List<Product> products){
        this.myContext= myContext;
        this.products= products;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myItemView = LayoutInflater
                .from(myContext)
                .inflate(R.layout.prototype,parent,false);
        return new MyViewHolder(myItemView);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Product p = products.get(position);
        holder.name.setText(p.getName());
        holder.price.setText(p.getPrice());
        holder.picture.setBackgroundResource(p.getPicture());
       /* holder.favoris.setOnClickListener(view -> {
            Intent intent = new Intent(myContext, FaActivity.class);

            intent.putExtra("name",p.getName());
            intent.putExtra("price",p.getPrice());
            intent.putExtra("picture",p.getPicture());


            myContext.startActivity(intent);
        });*/
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView picture;
        TextView name;
        TextView price;
        Button detail;
       // ImageView favoris;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            picture = itemView.findViewById(R.id.picture);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
           // favoris = itemView.findViewById(R.id.favoris);

        }
    }


}
