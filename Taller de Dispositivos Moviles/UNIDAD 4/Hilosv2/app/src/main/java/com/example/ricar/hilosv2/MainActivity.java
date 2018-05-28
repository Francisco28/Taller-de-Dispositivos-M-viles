package com.example.ricar.hilosv2;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    //Button button4;

    ProgressBar progressBar1;
    ProgressBar progressBar2;
    ProgressBar progressBar3;

    EditText editText;
    EditText editText2;
    EditText editText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        //button3 = (Button) findViewById(R.id.button3);
        //button4 = (Button) findViewById(R.id.button4);


        progressBar1 = (ProgressBar) findViewById(R.id.progressBar);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
        //progressBar3 = (ProgressBar) findViewById(R.id.progressBar3);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        //editText3 = (EditText) findViewById(R.id.editText3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        //button3.setOnClickListener(this);

    }

    private void UnSegundo() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




    public void hilos() {

        new Thread(new Runnable() {
            @Override
            public void run() {

               // String a = editText.getText().toString();
               // int ax = new Integer(a).intValue();

                for (int i = 1; i <= Integer.parseInt(editText.getText().toString()) ; i++) {
                    UnSegundo();
                    progressBar1.setMax(20);
                    progressBar1.setProgress(i);

                }

               // Toast.makeText(getBaseContext(), "Segundos: "+ editText.getText().toString() , Toast.LENGTH_LONG).show();
            }
        }).start();
    }


    public void hilos2() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= Integer.parseInt(editText2.getText().toString()); i++) {
                    UnSegundo();
                    progressBar2.setMax(20);
                    progressBar2.setProgress(i);
                }

               // Toast.makeText(getBaseContext(), "Segundos: "+ editText2.getText().toString() , Toast.LENGTH_LONG).show();

            }
        }).start();
    }

/*
    public void hilos3() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= Integer.parseInt(editText3.getText().toString()); i++) {
                    UnSegundo();
                    progressBar3.setMax(20);
                    progressBar3.setProgress(i);
                }

               // Toast.makeText(getBaseContext(), "Segundos: "+ editText3.getText().toString() , Toast.LENGTH_LONG).show();

            }
        }).start();
    }*/

    public void fibbonaci(){

    }


    @Override
    public void onClick(View v) {

        int i;
        switch (v.getId()) {

            case R.id.button:
                hilos();
                break;
            case R.id.button2:
                hilos2();
                break;
           // case R.id.button3:
                //AsyncTarea asyncTarea = new AsyncTarea();
                //asyncTarea.execute();
           //     hilos3();
           //     break;
            default:
                break;
        }


    }
/*
    private class  AsyncTarea extends AsyncTask<Void, Integer,Boolean> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar3.setMax(1000);
        }

        @Override
        protected Boolean doInBackground(Void... params) {

            for (int i=1; i<10; i++){
                UnSegundo();
                publishProgress(i*10);

                if (isCancelled()){
                    break;
                }
            }
            return true;
        }


        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            //Actualizar la barra de progreso
           progressBar3.setProgress(values[0].intValue());
        }

        @Override
        protected void onPostExecute(Boolean aVoid) {
            //super.onPostExecute(aVoid);

            if (aVoid){
               // Toast.makeText(getApplicationContext(),"Tarea finaliza AsyncTask",Toast.LENGTH_SHORT).show();
            }
        }


        @Override
        protected void onCancelled() {
            super.onCancelled();

           // Toast.makeText(getApplicationContext(),"Tarea NO finaliza AsyncTask",Toast.LENGTH_SHORT).show();

        }


    }*/
}
