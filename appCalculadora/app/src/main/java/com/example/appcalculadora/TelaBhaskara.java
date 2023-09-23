package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaBhaskara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_bhaskara);

        EditText edValorA = findViewById(R.id.edValorA);
        EditText edValorB = findViewById(R.id.edValorB);
        EditText edValorC = findViewById(R.id.edValorC);
        Button btCalculoBhask = findViewById(R.id.btCalculoBhask);
        TextView txResultadoBhask = findViewById(R.id.txResultadoBhask);

        btCalculoBhask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer VarValorA = Integer.parseInt(edValorA.getText().toString());
                Integer VarValorB = Integer.parseInt(edValorB.getText().toString());
                Integer VarValorC = Integer.parseInt(edValorC.getText().toString());
                Integer VarDelta = VarValorB * VarValorB - 4 * VarValorA * VarValorC;

                Double Bhaskara1 = -VarValorB + Math.sqrt(VarDelta) / 2 * VarValorA;
                Double Bhaskara2 = -VarValorB - Math.sqrt(VarDelta) / 2 * VarValorA;
                txResultadoBhask.setText("O positivo é "+Bhaskara1+",o negativo é "+Bhaskara2);

            }
        });
    }
}