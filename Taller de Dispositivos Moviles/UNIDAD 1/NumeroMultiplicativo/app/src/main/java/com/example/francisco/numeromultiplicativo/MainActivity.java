package com.example.francisco.numeromultiplicativo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvTexto1, tvSalida;
    EditText cajita;
    View boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTexto1 = (TextView) findViewById(R.id.tv1);
        tvSalida = (TextView) findViewById(R.id.tvResultado);
        cajita = (EditText) findViewById(R.id.txtNumero);
        boton = findViewById(R.id.btnCalcular);
        boton.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        String salida;
        int result;
        tvSalida.setText("");
        String valor = cajita.getText().toString();
        int tabla = Integer.parseInt(valor);
        for(int i=1; i<=10; i++){
            result = tabla * i;
            salida = tabla + " X " + i + " = " + result;
            tvSalida.append("\n" + salida);
        }


    }
}
