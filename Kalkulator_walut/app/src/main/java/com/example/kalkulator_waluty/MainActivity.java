package com.example.kalkulator_waluty;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.view.inputmethod.EditorInfo;
        import android.widget.Button;
        import android.widget.EditText;
        import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    DecimalFormat usaDf = new DecimalFormat("###,###,###,###.##");

    private final double zloty_na_dolar = 0.26;
    private final String zloty = " PLN";

    private final double frank_na_dolar = 1.08;
    private final String frank = " CHF";

    Button konwersja;
    Button wyczysc;
    EditText dolary;
    EditText zlotowki;
    EditText franki;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dolary = (EditText)findViewById(R.id.dolary);
        zlotowki = (EditText)findViewById(R.id.zlotowki);
        franki = (EditText)findViewById(R.id.franki);

        wyczysc = (Button)findViewById(R.id.wyczysc);
        wyczysc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("TAG", "Czyszczenie");
                franki.setText("");
                zlotowki.setText("");
                dolary.setText("");
            }
        });

        konwersja = (Button) findViewById(R.id.konwersja);
        konwersja.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String usdStr = dolary.getText().toString();
                    double usd = Double.parseDouble(usdStr);
                    String zloty_1 = String.valueOf(usaDf.format(usd / zloty_na_dolar)) + zloty;
                    String frank_1 = String.valueOf(usaDf.format(usd / frank_na_dolar)) + MainActivity.this.frank;
                    zlotowki.setText(zloty_1);
                    franki.setText(frank_1);
                } catch (NumberFormatException e) {
                }
            }
        });
    }
}