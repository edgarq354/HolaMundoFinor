package com.elisoft.holamundofinor;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity implements View.OnClickListener {

    Button bt_guardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        bt_guardar=(Button)findViewById(R.id.bt_guardar);
        bt_guardar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bt_guardar)
        {
            Snackbar.make(v, "Se guardo correctamente", Snackbar.LENGTH_LONG)
                    .setAction("Registro personal", null).show();
        }

    }
}