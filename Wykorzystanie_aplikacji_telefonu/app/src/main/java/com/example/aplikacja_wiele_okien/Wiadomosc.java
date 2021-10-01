package com.example.aplikacja_wiele_okien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Wiadomosc extends AppCompatActivity {

    EditText numer;
    EditText wiadomosc_pole;
    Button wyslij;
    String numer_1;
    String wiadomosc_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiadomosc);

        wyslij = (Button)findViewById(R.id.wyslij);
        numer = (EditText) findViewById(R.id.numer);
        wiadomosc_pole = (EditText) findViewById(R.id.wiadomosc_pole);

        wyslij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numer_1 = numer.getText().toString();
                wiadomosc_1 = wiadomosc_pole.getText().toString();

                Intent intent = new Intent(
                       Intent.ACTION_SENDTO,
                        Uri.parse("smsto:" + numer_1));
                intent.putExtra("sms_body",
                        wiadomosc_1);
                startActivity(intent);
            }
        });

    }
}