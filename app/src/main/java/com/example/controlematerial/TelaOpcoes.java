package com.example.controlematerial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaOpcoes extends AppCompatActivity {
    private TextView texttelacadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_opcoes);

        getSupportActionBar().hide();
        iniciarComponentes();
        texttelacadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaOpcoes.this,TelaCadastro.class);
                startActivity(intent);
            }
        });
    }

    private void iniciarComponentes(){
        texttelacadastro = findViewById(R.id.texttelacadastro);
    }
}