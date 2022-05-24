package com.example.learning123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn1 = findViewById(R.id.b1);
        Button btn2 = findViewById(R.id.b2);
        Button btn3 = findViewById(R.id.b3);
        Button btn4 = findViewById(R.id.b4);
        Button btn5 = findViewById(R.id.b5);
        Button btn6 = findViewById(R.id.b6);
        Button btn7 = findViewById(R.id.b7);
        Button btn8 = findViewById(R.id.b8);
        Button btn9 = findViewById(R.id.b9);
        Button btn10 = findViewById(R.id.b10);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int image = -1;
        Intent intent = new Intent(MainActivity2.this, ImageShow.class);
        switch (view.getId()){

            case R.id.b1:
                image = R.drawable.image1;
                intent.putExtra("Image",image);
                startActivity(intent);
                break;
            case R.id.b2:
                image = R.drawable.image2;
                intent.putExtra("Image",image);
                startActivity(intent);
                break;
            case R.id.b3:
                image = R.drawable.image3;
                intent.putExtra("Image",image);
                startActivity(intent);
                break;
            case R.id.b4:
                image = R.drawable.image4;
                intent.putExtra("Image",image);
                startActivity(intent);
                break;
            case R.id.b5:
                image = R.drawable.image5;
                intent.putExtra("Image",image);
                startActivity(intent);
                break;
            case R.id.b6:
                image = R.drawable.image6;
                intent.putExtra("Image",image);
                startActivity(intent);
                break;
            case R.id.b7:
                image = R.drawable.image7;
                intent.putExtra("Image",image);
                startActivity(intent);
                break;
            case R.id.b8:
                image = R.drawable.image8;
                intent.putExtra("Image",image);
                startActivity(intent);
                break;
            case R.id.b9:
                image = R.drawable.image9;
                intent.putExtra("Image",image);
                startActivity(intent);
                break;
            case R.id.b10:
                image = R.drawable.image10;
                intent.putExtra("Image",image);
                startActivity(intent);
                break;

        }

    }
}