package com.elisoft.holamundofinor;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Departamento extends AppCompatActivity implements  View.OnClickListener{

    Button bt_siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departamento);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        bt_siguiente=(Button)findViewById(R.id.bt_siguiente);
        bt_siguiente.setOnClickListener(this);

    }

    @Override
    public void onClick(View edgar) {
        if(edgar.getId()==R.id.bt_siguiente){
            startActivity(new Intent(this,Registro.class));
        }
    }
}