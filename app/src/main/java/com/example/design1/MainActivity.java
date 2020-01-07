package com.example.design1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView v1=findViewById(R.id.imageView);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bar= new Intent (MainActivity.this, Second.class);
                startActivity(bar);
            }
        });
        SpannableStringBuilder spannable = new SpannableStringBuilder("Text is spantastic!");
        spannable.setSpan(
                new ForegroundColorSpan(Color.RED),
                8, // start
                12, // end
                Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        );
    }
}
