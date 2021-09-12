package com.example.tp3peliculasvsda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tp3peliculasvsda.Modelo.Pelicula;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPeliculas;
    private PeliculaAdapter peliAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPeliculas=findViewById(R.id.rvPeliculas);
        GridLayoutManager glm= new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        rvPeliculas.setLayoutManager(glm);
        peliAdapter= new PeliculaAdapter(miLista(), this, getLayoutInflater());
        rvPeliculas.setAdapter(peliAdapter);
    }

    public ArrayList<Pelicula> miLista(){
        ArrayList<Pelicula>miLista= new ArrayList<>();
        miLista.add(new Pelicula(R.drawable.peli1,
                "Shang-Chi y la leyenda de los diez anillos",
                "El protagonista de 'Shang-Chi y la leyenda " +
                        "de los Diez Anillos', de Marvel Studios, Shang-Chi," +
                        " debe enfrentarse a un pasado que él creía " +
                        "haber dejado atrás cuando se ve atrapado en " +
                        "la red de la misteriosa organización de los " +
                        "Diez Anillos."));
        miLista.add(new Pelicula(R.drawable.peli2, "RON DA ERROR",
                "Cuenta la historia de Barney, un estudiante de secundaria " +
                        "poco popular y de Ron, su nuevo dispositivo andante y " +
                        "parlante, conectado de forma digital, que se supone que " +
                        "debe ser su “Mejor amigo listo para funcionar. Los graciosísimos " +
                        "errores de Ron, con el telón de fondo de la era de las redes sociales, " +
                        "les embarcarán en un viaje lleno de aventuras en el que el " +
                        "chico y el robot experimentarán lo compleja y maravillosa que puede " +
                        "llegar a ser una verdadera amistad."));
        miLista.add(new Pelicula(R.drawable.peli3, "Encanto", "nos narra la" +
                " historia de una familia extraordinaria, los Madrigal, que vive oculta en " +
                "las montañas de Colombia en una casa mágica, en un pueblo vibrante de un " +
                "maravilloso y hechizado lugar llamado Encanto. La magia de Encanto ha bendecido " +
                "a todos los niños y niñas de la familia con un don único, desde superfuerza" +
                " hasta poderes curativos. A todos menos a Mirabel. Pero cuando descubre que " +
                "la magia que rodea Encanto está en peligro, Mirabel decide que ella, la " +
                "única Madrigal normal y corriente, quizá sea la última esperanza de su " +
                "extraordinaria familia."));
        miLista.add(new Pelicula(R.drawable.peli4, "Eternals", " La historia épica," +
                " que abarca miles de años, presenta a un grupo de héroes inmortales que se ve " +
                "obligado a salir de las sombras para reunirse contra el enemigo más antiguo de la " +
                "humanidad: los Desviantes."));
        return miLista;

    }
}