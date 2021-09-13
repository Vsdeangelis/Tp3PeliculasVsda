package com.example.tp3peliculasvsda;

import android.content.Context;
import android.content.Intent;
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

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder>
{
    private ArrayList<Pelicula> peliculas;
    private Context context;
    private LayoutInflater layoutInflater;

    public PeliculaAdapter(ArrayList<Pelicula> peliculas, Context context, LayoutInflater layoutInflater)
    {
        this.peliculas = peliculas;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public PeliculaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = layoutInflater.inflate(R.layout.item_pelicula, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.txtTitulo.setText(peliculas.get(position).getTitulo());
        holder.ivPortada.setImageResource(peliculas.get(position).getFoto());
        holder.txtResenia.setText(peliculas.get(position).getResenia());

        final Pelicula peliculasItems = peliculas.get(position);
        holder.btnDetalle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent in = new Intent(holder.btnDetalle.getContext(), DetalleActivity.class);
                in.putExtra("itemPelis", peliculasItems);
                holder.btnDetalle.getContext().startActivity(in);
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return peliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView txtTitulo, txtResenia;
        private ImageView ivPortada;
        private Button btnDetalle;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.tvTitulo);
            txtResenia = itemView.findViewById(R.id.tvResenia);
            ivPortada = itemView.findViewById(R.id.ivFoto);
            btnDetalle = itemView.findViewById(R.id.btnDetalle);
        }
    }
}