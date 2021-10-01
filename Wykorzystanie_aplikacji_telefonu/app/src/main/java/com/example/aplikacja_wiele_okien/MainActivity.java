package com.example.aplikacja_wiele_okien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button lista_kontaktow;
    Button wiadomosc;
    Button mapa;
    Button moja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_kontaktow = (Button)findViewById(R.id.lista_kontaktow);
        lista_kontaktow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myData = "content://contacts/people/";
                Intent myActivity2 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(myData));
                startActivity(myActivity2);
            }
        });

        wiadomosc = (Button)findViewById(R.id.wiadomosc);
        wiadomosc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               NewActivity();
            }
        });

        mapa = (Button)findViewById(R.id.mapa);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewActivityMapa();
            }
        });

        moja = (Button)findViewById(R.id.moja);
        moja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewActivityMoja();
            }
        });

    }

    public void NewActivity(){
        Intent intent = new Intent(this, Wiadomosc.class);
        startActivity(intent);
    }

    public void NewActivityMapa(){
        Intent intent = new Intent(this, mapa.class);
        startActivity(intent);
    }

    public void NewActivityMoja(){
        Intent intent = new Intent(this, Moja_aktywnosc.class);
        startActivity(intent);
    }

}