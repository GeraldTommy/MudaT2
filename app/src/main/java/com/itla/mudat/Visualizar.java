package com.itla.mudat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static com.itla.mudat.MainActivity.*;


public class Visualizar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_visualizar);

        TextView tvNombre1 = (TextView) findViewById(R.id.tvNombre1);
        Bundle b = getIntent().getExtras();

       String dato = b.getString( "Nombre" ).toString();
       tvNombre1.setText(dato);
    }
}
