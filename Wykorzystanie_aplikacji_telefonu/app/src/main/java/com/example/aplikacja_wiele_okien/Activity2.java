package com.example.aplikacja_wiele_okien;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends Activity implements View.OnClickListener {
    EditText dataReceived;
    Button btnDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        dataReceived = (EditText) findViewById(R.id.etDataReceived);
        btnDone = (Button) findViewById(R.id.btnDone);
        btnDone.setOnClickListener(this);
        Intent myLocalIntent = getIntent();
        Bundle myBundle = myLocalIntent.getExtras();
        Double v1 = myBundle.getDouble("val1");
        Double v2 = myBundle.getDouble("val2");
        Double vResult = v1 + v2;
        dataReceived.setText("Data received is \n"
                + "val1= " + v1 + "\nval2= " + v2
                + "\n\nresult= " + vResult);
        myBundle.putDouble("vresult", vResult);
        myLocalIntent.putExtras(myBundle);
        setResult(Activity.RESULT_OK, myLocalIntent);
    }
    @Override
    public void onClick(View v) {
        finish();
    }
}