package com.example.francisco.giroscopio;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    // 01.- Declarar objetos de tipo: Sensor y Sensor Manager
    private Sensor mysensor;
    private SensorManager senman;

    TextView ejex,ejey,ejez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 02.- Habilitar el Servicio de Sensor
        senman = (SensorManager) getSystemService(SENSOR_SERVICE);

        // 03.- Asociar el objeto de tipo sensor al tipo de servicio de
        Sensor
                mysensor=senman.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        // 04.- Crear referencias a elmentos visuales
        ejex = (TextView) findViewById(R.id.ejex);
        ejey = (TextView) findViewById(R.id.ejey);
        ejez = (TextView) findViewById(R.id.ejez);

        // 05.- Registrar un listener para el objeto de tipo SensorManager
        senman.registerListener(this,mysensor,SensorManager.SENSOR_DELAY_NORMAL);


    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        ejex.setText("X:"+event.values[0]);
        ejey.setText("Y:"+event.values[1]);
        ejez.setText("Z:"+event.values[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
