package com.example.asmt_ta2_desafio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    FloatingActionMenu actionMenu;
    FloatingActionButton actionButtonC;
    FloatingActionButton actionButtonV;
    FloatingActionButton actionButtonM;
    FloatingActionButton actionButtonG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionMenu = (FloatingActionMenu)findViewById(R.id.fabPrincipal);
        actionMenu.setClosedOnTouchOutside(true);

        actionButtonC = (FloatingActionButton)findViewById(R.id.fabCalendario);
        actionButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Calendario.class);
                startActivity(i);
            }
        });

        actionButtonV = (FloatingActionButton)findViewById(R.id.fabVideo);
        actionButtonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Video.class);
                startActivity(a);
            }
        });

        actionButtonM = (FloatingActionButton)findViewById(R.id.fabMapa);
        actionButtonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(a);
            }
        });

        actionButtonG = (FloatingActionButton)findViewById(R.id.fabGrafico);
        actionButtonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Grafico.class);
                startActivity(a);
            }
        });


    }

}
