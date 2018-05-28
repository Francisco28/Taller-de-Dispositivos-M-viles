package com.example.francisco.webservices_alumnos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by francisco on 11/04/18.
 */

public class AgregarAlumno extends AppCompatActivity {

    EditText txtNombre, txtDireccion;
    Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_alumno);

        txtNombre = findViewById(R.id.txtNombreAgregar);
        txtDireccion = findViewById(R.id.txtDireccionAgregar);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombre = txtNombre.getText().toString();
                String direccion = txtDireccion.getText().toString();
                new AlumnoAPI().execute("http://10.58.1.42:8080/datos1/insertar_alumno.php",
                        nombre, direccion);

                finish();
            }
        });

    }

}
