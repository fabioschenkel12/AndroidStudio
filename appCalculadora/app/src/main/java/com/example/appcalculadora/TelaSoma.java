package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaSoma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_soma);

        EditText edValor1 = findViewById(R.id.edValor1);
        EditText edValor2 = findViewById(R.id.edValor2);
        EditText edValor3 = findViewById(R.id.edValor3);
        Button btCalcular = findViewById(R.id.btCalcular);
        TextView txResultado = findViewById(R.id.txResultado);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer VarValor1 = Integer.parseInt(edValor1.getText().toString());
                Integer VarValor2 = Integer.parseInt(edValor2.getText().toString());
                Integer VarValor3 = Integer.parseInt(edValor3.getText().toString());

                Integer Soma = VarValor1 + VarValor2 + VarValor3;
                txResultado.setText(Soma);
            }
        });
    }
}