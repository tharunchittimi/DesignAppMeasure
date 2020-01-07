package com.example.design1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ImageView v5=findViewById(R.id.imageView5);
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bar= new Intent (Third.this, Second.class);
                startActivity(bar);
            }
        });


    }
}
