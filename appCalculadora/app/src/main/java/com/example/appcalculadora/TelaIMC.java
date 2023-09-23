package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaIMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_imc);

        EditText edAltura = findViewById(R.id.edAltura);
        EditText edPeso = findViewById(R.id.edPeso);
        Button btCalculoImc = findViewById(R.id.btCalculoImc);
        TextView txResultadoImc = findViewById(R.id.txResultadoImc);

        btCalculoImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double VarAltura = Double.parseDouble(edAltura.getText().toString());
                Double VarPeso = Double.parseDouble(edPeso.getText().toString());

                Double IMC = VarAltura / VarPeso * VarPeso;
                txResultadoImc.setText(IMC);

            }
        });
    }
}