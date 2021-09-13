package com.example.tp3peliculasvsda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tp3peliculasvsda.Modelo.Pelicula;

public class DetalleActivity extends AppCompatActivity {
    private TextView tvTitulo2, tvDetalle2;
    private ImageView ivFoto2;
    private Pelicula pelicula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        inicializar();
        pelicula= (Pelicula) getIntent().getExtras().getSerializable("itemPelis");
        ivFoto2.setImageResource(pelicula.getFoto());
        ObtenerDatos();
    }
    public void inicializar(){
        tvTitulo2=findViewById(R.id.tvTitulo2);
        tvDetalle2= findViewById(R.id.tvDetalle2);
        ivFoto2= findViewById(R.id.ivFoto2);
    }
    public void ObtenerDatos(){

        tvTitulo2.setText("Titulo: "+pelicula.getTitulo()+"\nDirector: "+pelicula.getDirector());
        tvDetalle2.setText(pelicula.getResenia()+ "\nActores: "+pelicula.getActor());
    }
}
