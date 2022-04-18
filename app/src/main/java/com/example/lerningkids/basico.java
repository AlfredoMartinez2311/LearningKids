package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class basico extends AppCompatActivity {
Button btA;
Button btE;
Button btI;
Button btO;
Button btU;
Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicoo);
        btA=(Button)findViewById(R.id.btnA);
        btA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent letrraA= new Intent(basico.this, VocalA.class);
                startActivity(letrraA);
            }
        });
        btE=(Button) findViewById(R.id.btnE);
        btE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent letraE=new Intent(basico.this,VocalE.class);
                startActivity(letraE);
            }
        });
        btE=(Button)findViewById(R.id.btnI);
        btE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent letraI= new Intent(basico.this, Vocal_I.class);
                startActivity(letraI);
            }
        });
        btO=(Button)findViewById(R.id.btnO);
        btO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent letraO= new Intent(basico.this, VocalO.class);
                startActivity(letraO);
            }
        });

        btU=(Button) findViewById(R.id.btnU);
        btU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent letraU= new Intent(basico.this, VocalU.class);
                startActivity(letraU);
            }
        });
        salir=(Button)findViewById(R.id.btnmenu);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent atras= new Intent(basico.this, Menu.class);
                startActivity(atras);
            }
        });

    }
}