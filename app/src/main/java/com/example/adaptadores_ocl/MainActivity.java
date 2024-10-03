package com.example.adaptadores_ocl;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.adaptadores_ocl.Usuario.Usuario;
import com.example.adaptadores_ocl.UsuarioAdaptador.UsuarioAdaptador;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_;
    List<Usuario> listaUsuarios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rcv_ = findViewById(R.id.rcv_);
        Usuario usuario1 = new Usuario( "Azul","Carlos","https://i.kym-cdn.com/entries/icons/original/000/041/497/Blue_Lobster_Meme_Banner_image.jpg");
        Usuario usuario2 = new Usuario( "Rojo con sombrero","Miguel","https://preview.redd.it/4xq4f60vs5d51.png?width=640&crop=smart&auto=webp&s=63c0b545251d068cc5a6ca5f011f46b3b21387db");
        Usuario usuario3 = new Usuario( "Verde","Camilo","https://st2.depositphotos.com/1000693/5730/i/450/depositphotos_57308557-stock-photo-one-live-crayfish.jpg");
        Usuario usuario4 = new Usuario( "Amarillo","Mason","https://i0.wp.com/bdn-data.s3.amazonaws.com/uploads/2021/02/Banana_Yellow-Lobster_2.3.2021_b-1-e1612469474369.jpg?resize=1200%2C752&ssl=1");

        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
        listaUsuarios.add(usuario3);
        listaUsuarios.add(usuario4);

        rcv_.setLayoutManager(new LinearLayoutManager(this));
        rcv_.setAdapter(new UsuarioAdaptador(listaUsuarios, this));

    }
}