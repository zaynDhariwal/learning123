package com.example.learning123;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class test extends AppCompatActivity {
    CharSequence match;
    int[] number;
    int[] option;
    ArrayList<Integer> mylist = new ArrayList<>();
    int option1,option2,option3,option4;
    int answer;
    RadioGroup rg;
    RadioButton b1,b2,b3,b4,checkedButton;
    boolean bool1,bool2,bool3,bool4;
    ImageView img;
    TextView txt;
    Button btn,btn2;
    int score=0;
    int total_question=0;
    int checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        rg = findViewById(R.id.rg);
        img = findViewById(R.id.imageView4);
        btn = findViewById(R.id.next);
        b1 = findViewById(R.id.radioButton1);
        b2 = findViewById(R.id.radioButton2);
        b3 = findViewById(R.id.radioButton3);
        b4 = findViewById(R.id.radioButton4);
        txt=findViewById(R.id.textView3);
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(test.this, MainActivity.class);
                intent.putExtra("score", Integer.toString(score));
                intent.putExtra("total", Integer.toString(total_question-1));
                startActivity(intent);
            }
        });
        question();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checked = rg.getCheckedRadioButtonId();
                checkedButton = findViewById(checked);
                CharSequence ans = checkedButton.getText();
                if (ans.charAt(0) == answer) {
                    score++;
                    txt.setText("Your Score :"+score+"/"+total_question);
                }
                else{
                    txt.setText("Your Score :"+score+"/"+total_question);
                }
                rg.clearCheck();
                question();
            }
        });

    }
    public void question() {
        total_question++;
        answer=random();
        setImage(answer);
        mylist.add(answer);
        mylist.add(random());
        mylist.add(random());
        mylist.add(random());
        Collections.shuffle(mylist);
        b1.setText(""+mylist.get(0)+"");
        b2.setText(""+mylist.get(1)+"");
        b3.setText(""+mylist.get(2)+"");
        b4.setText(""+mylist.get(3)+"");
        mylist.clear();

    }
    public int random() {
        Random random = new Random();
        int randomized = random.nextInt(11);
        return randomized;
    }
    public void setImage(int current_id) {
        if(current_id== 1 ) {
            img.setImageResource(R.drawable.one);
        }
        else if(current_id==2) {
            img.setImageResource(R.drawable.two);
        }
        else if(current_id==3) {
            img.setImageResource(R.drawable.three);
        }
        else if(current_id==4) {
            img.setImageResource(R.drawable.four);
        }
        else if(current_id==5) {
            img.setImageResource(R.drawable.five);
        }
        else if(current_id==6) {
            img.setImageResource(R.drawable.six);
        }
        else if(current_id==7) {
            img.setImageResource(R.drawable.seven);
        }
        else if(current_id==8) {
            img.setImageResource(R.drawable.eight);
        }
        else if(current_id==9) {
            img.setImageResource(R.drawable.nine);
        }
        else if(current_id==10) {
            img.setImageResource(R.drawable.ten);
        }
    }
}