package com.example.pablo.a211persistenciabsica5;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etEMAIL;
    private RadioGroup gender;
    private CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_save=(Button) findViewById(R.id.btn_save);
        Button btn_get=(Button) findViewById(R.id.btn_get);

        Spinner spinner = (Spinner) findViewById(R.id.sp_zodiac);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.zodiac_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        etEMAIL = (EditText)findViewById(R.id.et_email);
        gender = (RadioGroup) findViewById(R.id.radioGroup);
        checkBox = (CheckBox) findViewById(R.id.ckb_coding);
        checkBox = (CheckBox) findViewById(R.id.ckb_writing);
        checkBox = (CheckBox) findViewById(R.id.ckb_jogging);



        cargarPreferencias();
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardarPreferencias();
            }
        });

        btn_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarPreferencias();
            }
        });
    }

    public void cargarPreferencias() {
        SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        String mail=preferences.getString("mail","No existe el dato");

        etEMAIL.setText(mail);

    }



    public void onCLick(View view){
        switch(view.getId()){
            case R.id.btn_save:
                guardarPreferencias();
                break;
            case R.id.btn_get:
                cargarPreferencias();
                break;
        }
    }

    public void guardarPreferencias(){
        SharedPreferences preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);

        String mail=etEMAIL.getText().toString();
        boolean checked = ((RadioGroup))

        SharedPreferences.Editor editor= preferences.edit();
        editor.putString("mail",mail);

        etEMAIL.setText(mail);

        editor.commit();

    }
}
