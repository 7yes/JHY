package com.example.hellowworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button my_button;
    private TextView my_TextView;
    //mi firts app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_button = findViewById(R.id.boton_cambio);
        my_TextView = findViewById(R.id.my_idTextview);

        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                my_TextView.setTextColor(Color.rgb(0,0,0));
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}