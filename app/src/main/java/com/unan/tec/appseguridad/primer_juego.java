package com.unan.tec.appseguridad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class primer_juego extends AppCompatActivity {
    ImageButton actI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_juego);

        actI=(ImageButton)findViewById(R.id.sig);

        actI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),segundo_juego.class);
                startActivity(intent);


            }
        });

    }

}
