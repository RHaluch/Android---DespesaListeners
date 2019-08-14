package com.example.listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText valorDespesa, numeroPessoas;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorDespesa=findViewById(R.id.valorDespesa);
        numeroPessoas=findViewById(R.id.numeroPessoas);
        resultado=findViewById(R.id.resultado);
    }
    public void calcular(View view) {
        float despesa = Float.parseFloat(valorDespesa.getText().toString());
        float pessoas = Float.parseFloat(numeroPessoas.getText().toString());
        DecimalFormat df = new DecimalFormat("#0.00");
        String saida = df.format(despesa/pessoas)+" R$";
        resultado.setText("Cada pessoa precisa pagar: " + saida);
    }

}
