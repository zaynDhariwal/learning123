package com.example.learning123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageShow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_show);

        Intent intent = getIntent();
        ImageView im=findViewById(R.id.imageView);
        int image = intent.getIntExtra("Image",-1);
        im.setImageResource(image);

    }
}