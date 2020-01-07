package com.example.design1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView v3=findViewById(R.id.imageView7);
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bar= new Intent (Second.this, Third.class);
                startActivity(bar);
            }
        });

        ImageView v4=findViewById(R.id.imageView6);
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bar= new Intent (Second.this, MainActivity.class);
                startActivity(bar);
            }
        });
    }
}
