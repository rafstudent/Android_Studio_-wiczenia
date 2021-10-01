package com.example.moja_aplikacja_a;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button czerwony;
    private Button niebieski;
    private Button zielony;
    private Button zolty;
    private TextView tekst;
    private Button wieksza;
    private Button mniejsza;
    private Button czcionka_1;
    private Button czcionka_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        czerwony = (Button) findViewById(R.id.czerwony);
        niebieski = (Button) findViewById(R.id.Niebieski);
        zielony = (Button) findViewById(R.id.Zielony);
        zolty = (Button) findViewById(R.id.zolty);
        tekst = (TextView) findViewById(R.id.tekst);
        wieksza = (Button) findViewById(R.id.wieksza);
        mniejsza = (Button) findViewById(R.id.mniejsza);
        czcionka_1 = (Button) findViewById(R.id.czcionka_1);
        czcionka_2 = (Button) findViewById(R.id.czcionka_2);

        czerwony.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tekst.setText("Czerwony");
                tekst.setTextColor(Color.RED);
            }
        });

        niebieski.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tekst.setText("Niebieski");
                tekst.setTextColor(Color.BLUE);
            }
        });

        zielony.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tekst.setText("Zielony");
                tekst.setTextColor(Color.GREEN);
            }
        });

        zolty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tekst.setText("Żółty");
                tekst.setTextColor(Color.YELLOW);
            }
        });

        mniejsza.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tekst.setText("Mniejsza czcionka");
                tekst.setTextSize(20);
            }
        });

        wieksza.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tekst.setText("Większa czcionka");
                tekst.setTextSize(45);
            }
        });

        czcionka_1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            public void onClick(View v) {
                tekst.setText("Typ czcionki 1");
                Typeface typeface = getResources().getFont(R.font.lobster);
                tekst.setTypeface(typeface);
            }
        });

        czcionka_2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            public void onClick(View v) {
                tekst.setText("Typ czcionki 2");
                Typeface typeface = getResources().getFont(R.font.zendots);
                tekst.setTypeface(typeface);
            }
        });
    }
}