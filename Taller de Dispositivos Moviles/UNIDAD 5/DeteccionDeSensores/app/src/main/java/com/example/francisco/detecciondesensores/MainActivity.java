package com.example.francisco.detecciondesensores;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView ;
    SensorManager sensorManager ;
    List<Sensor> listaSensores;
    List<String> lista;
    ArrayAdapter<String> adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listview);
        lista  = new ArrayList<String>();
        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

        for(int i=0; i<listaSensores.size(); i++){

            lista .add("Nombre: "+listaSensores.get(i).getName()+
                    "\n"+"RangoMax: "+listaSensores.get(i).getMaximumRange()+
                    "\n"+"RangoMin: "+listaSensores.get(i).getMinDelay()+"\n"
                    +"Power: "+listaSensores.get(i).getPower()+"\n"

                    +"Vendor: "+listaSensores.get(i).getVendor()+"\n"
                    +"Version: "+listaSensores.get(i).getVersion());
        }

        adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, lista);

        listView.setAdapter(adapter);

    }
}
