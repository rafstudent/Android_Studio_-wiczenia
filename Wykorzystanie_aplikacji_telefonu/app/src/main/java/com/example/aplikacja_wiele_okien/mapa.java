package com.example.aplikacja_wiele_okien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mapa extends AppCompatActivity {

    EditText dlugosc;
    EditText dlugosc2;
    EditText szerokosc2;
    EditText szerokosc;
    Button mapa_przycisk;
    String dlugosc_1;
    String szerokosc_1;
    String dlugosc_2;
    String szerokosc_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        dlugosc = (EditText) findViewById(R.id.dlugosc);
        szerokosc = (EditText) findViewById(R.id.szerokosc);
        dlugosc2 = (EditText) findViewById(R.id.dlugosc2);
        szerokosc2 = (EditText) findViewById(R.id.szerokosc2);
        mapa_przycisk = (Button) findViewById(R.id.mapa_przycisk);

        mapa_przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dlugosc_1 = dlugosc.getText().toString();
                szerokosc_1 = szerokosc.getText().toString();
                dlugosc_2 = dlugosc2.getText().toString();
                szerokosc_2 = szerokosc2.getText().toString();

                Intent intent = new Intent(
                        android.content.Intent.ACTION_VIEW,
                        Uri.parse(
                                "http://maps.google.com/maps?"
                                        + "saddr=" + dlugosc_1 + "," + szerokosc_1 + "&"
                                        + "daddr=" + dlugosc_2 + "," + szerokosc_2 ));
                startActivity(intent);
            }
        });

    }
}