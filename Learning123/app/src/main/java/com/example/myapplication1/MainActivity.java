package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button[] buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = new Button[26];
        buttons[0] = findViewById(R.id.b1);
        buttons[1] = findViewById(R.id.b2);
        buttons[2] = findViewById(R.id.b3);
        buttons[3] = findViewById(R.id.b4);
        buttons[4] = findViewById(R.id.b5);
        buttons[5] = findViewById(R.id.b6);
        buttons[6] = findViewById(R.id.b7);
        buttons[7] = findViewById(R.id.b8);
        buttons[8] = findViewById(R.id.b9);
        buttons[9] = findViewById(R.id.b10);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        int image = selectImage(view.getId());
        Log.d("NumberMain",Integer.toString(image));
        Intent intent = new Intent(MainActivity.this,ShowImageActivity.class);
        intent.putExtra("Image",image);
        startActivity(intent);
    }

    int selectImage(int id) {
        int image = -1;
        switch (id){

            case R.id.b1:
                image = R.drawable.image1;
                break;
            case R.id.b2:
                image = R.drawable.image2;
                break;
            case R.id.b3:
                image = R.drawable.image3;
                break;
            case R.id.b4:
                image = R.drawable.image4;
                break;
            case R.id.b5:
                image = R.drawable.image5;
                break;
            case R.id.b6:
                image = R.drawable.image6;
                break;
            case R.id.b7:
                image = R.drawable.image7;
                break;
            case R.id.b8:
                image = R.drawable.image8;
                break;
            case R.id.b9:
                image = R.drawable.image9;
                break;
            case R.id.b10:
                image = R.drawable.image10;
                break;

        }
        return image;
    }
}