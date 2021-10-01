package com.example.moja_aplikacja_b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button numer_1;
    private Button numer_2;
    private Button numer_3;
    private Button numer_4;
    private Button numer_5;
    private Button numer_6;
    private Button numer_7;
    private Button numer_8;
    private Button numer_9;
    private Button numer_0;
    private Button plus;
    private Button minus;
    private Button mnozenie;
    private Button dzielenie2;
    private Button wynik;
    private TextView tekst;
    private TextView tekst2;
    private TextView tekst3;
    private TextView tekst4;
    private TextView tekst5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numer_1 = (Button) findViewById(R.id.numer_1);
        numer_2 = (Button) findViewById(R.id.numer_2);
        numer_3 = (Button) findViewById(R.id.numer_3);
        numer_4 = (Button) findViewById(R.id.numer_4);
        numer_5 = (Button) findViewById(R.id.numer_5);
        numer_6 = (Button) findViewById(R.id.numer_6);
        numer_7 = (Button) findViewById(R.id.numer_7);
        numer_8 = (Button) findViewById(R.id.numer_8);
        numer_9 = (Button) findViewById(R.id.numer_9);
        numer_0 = (Button) findViewById(R.id.numer_0);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        mnozenie = (Button) findViewById(R.id.mnozenie);
        dzielenie2 = (Button) findViewById(R.id.dzielenie2);
        wynik = (Button) findViewById(R.id.wynik);
        tekst = (TextView) findViewById(R.id.tekst);
        tekst2 = (TextView) findViewById(R.id.tekst2);
        tekst3 = (TextView) findViewById(R.id.tekst3);
        tekst4 = (TextView) findViewById(R.id.tekst4);
        tekst5 = (TextView) findViewById(R.id.tekst5);

        numer_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                String zawartosc_tekst2 = (String) tekst2.getText();
                if (zawartosc_tekst2.contains("puste")) {
                    tekst2.setText("1");
                } else
                    tekst4.setText("1");
                tekst.setText(zawartosc_pola + " 1");
            }
        });

        numer_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                String zawartosc_tekst2 = (String) tekst2.getText();
                if (zawartosc_tekst2.contains("puste")) {
                    tekst2.setText("2");
                } else
                    tekst4.setText("2");
                tekst.setText(zawartosc_pola + " 2");
            }
        });

        numer_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                String zawartosc_tekst2 = (String) tekst2.getText();
                if (zawartosc_tekst2.contains("puste")) {
                    tekst2.setText("3");
                } else
                    tekst4.setText("3");
                tekst.setText(zawartosc_pola + " 3");
            }
        });

        numer_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                String zawartosc_tekst2 = (String) tekst2.getText();
                if (zawartosc_tekst2.contains("puste")) {
                    tekst2.setText("4");
                } else
                    tekst4.setText("4");
                tekst.setText(zawartosc_pola + " 4");
            }
        });

        numer_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                String zawartosc_tekst2 = (String) tekst2.getText();
                if (zawartosc_tekst2.contains("puste")) {
                    tekst2.setText("5");
                } else
                    tekst4.setText("5");
                tekst.setText(zawartosc_pola + " 5");
            }
        });

        numer_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                String zawartosc_tekst2 = (String) tekst2.getText();
                if (zawartosc_tekst2.contains("puste")) {
                    tekst2.setText("6");
                } else
                    tekst4.setText("6");
                tekst.setText(zawartosc_pola + " 6");
            }
        });

        numer_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                String zawartosc_tekst2 = (String) tekst2.getText();
                if (zawartosc_tekst2.contains("puste")) {
                    tekst2.setText("7");
                } else
                    tekst4.setText("7");
                tekst.setText(zawartosc_pola + " 7");
            }
        });

        numer_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                String zawartosc_tekst2 = (String) tekst2.getText();
                if (zawartosc_tekst2.contains("puste")) {
                    tekst2.setText("8");
                } else
                    tekst4.setText("8");
                tekst.setText(zawartosc_pola + " 8");
            }
        });

        numer_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                String zawartosc_tekst2 = (String) tekst2.getText();
                if (zawartosc_tekst2.contains("puste")) {
                    tekst2.setText("9");
                } else
                    tekst4.setText("9");
                tekst.setText(zawartosc_pola + " 9");
            }
        });

        numer_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                String zawartosc_tekst2 = (String) tekst2.getText();
                if (zawartosc_tekst2.contains("puste")) {
                    tekst2.setText("0");
                } else
                    tekst4.setText("0");
                tekst.setText(zawartosc_pola + " 0");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                tekst3.setText("+");
                tekst.setText(zawartosc_pola + " +");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                tekst3.setText("-");
                tekst.setText(zawartosc_pola + " -");
            }
        });

        mnozenie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                tekst3.setText("*");
                tekst.setText(zawartosc_pola + " *");
            }
        });

        dzielenie2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zawartosc_pola;
                zawartosc_pola = (String) tekst.getText();
                tekst3.setText("/");
                tekst.setText(zawartosc_pola + " /");
            }
        });

        wynik.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int zmienna_1 = Integer.parseInt(tekst4.getText().toString());
                int zmienna_2 = Integer.parseInt(tekst2.getText().toString());
                double wynik_1 = 0;
                String zawartosc_tekst_3 = (String) tekst3.getText();
                if (zawartosc_tekst_3.contains("+")) {
                    wynik_1 = zmienna_1 + zmienna_2;
                } else if (zawartosc_tekst_3.contains("-")) {
                    wynik_1 = zmienna_2 - zmienna_1;
                } else if (zawartosc_tekst_3.contains("*")) {
                    wynik_1 = zmienna_1 * zmienna_2;
                } else if (zawartosc_tekst_3.contains("/")) {
                    wynik_1 = zmienna_2 / zmienna_1;
                } else
                    wynik_1 = 0;

                String wynik_2 = String.valueOf(wynik_1);
                tekst5.setText("= " + wynik_2);
                tekst.setText("");
                tekst2.setText("puste");
                tekst3.setText("");
                tekst4.setText("");
            }




        });



    }
}