package com.example.francisco.numeromultiplicativoseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {
    //Crear referencias a los componentes del Layout
    SeekBar sb;
    TextView tv;
    TextView tvSalida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sb = (SeekBar) findViewById(R.id.sb1);
        //tv = (TextView) findViewById(R.id.tv2);
        tvSalida = (TextView) findViewById(R.id.tvResultado);





        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int numero, boolean b) {
                //tv.setText(i + "");

                String salida;
                int result;
                tvSalida.setText("");
                //String valor = cajita.getText().toString();
                //int tabla = Integer.parseInt(valor);
                for(int i=1; i<=10; i++){
                    result = numero * i;
                    salida = numero + " X " + i + " = " + result;
                    tvSalida.append("\n" + salida);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"started",Toast.LENGTH_SHORT);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {




        }
    });
 }
}
