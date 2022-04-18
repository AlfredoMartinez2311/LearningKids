package com.example.lerningkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sesion extends AppCompatActivity {
TextView txtregistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);
        txtregistro=(TextView)findViewById(R.id.txtregistro);
        txtregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e= new Intent(Sesion.this, Registro.class);
                startActivity(e);

            }
        });
        Button btnpasar=(Button) findViewById(R.id.btnpasar);
                btnpasar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent p= new Intent(Sesion.this,Menu.class);
                        startActivity(p);
                    }
                });


    }
}