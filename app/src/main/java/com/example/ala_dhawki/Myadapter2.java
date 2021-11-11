package com.example.ala_dhawki;

import android.content.Context;
import android.view.LayoutInflater;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.ala_dhawki.Database.AppDatabase;
import com.example.ala_dhawki.Model.Favoris;
import com.example.ala_dhawki.Model.Product;

import java.util.List;

public class Myadapter2 extends RecyclerView.Adapter<Myadapter2.MyViewHolder>  {
    private List<Favoris> favorises;
    private Context myContext;
    private AppDatabase databasa;


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
        databasa =AppDatabase.getAppDatabase(myContext);
        holder.name.setText(p.getName());
        holder.price.setText(p.getPrice());
        holder.picture.setBackgroundResource(p.getPicture());

         holder.details.setOnClickListener(view -> {
            Intent intent = new Intent(myContext, ExtraDetail.class);

            intent.putExtra("name",p.getName());
            intent.putExtra("price",p.getPrice());
            intent.putExtra("picture",p.getPicture());


            myContext.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return favorises.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView picture;
        TextView name;
        TextView price;
        ImageView details;
        ImageView delete;
        //SwipeRefreshLayout refresh;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.picture);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            details = itemView.findViewById(R.id.details);
            delete = itemView.findViewById(R.id.delete);
            //refresh= itemView.findViewById(R.id.refresh);
delete.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
Favoris f = new Favoris();
int id = favorises.get(getAdapterPosition()).getId();

f.setId(id);
databasa.FavorisInterface().deleteFavoris(f);

Toast.makeText(myContext,"Favoris deleted", Toast.LENGTH_SHORT).show();
myContext.getApplicationContext();
        /*refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //databasa.FavorisInterface().getAllfavoris();
                myContext.getApplicationContext();
                 refresh.setRefreshing(false);
            }
        });*/
        }
    }
}
