package com.app.contaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor;
    private TextView saldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor = findViewById(R.id.valor);
        saldo = findViewById(R.id.saldo);

        saldo.setText(String.valueOf(0));
    }

    public void depositar (View view){
        double val = Double.parseDouble(valor.getText().toString());
        double sald = Double.parseDouble(saldo.getText().toString());
        saldo.setText(String.valueOf(sald+=val));
    }

    public void sacar (View view){
        double val = Double.parseDouble(valor.getText().toString());
        double sald = Double.parseDouble(saldo.getText().toString());
        saldo.setText(String.valueOf(sald-=val));
    }
}