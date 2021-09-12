package com.example.tp3peliculasvsda;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tp3peliculasvsda.Modelo.Pelicula;

import java.util.ArrayList;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder>{
    private ArrayList<Pelicula> miPeli;
    private Context context;
    private LayoutInflater li;

    public PeliculaAdapter(ArrayList<Pelicula> miPeli, Context context, LayoutInflater li) {
        this.miPeli = miPeli;
        this.context = context;
        this.li = li;
    }

    @NonNull
    @Override
    ///Referencia a la vista item y se lo pasa a ViewHolder
    public PeliculaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= li.inflate(R.layout.item_pelicula, parent, false);
        return new ViewHolder(view);
    }

    @Override
    ///se ejecuta por cada item de la lista
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvTitulo.setText(miPeli.get(position).getTitulo());
        holder.tvResenia.setText(miPeli.get(position).getResenia());
        holder.ivFoto.setImageResource(miPeli.get(position).getFoto());
        final Pelicula peliculasItems = miPeli.get(position);
        holder.btDetalle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent in = new Intent(holder.btDetalle.getContext(), DetalleActivity.class);
                in.putExtra("itemPelis", peliculasItems);
                holder.btDetalle.getContext().startActivity(in);
            }
        });
    }

    @Override
    public int getItemCount() {
        return miPeli.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitulo, tvResenia;
        private ImageView ivFoto;
        private Button btDetalle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo= itemView.findViewById(R.id.tvTitulo);
            tvResenia=itemView.findViewById(R.id.tvResenia);
            ivFoto=itemView.findViewById(R.id.ivFoto);
            btDetalle=itemView.findViewById(R.id.btDetalle);
        }

    }
}
