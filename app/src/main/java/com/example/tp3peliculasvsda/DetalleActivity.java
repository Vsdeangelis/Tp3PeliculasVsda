package com.example.tp3peliculasvsda;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tp3peliculasvsda.Modelo.Pelicula;

public class DetalleActivity extends AppCompatActivity {
    private TextView tvTitulo, tvDetalle;
    private ImageView ivFoto;
    private Pelicula laPeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        inicializar();
        laPeli=(Pelicula) getIntent().getExtras().getSerializable("itemsPelis");
        ObtenerDatos();
    }
    public void inicializar(){
        tvTitulo=findViewById(R.id.tvTitulo);
        tvDetalle= findViewById(R.id.btDetalle);
        ivFoto= findViewById(R.id.ivFoto);
    }
    public void ObtenerDatos(){
        tvTitulo.setText(laPeli.getTitulo());
        tvDetalle.setText(laPeli.getResenia());
        ivFoto.setImageResource(laPeli.getFoto());
    }
}
