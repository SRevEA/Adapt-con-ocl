package com.example.adaptadores_ocl;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final MediaPlayer lobster = MediaPlayer.create(this, R.raw.lobster);

        Button playSound = (Button) this.findViewById(R.id.btn);

        playSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lobster.start();
            }
        });
      }

    }
