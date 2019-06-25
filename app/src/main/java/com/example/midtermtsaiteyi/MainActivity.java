package com.example.midtermtsaiteyi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText dollar;
    Button conver;
    TextView cfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dollar = findViewById(R.id.dollar);
        conver = findViewById(R.id.conver);
        cfa = findViewById(R.id.cFA);
    }

    public void converClick(View view){

        String money = dollar.getText().toString();
        Integer dol = Integer.parseInt(money);
        Double converCFA =(double) dol * 586.84;
        String toS = converCFA.toString();
        cfa.setText(toS);

    }
}
