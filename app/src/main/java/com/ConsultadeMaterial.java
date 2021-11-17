package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.controlematerial.R;

public class ConsultadeMaterial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultade_material_material);

        getSupportActionBar().hide();
    }
}