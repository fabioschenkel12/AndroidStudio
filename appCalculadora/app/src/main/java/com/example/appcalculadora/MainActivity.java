package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declaração dos elementos
        Button btSoma = findViewById(R.id.btSoma);
        Button btIMC = findViewById(R.id.btIMC);
        Button btBhaskara = findViewById(R.id.btBhaskara);
        Button btSair = findViewById(R.id.btSair);

        // acao botao soma
        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TelaSoma = new Intent(getApplicationContext(), TelaSoma.class);
                startActivity(TelaSoma);
            }
        });

        btIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TelaIMC = new Intent(getApplicationContext(), TelaIMC.class);
                startActivity(TelaIMC);
            }
        });

        btBhaskara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent TelaBhaskara = new Intent(getApplicationContext(), TelaBhaskara.class);
                startActivity(TelaBhaskara);
            }
        });

        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishActivity();
            }
        });
    }
}